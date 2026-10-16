package app.domain;

public class Artist {

    private Integer artistId;
    private String artistName;
    private String isAvailable;


    public Artist() {
    }

    public Artist(Integer artistId, String artistName, String isAvailable) {
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

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }



}
