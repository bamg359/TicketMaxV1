package app.service.inputports;

import app.domain.Seat;

import java.util.List;
import java.util.Optional;

public interface SeatServiceInterface {


    public Seat createSeat(Integer seatId, String seatNumber, String seatSector, String isAvailable);
    public Optional<Seat> selectSeatById(int seatId);
    public List<Seat> selectAllSeats();
    public Seat updateSeat(Integer seatId, String seatNumber, String seatSector, String isAvailable);
    public void deleteSeat(int seatId);

}
