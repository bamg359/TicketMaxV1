package app.domain;

public class Place {

    private Integer placeId;
    private String city;
    private String placeName;
    private String scenaryType;

    public Place(){

    }

    public Place(Integer placeId, String city, String placeName, String scenaryType) {
        this.placeId = placeId;
        this.city = city;
        this.placeName = placeName;
        this.scenaryType = scenaryType;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getScenaryType() {
        return scenaryType;
    }

    public void setScenaryType(String scenaryType) {
        this.scenaryType = scenaryType;
    }

    //POr ahora porque despues los moveremos de carpeta al service

    public void createPlace(){

    }

    public void selectAllPlaces(){

    }

    public void selectPlaceById(int id){

    }

    public void updatePlace(){

    }

    public void deletePlace(int id){

    }




}
