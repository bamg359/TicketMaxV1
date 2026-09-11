package app.domain.enums;

public enum SelectStateEnum {


    ACTIVE("Activo"),
    INACTIVE("Inactivo"),
    BLOCKED("Bloqueado");


    private final String state;

    SelectStateEnum(String state) {
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

}
