package com.kyungbae.practice1.run;

import com.kyungbae.practice1.controller.BookController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookController bc = new BookController();

        System.out.println("--------1. 기존의 전체 도서 추가--------");
        bc.printAll();

        System.out.println();
        System.out.println("--------2. 새로운 도서 추가--------");
        System.out.print("도서명을 입력하시오 : ");
        String newTitle = sc.nextLine();
        System.out.print("저자명을 입력하시오 : ");
        String newAuthor = sc.nextLine();
        System.out.print("출판사명을 입력하시오 : ");
        String newPublisher = sc.nextLine();
        System.out.print("출판일 (2011-12-01과 같이 '-' 구분자를 이용하여 입력하시오) \n>> 입력 : ");
        String newDate = sc.nextLine();
        System.out.print("가격을 입력하시오 : ");
        int newPrice = sc.nextInt();
        sc.nextLine();
        bc.insertBook(newTitle, newAuthor, newPublisher, newDate, newPrice);

        System.out.println();
        System.out.println("--------3. 5번째 도서 출간일 출력--------");
        bc.printBookPublishDate();

        System.out.println();
        System.out.println("--------4. 도서 검색--------");
        System.out.print("검색할 도서명을 입력하시오 : ");
        String searchBook = sc.nextLine();
        bc.searchBook(searchBook);


    }
}
