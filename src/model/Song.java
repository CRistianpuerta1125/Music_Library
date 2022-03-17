package model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Song {
    private String title;
    private String identifier;
    private Duration duration;
    private Calendar date;
    private String gender;
    private String picture;
    private String description;

    public Song(String title, String identifier, String gender, String picture, String description, Duration duration, int day, int month, int year) {
        this.title = title;
        this.identifier = identifier;
        this.date = new GregorianCalendar(day, month, year);
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

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
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

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Song)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Song songToComparade = (Song) o;

        // Compare the data members and return accordingly
        return Objects.equals(songToComparade.title, this.title);
    }
}
