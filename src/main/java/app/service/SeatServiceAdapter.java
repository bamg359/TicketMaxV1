package app.service;

import app.domain.Seat;
import app.service.inputports.SeatServiceInterface;
import app.service.outputports.SeatRepositoryPort;

import java.util.List;

public class SeatServiceAdapter implements SeatServiceInterface {


    private final SeatRepositoryPort seatRepositoryPort;

    public SeatServiceAdapter(SeatRepositoryPort seatRepositoryPort) {
        this.seatRepositoryPort = seatRepositoryPort;
    }


    @Override
    public Seat createSeat(Integer seatId, String seatNumber, String seatSector, String isAvailable) {
        Seat seat = new Seat(seatId, seatNumber, seatSector, isAvailable);
        return seatRepositoryPort.save( seat);
    }

    @Override
    public Seat selectSeatById(int seatId) {
        return null;
    }

    @Override
    public List<Seat> selectAllSeats() {
        return List.of();
    }

    @Override
    public Seat updateSeat(Integer seatId, String seatNumber, String seatSector, String isAvailable) {
        return null;
    }

    @Override
    public void deleteSeat(int seatId) {

    }
}
