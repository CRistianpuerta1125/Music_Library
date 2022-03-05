package model;

import java.util.Date;

public class Song {
    private String title;
    private String identifier;
    private Duration duration;
    private Date date;
    private String gender;
    private String picture;
    private String description;

    public Song(String title, String identifier, String gender, String picture, String description, Duration duration) {
        this.title = title;
        this.identifier = identifier;
        this.date = new Date();
        this.gender = gender;
        this.picture = picture;
        this.description = description;
        this.duration = duration;
    }

    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String toString(){
        return title;
    }
}
