package org.example.repository;

import org.example.domain.Movie;
import org.example.service.MovieService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepository  {

    @Autowired
    private SessionFactory sessionFactory;

    public boolean addMovie(Movie movie)
    {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(movie);
        transaction.commit();
        session.close();
        return true;

    }

    @Override
    public List<Movie> getAllMovies() {
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("from Movie");
        List<Movie> movie=query.list();
        session.close();
        return movie;
    }

//    public List<Movie> getAllovies()
//    {
//        Session session=sessionFactory.openSession();
//        Query query=session.createQuery("from Movie");
//        List<Movie> movie=query.list();
//        session.close();
//        return movie;
//    }
}
