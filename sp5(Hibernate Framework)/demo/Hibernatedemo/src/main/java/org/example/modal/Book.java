package org.example.modal;

public class Book {

    public String book_name,book_subj,book_auth;
    public int book_id,book_price,book_stock;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_subj() {
        return book_subj;
    }

    public void setBook_subj(String book_subj) {
        this.book_subj = book_subj;
    }

    public String getBook_auth() {
        return book_auth;
    }

    public void setBook_auth(String book_auth) {
        this.book_auth = book_auth;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getBook_price() {
        return book_price;
    }

    public void setBook_price(int book_price) {
        this.book_price = book_price;
    }

    public int getBook_stock() {
        return book_stock;
    }

    public void setBook_stock(int book_stock) {
        this.book_stock = book_stock;
    }

    public Book(String book_name, String book_subj, String book_auth, int book_id, int book_price, int book_stock) {
        this.book_name = book_name;
        this.book_subj = book_subj;
        this.book_auth = book_auth;
        this.book_id = book_id;
        this.book_price = book_price;
        this.book_stock = book_stock;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_name='" + book_name + '\'' +
                ", book_subj='" + book_subj + '\'' +
                ", book_auth='" + book_auth + '\'' +
                ", book_id=" + book_id +
                ", book_price=" + book_price +
                ", book_stock=" + book_stock +
                '}';
    }
}
