package com.seungjoo.practice1.controller;

import com.seungjoo.practice1.dto.Book;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BookController {
    private Book[] list = new Book[5];

    {
        list[0] = new Book("자바의 정석", "제임스 고슬링", "나무", new GregorianCalendar(2018, 4 - 1, 15), 20000);
        list[1] = new Book("여러분들 성공할꺼에요", "캥거루", "BR", new GregorianCalendar(2019, 6 - 1, 15), 30000);
        list[2] = new Book("API의 모든것", "캥거루", "BR", new GregorianCalendar(2017, 2 - 1, 13), 15000);
        list[3] = new Book("씨언어 프로그래밍", "김절차", "문학동네", new GregorianCalendar(2016, 8 - 1, 30), 10000);
    }

    public BookController() {
    }


    public void printAll() {
        for (int i = 0; i < 4; i++) {
            System.out.println(list[i].toString());

        }
        int cnt = 0;
        for (Book book : list) {
            if(cnt ==4){
                break;
            }
            System.out.println(book.toString());
            cnt++;
        }


    }

    public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, int newPrice) {
        String[] str = newDate.split("-");
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);
        Calendar calendar = new GregorianCalendar(year, month, day);

        list[4] = new Book(newTitle, newAuthor, newPublisher, calendar, newPrice);
    }

    {

    }

    public void printBookPublishDate() {
        Calendar calendar = list[4].getPublishDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        String format = sdf.format(calendar.getTime()); //캘린더를 Date타입으로 바꿔서 출력
        System.out.println(format);
    }

    public void searchBook(String searchTitle) {

        for (Book book : list) {
            if (book.getTitle().contains(searchTitle)) {
                System.out.println(book.toString());
            }

        }
    }

}



