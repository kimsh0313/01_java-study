package practice1.controller;

import practice1.dto.Book;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BookController {

    private Book[] list = new Book[5];

    {    // 초기화블럭 (초기에 4개의 도서가 세팅될 수 있도록)
        list[0] = new Book("자바의 정석", "제임스 고슬링", "나무", new GregorianCalendar(2018, 4 - 1, 15), 20000);
        list[1] = new Book("여러분들 성공할꺼에요", "캥거루", "BR", new GregorianCalendar(2019, 6 - 1, 15), 30000);
        list[2] = new Book("API의 모든것", "캥거루", "BR", new GregorianCalendar(2017, 2 - 1, 13), 15000);
        list[3] = new Book("씨언어 프로그래밍", "김절차", "문학동네", new GregorianCalendar(2016, 8 - 1, 30), 10000);
    }

    public BookController() {
    }

    public void printAll() {
        // list배열에 존재하는 Book객체의 정보 출력하는 구문 작성하시오.
        // 1) for loop문 방법
        // 2) for each문 방법 (향상된 for문)
        for (Book book : list) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {

        // 전달된 신규 도서 정보들을 담은 Book객체를 생성하여 list 배열의 마지막 인덱스 자리에 대입하시오.
				
				/*
					* 고려사항
					1. 전달된 출판일이 "XXXX-XX-XX" 형식의 문자열이므로 어떻게 Book객체의 Calendar 타입 필드에 반영시킬건지 고려해보기.
					   Hint. Split 또는 StringTokenizer 와 파싱을 적절히 활용해볼것
					2. 전달된 가격값 또한 문자열 이므로 어떻게 Book객체의 int 타입 필드에 반영시킬건지 고려해보기. 
				*/
        // 날짜 자르기 2011-12-01
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Integer.parseInt(newDate.split("-")[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(newDate.split("-")[1]) - 1);
        cal.set(Calendar.DATE, Integer.parseInt(newDate.split("-")[2]));
        int price = Integer.parseInt(newPrice);
        list[4] = new Book(newTitle, newAuthor, newPublisher, cal, price);
    }

    public void printBookPublishDate() {
        // list 배열의 마지막 도서객체의 출판일 정보 출력하시오.
        // 단, "XXXX년 XX월 XX 출간"과 같은 패턴으로 출력하시오.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
        String str = sdf.format(list[4].getPublishDate().getTime());
        System.out.println(str);
    }

    public void searchBook(String searchTitle) {

        // list배열내의 도서들 중 전달받은 키워드가 도서명으로 포함되어있는 도서 정보 출력 
        // 1) for loop문 방법
        // 2) for each문 방법 (향상된 for문)
        Book[] books = new Book[5];
        for (int i = 0; i < 5; i++) {
            if (list[i].getTitle().contains(searchTitle)) {
                books[i] = list[i];
            }
        }
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public static String convertPublishDate(Calendar publishDate) {
        int year = publishDate.get(Calendar.YEAR);
        int month = publishDate.get(Calendar.MONTH) + 1;
        String stringMonth = convertMonth(month);
        int date = publishDate.get(Calendar.DATE);
        StringBuilder sb = new StringBuilder();
        sb.append(year).append("년").append(stringMonth).append("월").append(date).append("일");
        return sb.toString();
    }

    public static String convertMonth(int month) {
        return month < 10 ? ("0"+month) : String.valueOf(month);
    }

}