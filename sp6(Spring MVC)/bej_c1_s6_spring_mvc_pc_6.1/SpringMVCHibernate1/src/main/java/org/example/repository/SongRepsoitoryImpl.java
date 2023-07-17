package org.example.repository;

import org.example.domain.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SongRepsoitoryImpl implements SongRespository {

    @Autowired
    private SessionFactory sessionFactory;

    public boolean addSong(Song song)
    {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(song);
        transaction.commit();
        session.close();
        return true;

    }
    public List<Song> getAllSongs()
    {
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("from Song");
        List<Song> songs=query.list();
        session.close();
        return songs;
    }
}
