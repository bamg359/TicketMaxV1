package app.view;

import app.service.helpers.SetSeatStateHelper;
import app.service.inputports.SeatServiceInterface;
import app.service.validators.DataTypeValidator;

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

    }

    public void selectSeatById(int id){

    }

    public void updateSeat(){

    }

    public void deleteSeat(int id){

    }
}
