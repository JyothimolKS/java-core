package com.learning.core.day3session2;

import java.util.*;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private String dateOfPublication;
 
    public Book(int bookId, String title, double price, String author, String dateOfPublication) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }
 
    @Override
    public String toString() {
        return bookId + " " + title + " " + price + " " + author + " " + dateOfPublication;
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, author, dateOfPublication);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(dateOfPublication, book.dateOfPublication);
    }
 
    @Override
    public int compareTo(Book other) {
        return this.author.compareTo(other.author);
    }
}
 
public class D03P0804 {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", "2/2/2020"));
        books.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", "19/5/1997"));
        books.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", "23/11/1984"));
        books.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", "19/11/1984"));
        books.add(new Book(1005, ".Net Platform", 3497.0, "Mark J. Price", "6/3/1984"));
 
        for (Book book : books) {
            System.out.println(book);
        }
    }
}