package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    private String movieId;
    private String movieName,artistName,duration;


    public Movie() {
    }

    public Movie(String movieId, String movieName, String artistName, String duration) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.artistName = artistName;
        this.duration = duration;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId='" + movieId + '\'' +
                ", movieName='" + movieName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
