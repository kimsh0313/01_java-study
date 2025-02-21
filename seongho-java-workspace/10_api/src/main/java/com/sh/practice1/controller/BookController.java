package com.sh.practice1.controller;

import com.sh.practice1.dto.Book;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class BookController {
    Scanner sc = new Scanner(System.in);
    private Book[] list = new Book[5];
    {
        list[0] = new Book("자바의 정석", "제임스 고슬링", "나무", new GregorianCalendar(2018, 4-1, 15), 20000);
        list[1] = new Book("여러분들 성공할꺼에요", "캥거루", "BR", new GregorianCalendar(2019, 6-1, 15), 30000);
        list[2] = new Book("API의 모든것", "캥거루", "BR", new GregorianCalendar(2017, 2-1, 13), 15000);
        list[3] = new Book("씨언어 프로그래밍", "김절차", "문학동네", new GregorianCalendar(2016, 8-1, 30), 10000);

    }
    public BookController(){}

    public void PrintAll(){
        for (int i = 0 ; i<list.length;i++){
            System.out.println(list[i]);
        }
//        for (Book b : list){
//            System.out.println(b);
//        }
    }
    public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, int newPri){
    list[5] = new Book(newTitle,newAuthor,newPublisher,newDate,(int)newPri);
//https://jungmina.com/688
    }
    public void printBookPublishDate(){}
    public void searchBook(String searchTitle){}

}
