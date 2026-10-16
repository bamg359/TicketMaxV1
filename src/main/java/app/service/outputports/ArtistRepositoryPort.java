package app.service.outputports;

import app.domain.Artist;

import java.util.List;
import java.util.Optional;

public interface ArtistRepositoryPort {


    Artist saveArtist(Artist artist);
    Optional<Artist> selectArtistById(int id);
    List<Artist> selectAllArtists();
    Artist updateArtist(Artist artist);
    void deleteArtist(int id);


}
