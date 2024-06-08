package com.librarymanagement.demo.thingies;

public class Movie extends Item {
    private String director;
    private int duration;

    public Movie(int id, String title, int publishedYear, boolean availability, String director, int duration) {
        super(id, title, publishedYear, availability);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
