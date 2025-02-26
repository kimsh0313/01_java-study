package com.kyungbae.practice1.dto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book {

    private String title;           // 도서명
    private String author;          // 저자명
    private String publisher;       // 출판사명
    private Calendar publishDate;   // 출판일
    private int price;              // 가격

    public Book() {}

    public Book(String title, String author, String publisher, Calendar publishDate, int price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Calendar getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Calendar publishDate) {
        this.publishDate = publishDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 날짜 형식 변경 출력
    public String getFormatCal () {
        SimpleDateFormat sdm = new SimpleDateFormat("yyyy년 MM월 dd일");
        return sdm.format(getPublishDate().getTimeInMillis());
    }


    @Override
    public String toString() {

        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishDate=" + getFormatCal() +
                ", price=" + price +
                '}';
    }
}
