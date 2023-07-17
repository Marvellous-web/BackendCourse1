package org.example.service;

import org.example.domain.Movie;


import java.util.List;


public interface MovieService {
    public abstract boolean addMovie(Movie movie);
    public abstract List<Movie> getSongs();
}
