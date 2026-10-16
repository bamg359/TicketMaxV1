package app.service;

import app.domain.Place;
import app.service.inputports.PlaceServiceInterface;
import app.service.outputports.PlaceRepositoryPort;

import java.util.List;
import java.util.Optional;

public class PlaceServiceAdapter implements PlaceServiceInterface {


    private final PlaceRepositoryPort placeRepositoryPort;

    public PlaceServiceAdapter(PlaceRepositoryPort placeRepositoryPort){
        this.placeRepositoryPort = placeRepositoryPort;
    }

    @Override
    public Place createPlace(Integer placeId, String city, String placeName, String scenaryType) {

        Place place = new Place(placeId ,city, placeName , scenaryType);

        return placeRepositoryPort.savePlace(place);
    }

    @Override
    public Optional<Place> findPlaceById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Place> findAllPlaces() {
        return List.of();
    }

    @Override
    public Place updatePlace(Integer placeId, String city, String placeName, String scenaryType) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
