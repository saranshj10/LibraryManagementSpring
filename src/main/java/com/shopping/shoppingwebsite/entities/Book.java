package com.shopping.shoppingwebsite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books_table")
public class Book {

    @Id
    String bookName;
    String authorName;
    String publishingYear;
    double Price;

    public Book(String bookName, String authorName, String publishingYear, double price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
        Price = price;
    }

    public Book(){}

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public double getPrice() {
        return Price;
    }
}
