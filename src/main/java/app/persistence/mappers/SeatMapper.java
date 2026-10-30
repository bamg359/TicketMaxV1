package app.persistence.mappers;

import app.domain.Seat;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SeatMapper implements RowMapper<Seat>{

    @Override
    public Seat mapRow(ResultSet rs) throws SQLException{

        Seat seat = new Seat();

        seat.setSeatId(rs.getInt("seat_id"));
        seat.setSeatNumber(rs.getString("seat_number"));
        seat.setSeatSector(rs.getString("seat_sector"));
        seat.setAvailable(rs.getString("is_available"));

        return seat;
    }
}
