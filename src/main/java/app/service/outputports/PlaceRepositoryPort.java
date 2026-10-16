package app.service.outputports;

import app.domain.Place;

import java.util.List;
import java.util.Optional;

public interface PlaceRepositoryPort {

    Place savePlace(Place place);
    Optional<Place> selectPlaceById(int id);
    List<Place> selectAllPlaces();
    Place updatePlace(Place place);
    void deletePlace(int id);

}
