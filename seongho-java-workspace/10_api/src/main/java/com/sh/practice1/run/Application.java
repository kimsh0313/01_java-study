package com.sh.practice1.run;

import com.sh.practice1.controller.BookController;
import com.sh.practice1.dto.Book;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Application   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookController bc = new BookController();

        System.out.println("-----------1.기존도서----------");
        bc.PrintAll();
        System.out.println("\n-----------2.도서추가----------");
        System.out.println("도서명 입력:");
        String title = sc.nextLine();
        System.out.println("저자명 입력:");
        String author = sc.nextLine();
        System.out.println("출판사명 입력:");
        String publisher = sc.nextLine();
        System.out.println("출판일 입력(xxxx-xx-xx):");
        String date = sc.nextLine();
        System.out.println("가격 입력:");
        String pri = sc.nextLine();
        bc.insertBook(title,author,publisher,date, Integer.parseInt(pri));
        System.out.println("\n-----------3.5번째 도서 출간일----------");
        System.out.println("\n-----------4.도서검색----------");







        /*        System.out.println("도서명 입력:");
        String title = sc.nextLine();
        System.out.println("저자명 입력:");
        String author = sc.nextLine();
        System.out.println("출판사명 입력:");
        String publisher = sc.nextLine();
        System.out.println("출판일 입력:");
        String date = sc.nextLine();
        System.out.println("가격 입력:");
        int pri = sc.nextInt();
        sc.nextLine();
        insertBook(title,author,publisher,date,pri);


 */

    }
}

