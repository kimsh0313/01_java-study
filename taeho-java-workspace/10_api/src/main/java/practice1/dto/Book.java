package practice1.dto;

import practice1.controller.BookController;

import java.util.Calendar;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private Calendar publishDate;
    private int price;

    public Book() {
    }

    public Book(String title, String author, String publisher, Calendar publishDate, int price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.price = price;
    }

    public Calendar getPublishDate() {
        return publishDate;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        //Book [title=자바의 정석, author=제임스 고슬링, publisher=나무, publishDate=2018년 04월 15일, price=20000]
        String steDate = BookController.convertPublishDate(publishDate);
        return "Book [" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishDate=" + steDate +
                ", price=" + price +
                ']';
    }
}
