package app.persistence.repository;

import app.domain.Place;
import app.service.outputports.PlaceRepositoryPort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlaceRepositoryAdapter implements PlaceRepositoryPort {

    List<Place> places = new ArrayList<>();

    @Override
    public Place savePlace(Place place) {

        places.add(place);

        return place;
    }

    @Override
    public Optional<Place> selectPlaceById(int id) {

        for(Place place: places){
            if(place.getPlaceId() == id){
                return Optional.of(place);

            }
        }

        return Optional.empty();
    }

    @Override
    public List<Place> selectAllPlaces() {
        return places;
    }

    @Override
    public Place updatePlace(Place place) {

        places.set( 1, place);
        return place;
    }

    @Override
    public void deletePlace(int id) {

    }
}
