package com.john.practice3.mvc.dto;

public class Book {
    private String title;
    private String author;
    private String publisher;

    public Book() {
    }

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        //0번도서 : 백종원의 집밥 / 백종원 / tvN / true
        return title + " / " + author + " / " + publisher;
    }
}
