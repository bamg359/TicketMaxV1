package app.domain;

public class Seat {

    private int seatId;
    private String seatNumber;
    private String seatSector;
    private String isAvailable;

    public Seat(){

    }

    public Seat(int seatId, String seatNumber, String seatSector, String isAvailable) {
        this.seatId = seatId;
        this.seatNumber = seatNumber;
        this.seatSector = seatSector;
        this.isAvailable = isAvailable;
    }


    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
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

    public String isAvailable() {
        return isAvailable;
    }

    public void setAvailable(String available) {
        isAvailable = available;
    }
}
