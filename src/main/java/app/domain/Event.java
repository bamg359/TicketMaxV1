package app.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class Event {

    private Integer eventId;
    private String eventName;
    private Place place;
    private Artist artist;
    private Seat seat;
    private Date eventDate;
    private LocalDateTime eventTime;

    public Event() {
    }

    public Event(Integer eventId, String eventName, Place place, Artist artist, Seat seat, Date eventDate, LocalDateTime eventTime) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.place = place;
        this.artist = artist;
        this.seat = seat;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public LocalDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalDateTime eventTime) {
        this.eventTime = eventTime;
    }


    public void createEvent(){

    }

    public void selectAllEvents(){

    }

    public void selectEventById(int id){

    }

    public void updateEvent(){

    }

    public void deleteEvent(int id){

    }



}
