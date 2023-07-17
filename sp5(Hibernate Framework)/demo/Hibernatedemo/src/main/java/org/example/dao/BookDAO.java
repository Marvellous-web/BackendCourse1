package org.example.dao;

import org.example.config.HibernateUtil;
import org.example.modal.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import java.util.List;

public class BookDAO
{
    SessionFactory sf=null;
    public BookDAO()
    {
        sf= HibernateUtil.getSessionFactory();
    }

    public List<Book> getAllBooks(){
        Session session=sf.openSession();
        Query q=session.createQuery("from Book");
        List<Book> books=q.list();
        session.close();
        return books;
    }

    public boolean  addBook(Book book) {
        Session session=sf.openSession();
        session.save(book);
        session.close();
        return true;
    }

    public boolean deleteBook(int x)
    {
        Session session=sf.openSession();
        Book temp=session.get(Book.class,x);
        if(temp!=null)
        {
            Transaction transaction=session.beginTransaction();
            session.delete(temp);
            transaction.commit();
            session.close();
            return true;
        }
        else
        {
            session.close();

            return false;
        }


    }

    public boolean updateBook(Book book)
    {

        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(book);
        transaction.commit();
        session.close();
        return true;
    }

    public Book getbookById(int bkid)
    {
        Session session= sf.openSession();
        Book b= session.get(Book.class,bkid);
        session.close();
        return b;
    }





}
