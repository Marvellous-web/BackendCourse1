package org.example;

import org.example.dao.BookDAO;
import org.example.modal.Book;


import java.util.List;

public class MainMethod {
    public static void main(String[] args) {
        BookDAO bookDAO=new BookDAO();

        List<Book> book_data=bookDAO.getAllBooks();

        for (Book book:book_data) {
            System.out.println(book);
        }

            Book b=new Book();

            b.setBook_name("ABC1");
            b.setBook_auth("HArry1");
            b.setBook_subj("Series1");
            b.setBook_price(100000);
            b.setBook_stock(999);
            System.out.println("Books"+bookDAO.addBook(b));

    //Delete the book
        System.out.println(bookDAO.deleteBook(3));

        System.out.println(bookDAO.deleteBook(8));//give null if id not present
    //Update
        Book result1=bookDAO.getbookById(5);
        System.out.println(result1);

        result1.setBook_price(786);
        result1.setBook_subj("Thank-you");
        System.out.println(bookDAO.updateBook(result1));

        }



    }

