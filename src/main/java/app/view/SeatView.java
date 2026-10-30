package app.view;

import app.domain.Seat;
import app.service.helpers.SetSeatStateHelper;
import app.service.inputports.SeatServiceInterface;
import app.service.validators.DataTypeValidator;

import java.util.List;

public class SeatView {


    private final SeatServiceInterface seatServiceInterface;

    public SeatView(SeatServiceInterface seatServiceInterface) {
        this.seatServiceInterface = seatServiceInterface;
    }

    public void createSeat(){

        int id = DataTypeValidator.validateInt("Ingrese el id de la silla");
        String seatNumber = DataTypeValidator.validateString("Ingrese el número de la silla");
        String seatSector = DataTypeValidator.validateString("Ingrese el sector de la silla");
        String seatState = SetSeatStateHelper.getSeatState();

        seatServiceInterface.createSeat(id, seatNumber, seatSector , seatState);
    }

    public void selectAllSeats(){

        List<Seat> seats = seatServiceInterface.selectAllSeats();

        for(Seat seat : seats){
            System.out.println("Id: " +seat.getSeatId()+ "\n" +
                    "Numero de Silla: " + seat.getSeatNumber() +"\n" +
                    "Sector: " + seat.getSeatSector() +"\n" +
                    "Estado: " + seat.isAvailable());
        }

    }

    public void selectSeatById(){
        int id = DataTypeValidator.validateInt("Ingrese el id a consultar");
        Seat seat = seatServiceInterface.selectSeatById(id).orElseThrow();
        System.out.println("Id: " +seat.getSeatId()+ "\n" +
                "Numero de Silla: " + seat.getSeatNumber() +"\n" +
                "Sector: " + seat.getSeatSector() +"\n" +
                "Estado: " + seat.isAvailable());

    }

    public void updateSeat(){

    }

    public void deleteSeat(int id){

    }
}
