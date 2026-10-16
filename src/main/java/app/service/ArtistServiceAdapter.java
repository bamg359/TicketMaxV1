package app.service;

import app.domain.Artist;
import app.service.inputports.ArtistServiceInterface;
import app.service.outputports.ArtistRepositoryPort;

import java.util.List;
import java.util.Optional;

public class ArtistServiceAdapter implements ArtistServiceInterface {

    private final ArtistRepositoryPort artistRepositoryPort;

    public ArtistServiceAdapter(ArtistRepositoryPort artistRepositoryPort){
        this.artistRepositoryPort = artistRepositoryPort;
    }

    @Override
    public Artist createArtist(Integer artistId, String artistName, String isAvailable) {

        Artist artist = new Artist(artistId , artistName , isAvailable);

        return artist;
    }

    @Override
    public Optional<Artist> findArtistById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Artist> findAllArtists() {
        return List.of();
    }

    @Override
    public Artist updateArtist(Integer artistId, String artistName, String isAvailable) {
        return null;
    }

    @Override
    public void deleteArtist(int id) {

    }
}
