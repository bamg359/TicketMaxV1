package app.domain.enums;

public enum SeatStateEnum {

    IS_AVAILABLE("Disponible"),
    IS_NOT_AVAILABLE("No Disponible"),
    IS_RESERVED("Reservado"),
    IS_OCCUPIED("Ocupado");


    private final String state;

    SeatStateEnum(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }


}
