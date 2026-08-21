package app.domain;

public class Artist {

    private Integer artistId;
    private String artistName;
    private boolean isAvailable;


    public Artist() {
    }

    public Artist(Integer artistId, String artistName, boolean isAvailable) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.isAvailable = isAvailable;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void createArtist(){

    }

    public void selectAllArtist(){

    }

    public void selectArtistById(int id){

    }

    public void updateArtist(){

    }

    public void deleteArtist(int id){

    }


}
