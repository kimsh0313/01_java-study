package practice1.dto;

import java.text.SimpleDateFormat;
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

    @Override
    public String toString() {
        /**
         * 그냥 포맷으로 하면 5 -> 05 출력 안됨
         */
        return "Book[" +
                "title=" + title +
                ", author=" + author +
                ", publisher=" + publisher +
               ", publishDate="+ new SimpleDateFormat("yyyy년 MM월 dd일").format(publishDate.getTimeInMillis())+
                ", price=" + price +
                ']';
    }

}
