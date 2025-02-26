package practice1.run;

import practice1.controller.BookController;

import java.awt.print.Book;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookController bc = new BookController();


        System.out.println("-----------1. 기존의 전체 도서 추가---------");
        bc.printAll();



        System.out.println("\n-----------2. 새로운 도서 추가----------");
        System.out.println("도서 이름");
        String title = sc.nextLine();
        System.out.println("저자");
        String author = sc.nextLine();
        System.out.println("출판사");
        String publisher = sc.nextLine();
        System.out.println("출간일(예시 : 2024-12-20) ");
        String publishDate = sc.nextLine();
        System.out.println("가격");
        int price = sc.nextInt();
        sc.nextLine();

        bc.insertBook(title, author, publisher, publishDate, price);



        System.out.println("\n---------3. 5번째 도서 출간일 출력---------");
        bc.printBookPublishDate();


        System.out.println("\n---------4. 도서 검색 ---------");
        System.out.println("검색할 도서를 입력해");
        String searchKeyword = sc.nextLine();
        bc.searchBook(searchKeyword);
    }

}
