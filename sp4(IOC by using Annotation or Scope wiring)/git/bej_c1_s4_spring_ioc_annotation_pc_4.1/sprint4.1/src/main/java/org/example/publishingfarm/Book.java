package org.example.publishingfarm;

public class Book {

    public Book() {
    }

    private String book_name,book_id;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public Book(String book_name, String book_id) {
        this.book_name = book_name;
        this.book_id = book_id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_name='" + book_name + '\'' +
                ", book_id='" + book_id + '\'' +
                '}';
    }
}
