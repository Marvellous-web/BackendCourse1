package org.example.publishingfarm;

public class Author {


    public Author() {
    }

    private String auth_name,auth_id;
    private Book book;

    public Author(String auth_name, String auth_id, Book book) {
        this.auth_name = auth_name;
        this.auth_id = auth_id;
        this.book = book;
    }

    public String getAuth_name() {
        return auth_name;
    }

    public void setAuth_name(String auth_name) {
        this.auth_name = auth_name;
    }

    public String getAuth_id() {
        return auth_id;
    }

    public void setAuth_id(String auth_id) {
        this.auth_id = auth_id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "auth_name='" + auth_name + '\'' +
                ", auth_id='" + auth_id + '\'' +
                ", book=" + book +
                '}';
    }
}
