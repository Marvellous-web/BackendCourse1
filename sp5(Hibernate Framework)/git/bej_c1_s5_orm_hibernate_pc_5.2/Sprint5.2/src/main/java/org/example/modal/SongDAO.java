package org.example.modal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class SongDAO {
    SessionFactory sessionFactory;
    public SongDAO()
    {

        sessionFactory= HibernateUtilNew.getSessionFactory();

    }
    public List<Song> getAllSongs(){
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("from Song");
        List<Song> song=query.list();
        session.close();
        return song;
    }
    public boolean addSong(Song song){
        Session session=sessionFactory.openSession();
        session.save(song);
        session.close();
        return true;
    }
    public  boolean deleteSong(int id)
    {
        Session session=sessionFactory.openSession();
        Song song=session.get(Song.class,id);
        if(song!=null)
        {
            Transaction transaction=session.beginTransaction();
            session.delete(song);
            transaction.commit();
            session.close();
            return true;

        }
        else {
            session.close();
            return false;
        }


    }
    public boolean UpdateSong(Song updatesong)
    {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(updatesong);
        transaction.commit();
        session.close();
        return true;
    }

    public Song getSongById(int song_id)
    {
        Session session=sessionFactory.openSession();
        Song song=session.get(Song.class,song_id);
        session.close();
        return song;
    }
}
