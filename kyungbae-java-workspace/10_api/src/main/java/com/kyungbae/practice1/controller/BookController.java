package com.kyungbae.practice1.controller;

import com.kyungbae.practice1.dto.Book;

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

    public BookController() {}

    public void printAll(){
        for (Book arr : list){
            if (arr != null) { // 빈 책 제외
                System.out.println(arr);
            }
        }

//        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]);
//        }
    }

    public void insertBook(String newTitle, String newAuthor, String newPublisher
            , String newDate, int newPrice){
        // String newDate 를 Calender 형식으로 변경하기 (yyyy-MM-dd)
        // 1. String newDate 를 숫자별로 split 하기
        String[] date = newDate.split("-"); // date[0] = "yyyy", date[1] = "MM", date[2] = "dd"
        // 2. int형으로 변환해서 int배열에 넣기
        int[] intDate = new int[date.length];
        for (int i = 0; i < date.length; i++) {
            intDate[i] = Integer.parseInt (date[i]);
        }

        // 3. 날짜 대입하기
        Calendar newCal = new GregorianCalendar();
        newCal.set(Calendar.YEAR, intDate[0]);
        newCal.set(Calendar.MONTH, intDate[1]);
        newCal.set(Calendar.DAY_OF_MONTH, intDate[2]);

        for (int i=0; i < list.length; i++) {
            if (list[i] == null) { // 책이 비었을 경우
                list[i] = new Book(newTitle, newAuthor, newPublisher, newCal, newPrice);
            }
        }
    }

    public void printBookPublishDate() {
        System.out.println(list[4].getFormatCal() + " 출간");
    }

    public void searchBook (String searchTitle) {
        for (Book arr : list) {
            if (arr.getTitle().contains(searchTitle)) {
                System.out.println(arr);
            }
        }
    }

}
