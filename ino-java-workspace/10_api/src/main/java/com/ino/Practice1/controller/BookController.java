package com.ino.Practice1.controller;

import com.ino.Practice1.dto.Book;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BookController {
    Calendar cal = Calendar.getInstance();

    Book[] list = {new Book("자바의 정석", "제임스 고슬링", "나무", cal, 20000)
            , new Book("여러분들 성공할꺼에요", "캥거루", "BR", cal, 30000)
            , new Book("API의 모든것", "캥거루", "BR", cal, 15000)
            , new Book("씨언어 프로그래밍", "김절차", "문학동네", cal, 10000)
            , new Book("씨언어 프로그래밍", "김절차", "문학동네", cal, 10000)};;
    private static int cnt = 0;
    public void printAll() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].toString());
        }
//        for (Book b : list) {
//            System.out.println(b.toString());
//        }
    }
    public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, int newPrice) {
        Calendar c = new GregorianCalendar(Integer.parseInt(newDate.substring(0, 4)), Integer.parseInt(newDate.substring(5, 7)) -1, Integer.parseInt(newDate.substring(8, 10)));
        System.out.println(c);
        Book b = new Book(newTitle, newAuthor, newPublisher, c, newPrice);
        list[cnt++] = b;
    }
    public void printBookPublishDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 출간");
        System.out.println(sdf.format(list[list.length-1].getPublishDate().getTimeInMillis()));
    }
    public void searchBook(String searchTitle){
        for (int i = 0; i < list.length; i++) {
            if (list[i].getTitle().contains(searchTitle)) {
                System.out.println(list[i].toString());;
            }
        }
        for (Book b : list) {
            if (b.getTitle().contains(searchTitle)) {
                System.out.println(b.toString());;
            }
        }
    }
}
