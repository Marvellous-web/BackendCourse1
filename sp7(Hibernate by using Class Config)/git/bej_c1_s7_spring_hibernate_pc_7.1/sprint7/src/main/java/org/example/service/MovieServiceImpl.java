package org.example.service;

import org.example.domain.Movie;
import org.example.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRespository;

//    public boolean addSong(Movie movie)
//    {
//        return movieRespository.addMovie(movie);
//    }

    @Override
    public boolean addMovie(Movie movie) {
        return movieRespository.addMovie(movie);
    }

    public List<Movie> getSongs()
    {
        return movieRespository.getAllMovies();
    }
}
