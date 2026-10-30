package app.service.outputports;

import app.domain.Seat;

import java.util.List;
import java.util.Optional;

public interface SeatRepositoryPort {


    public Seat save(Seat seat);
    public Optional<Seat> selectById(int id);
    public List<Seat> selectAllSeats();
    public Seat updateSeat(Seat seat);
    public void deleteById(int id);
}
