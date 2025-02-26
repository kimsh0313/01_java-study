package com.pch.practice1.controller;

import com.pch.practice1.dto.Book;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BookController {
    private Book[] list = new Book[5];

    { 	// 초기화블럭 (초기에 4개의 도서가 세팅될 수 있도록)
        list[0] = new Book("자바의 정석", "제임스 고슬링", "나무", new GregorianCalendar(2018, 4-1, 15), 20000);
        list[1] = new Book("여러분들 성공할꺼에요", "캥거루", "BR", new GregorianCalendar(2019, 6-1, 15), 30000);
        list[2] = new Book("API의 모든것", "캥거루", "BR", new GregorianCalendar(2017, 2-1, 13), 15000);
        list[3] = new Book("씨언어 프로그래밍", "김절차", "문학동네", new GregorianCalendar(2016, 8-1, 30), 10000);
    }

    public BookController() {
    }

    public void printAll(){
        for(Book b : list){
            if(b != null) {
                System.out.println(b.toString());
            }
        }
//        for(int i = 0; i < list.length; i++){
//            if(list[i] != null) {
//                System.out.println(list[i].toString());
//            }
//        }
    }

    public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice){
        Calendar cal = new GregorianCalendar();
        String []date = newDate.split("-");
        cal.set(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
        list[list.length-1] = new Book(newTitle, newAuthor, newPublisher, cal, Integer.parseInt(newPrice));
    }

    public void printBookPublishDate(){
        if(list[list.length-1] != null){
            System.out.println((list[list.length-1].getPublishDate().get(Calendar.YEAR)-1)+"년 "+
                    (list[list.length-1].getPublishDate().get(Calendar.MONTH)+12)%13+"월 " +
                    list[list.length-1].getPublishDate().get(Calendar.DAY_OF_MONTH)+" 출간");
        }
    }

    public void searchBook(String searchTitle){
        for(int i = 0; i<list.length; i++){
            if(list[i] !=null && list[i].getTitle().contains(searchTitle)){
                System.out.println(list[i].toString());
            }
        }

//        for(Book b : list){
//            if(b !=null && b.getTitle().equals(searchTitle)){
//                System.out.println(b.toString());
//            }
//        }
    }
}
