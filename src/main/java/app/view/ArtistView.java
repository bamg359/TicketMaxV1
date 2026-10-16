package app.view;

import app.service.inputports.ArtistServiceInterface;
import app.service.validators.DataTypeValidator;

public class ArtistView {

    private final ArtistServiceInterface artistServiceInterface;

    public ArtistView(ArtistServiceInterface artistServiceInterface){
        this.artistServiceInterface = artistServiceInterface;
    }

    public void registerArtist(){

        int artistId = DataTypeValidator.validateInt("Ingrese el id del artista");
        String artistName = DataTypeValidator.validateString("Ingrese el Nombre del artista");
        String isAvailable = DataTypeValidator.validateString("Ingrese si esta disponible el artista");

        artistServiceInterface.createArtist(artistId , artistName, isAvailable);

    }

    public void showAllArtist(){

    }

    public void showArtistById(int id){

    }

    public void updateArtist(){

    }

    public void deleteArtist(int id){

    }

}
