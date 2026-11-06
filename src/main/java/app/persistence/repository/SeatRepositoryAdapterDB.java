package app.persistence.repository;

import app.domain.Seat;
import app.persistence.mappers.RowMapper;
import app.service.outputports.SeatRepositoryPort;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SeatRepositoryAdapterDB implements SeatRepositoryPort {


    private final Connection connection;
    private final RowMapper<Seat> rowMapper;

    public SeatRepositoryAdapterDB(Connection connection , RowMapper<Seat> rowMapper){

        this.connection = connection;
        this.rowMapper = rowMapper;
    }


    @Override
    public Seat save(Seat seat) {

        String sql = "Insert into seat (seat_id, seat_number , seat_sector, is_available) VALUES (?,?,?,?)";

        try(PreparedStatement ps = connection.prepareStatement(sql)){


            setSeatParams(ps,seat);
            ps.executeUpdate();

            System.out.println("Se guardado silla con éxito");


        }catch (SQLException e){

            throw new RuntimeException("Error al guardar silla " + e.getMessage());
        }

        return seat;
    }

    @Override
    public Optional<Seat> selectById(int id) {

        String sql = "SELECT * FROM seat WHERE seat_id = ?";

        try(PreparedStatement ps = connection.prepareStatement(sql)){

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                return Optional.of(rowMapper.mapRow(rs));
            }

        }catch (SQLException e){
            throw new RuntimeException("Error al consulta silla con id: " + id + "Mensaje: " + e.getMessage());
        }

        return Optional.empty();
    }

    @Override
    public List<Seat> selectAllSeats() {

        List<Seat> seats = new ArrayList<>();

        String sql = "SELECT * FROM seat";

        try(PreparedStatement ps = connection.prepareStatement(sql)){

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                seats.add(rowMapper.mapRow(rs));
            }

        }catch(SQLException e){
            throw new RuntimeException("Error al consultar sillas " + e.getMessage());
        }

        return seats;
    }

    @Override
    public Seat updateSeat(int seatId, Seat seat) {

        String sql = "UPDATE seat SET seat_number = ?, seat_sector = ?, is_available = ? WHERE seat_id = ?";

        try(PreparedStatement ps = connection.prepareStatement(sql)){

            setSeatParams(ps , seat);
            ps.setInt(4, seatId);
            ps.executeUpdate();

            System.out.println("Silla actualizada con éxito");

        }catch (SQLException e){
            throw new RuntimeException("Erro al actualizar silla con id: "+ seatId + "Mensaje: " + e.getMessage());
        }

        return seat;
    }

    @Override
    public void deleteById(int id) {

        String sql = "DELETE FROM seat WHERE seat_id = ?";

        try(PreparedStatement ps = connection.prepareStatement(sql)){

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Silla eliminada con éxito");

        }catch (SQLException e){
            throw new RuntimeException("Error al eliminar silla con id: " + id + "Mensaje: " + e.getMessage());
        }

    }

    private void setSeatParams(PreparedStatement ps , Seat seat) throws SQLException{
        ps.setInt(1, seat.getSeatId());
        ps.setString(2, seat.getSeatNumber());
        ps.setString(3, seat.getSeatSector());
        ps.setString(4, seat.isAvailable());
    }
}
