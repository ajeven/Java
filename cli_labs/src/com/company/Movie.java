package com.company;

public class Movie {
    protected String title;
    protected String genre;

    public Movie (String t, String g) {
        title = t;
        genre = g;
    }

    public String getTitle() {

        return title;
    }
    public String getGenre() {

        return genre;
    }
    public void setTitle(String title) {

        this.title = title;
    }
    public void setGenre(String genre) {

        this.genre = genre;
    }

}
