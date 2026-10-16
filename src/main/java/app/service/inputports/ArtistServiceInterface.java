package app.service.inputports;

import app.domain.Artist;

import java.util.List;
import java.util.Optional;

public interface ArtistServiceInterface {

    Artist createArtist(Integer artistId, String artistName, String isAvailable);
    Optional<Artist> findArtistById(int id);
    List<Artist> findAllArtists();
    Artist updateArtist(Integer artistId, String artistName, String isAvailable);
    void deleteArtist(int id);

}
