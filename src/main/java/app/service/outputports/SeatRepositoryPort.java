package app.service.outputports;

import app.domain.Seat;

import java.util.List;

public interface SeatRepositoryPort {


    public Seat save(Seat seat);
    public Seat selectById(int id);
    public List<Seat> selectAllSeats();
    public Seat updateSeat(Seat seat);
    public void deleteById(int id);
}
