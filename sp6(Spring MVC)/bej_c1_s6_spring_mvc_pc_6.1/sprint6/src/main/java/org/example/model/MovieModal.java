package org.example.model;

public class MovieModal {
private int id; private float movie_rating;
private String movie_name,movie_year;

    public MovieModal() {
    }

    public MovieModal(int id, float movie_rating, String movie_name, String movie_year) {
        this.id = id;
        this.movie_rating = movie_rating;
        this.movie_name = movie_name;
        this.movie_year = movie_year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMovie_rating() {
        return movie_rating;
    }

    public void setMovie_rating(float movie_rating) {
        this.movie_rating = movie_rating;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_year() {
        return movie_year;
    }

    public void setMovie_year(String movie_year) {
        this.movie_year = movie_year;
    }

    @Override
    public String toString() {
        return "MovieModal{" +
                "id=" + id +
                ", movie_rating=" + movie_rating +
                ", movie_name='" + movie_name + '\'' +
                ", movie_year='" + movie_year + '\'' +
                '}';
    }
}
