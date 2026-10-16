package app.service.inputports;

import app.domain.Place;

import java.util.List;
import java.util.Optional;

public interface PlaceServiceInterface {

    Place createPlace(Integer placeId, String city, String placeName, String scenaryType);
    Optional<Place> findPlaceById(int id);
    List<Place> findAllPlaces();
    Place updatePlace(Integer placeId, String city, String placeName, String scenaryType);
    void deleteById(int id);

}
