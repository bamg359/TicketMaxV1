package app.domain;

public class Seat {

    private Integer seatId;
    private String seatNumber;
    private String seatSector;
    private boolean isAvailable;

    public Seat(){

    }

    public Seat(Integer seatId, String seatNumber, String seatSector, boolean isAvailable) {
        this.seatId = seatId;
        this.seatNumber = seatNumber;
        this.seatSector = seatSector;
        this.isAvailable = isAvailable;
    }


    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatSector() {
        return seatSector;
    }

    public void setSeatSector(String seatSector) {
        this.seatSector = seatSector;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void createSeat(){

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
