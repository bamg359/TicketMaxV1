package app.persistence.repository;

import app.domain.Artist;
import app.service.outputports.ArtistRepositoryPort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArtistRepositoryAdapter implements ArtistRepositoryPort {

    List<Artist> artists = new ArrayList<>();

    @Override
    public Artist saveArtist(Artist artist) {

        artists.add(artist);

        return artist;
    }

    @Override
    public Optional<Artist> selectArtistById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Artist> selectAllArtists() {
        return List.of();
    }

    @Override
    public Artist updateArtist(Artist artist) {
        return null;
    }

    @Override
    public void deleteArtist(int id) {

    }
}
