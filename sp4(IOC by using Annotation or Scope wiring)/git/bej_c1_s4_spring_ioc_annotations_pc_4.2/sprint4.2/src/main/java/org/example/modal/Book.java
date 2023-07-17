package org.example.modal;

public class Book {
    private int bookId;
    private String bookName;
    private Author author;

    public Book(int bookId, String bookName, Author author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;

    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author=" + author +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
