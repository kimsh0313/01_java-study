package com.sh.practice1.dto;

import java.util.Calendar;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private Calendar publishDate;
    private int pri;

    public Book(){}

    public Book(String title, String author, String publisher, Calendar publishDate, int pri) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.pri = pri;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishDate=" + publishDate +
                ", pri=" + pri +
                '}';
    }
}