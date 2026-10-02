package app.repository;

import app.domain.Seat;
import app.service.outputports.SeatRepositoryPort;

import java.util.ArrayList;
import java.util.List;

public class SeatRepositoryAdapter implements SeatRepositoryPort {

    List<Seat> seats = new ArrayList<>();


    @Override
    public Seat save(Seat seat) {
        seats.add(seat);
        return seat;
    }

    @Override
    public Seat selectById(int id) {
        return null;
    }

    @Override
    public List<Seat> selectAllSeats() {
        return List.of();
    }

    @Override
    public Seat updateSeat(Seat seat) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
