package com.seungjoo.practice1.run;

import com.seungjoo.practice1.controller.BookController;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // BookController 메소드 호출을 위해 생성해두기

        BookController bc = new BookController();

        System.out.println("-----------1. 기존의 전체 도서 추가---------");
        bc.printAll();

        System.out.println("\n-----------2. 새로운 도서 추가----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("도서명:");
        String name = sc.nextLine();
        System.out.println("저자명");
        String author = sc.nextLine();
        System.out.println("출판사명");
        String str = sc.nextLine();
        System.out.println("출판일:");
        String publishDate= sc.nextLine();
        System.out.println("가격:");
        int price = sc.nextInt();
        sc.nextLine();

        bc.insertBook(name,author,str,publishDate,price);

        System.out.println("\n---------3. 5번째 도서 출간일 출력---------");

        bc.printBookPublishDate();
        System.out.println("키워드명");
        String key = sc.nextLine();
        bc.searchBook(key);



    }
}
