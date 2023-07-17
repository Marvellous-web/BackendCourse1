package org.example.repository;

import org.example.domain.Movie;


import java.util.List;

public interface MovieRepository {
    public abstract boolean addMovie(Movie movie);
    public abstract List<Movie> getAllMovies();
}

