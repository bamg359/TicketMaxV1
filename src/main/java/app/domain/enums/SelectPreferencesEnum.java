package app.domain.enums;

public enum SelectPreferencesEnum {

    VIP("VIP"),
    GENERAL("General"),
    PREFERENCIAL("Preferencial");


    private final String preference;

    SelectPreferencesEnum(String preference){
        this.preference = preference;
    }

    public String getPreference(){
        return this.preference;
    }

}
