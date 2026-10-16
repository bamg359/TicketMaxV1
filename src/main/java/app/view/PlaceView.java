package app.view;

import app.service.inputports.PlaceServiceInterface;
import app.service.validators.DataTypeValidator;

public class PlaceView {

    private final PlaceServiceInterface placeServiceInterface;

    public PlaceView(PlaceServiceInterface placeServiceInterface){
        this.placeServiceInterface = placeServiceInterface;
    }


    public void registerPlace(){

        int placeId = DataTypeValidator.validateInt("Cree el id del lugar");
        String city = DataTypeValidator.validateString("Ingrese el nombre de la ciudad");
        String placeName= DataTypeValidator.validateString("Ingrese el nombre del Lugar");
        String scenaryType = DataTypeValidator.validateString("Ingrese el tipo de escenario");

        placeServiceInterface.createPlace(placeId , city, placeName , scenaryType);


    }

    public void showPlaceById(){

    }

    public void showAllPlaces(){

    }

    public void updatePlace(){

    }

    public void deletePlace(){

    }


}
