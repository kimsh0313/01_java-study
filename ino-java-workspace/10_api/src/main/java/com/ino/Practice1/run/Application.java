package com.ino.Practice1.run;

import com.ino.Practice1.controller.BookController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        BookController bc = new BookController();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("-----------1. 기존의 전체 도서 추가---------");
            // 1. BookController의 printAll 메소드 호출을 통해 전체 도서 정보 확인


            System.out.println("\n-----------2. 새로운 도서 추가----------");
            // 2. 새로이 등록할 도서 정보 입력받기
            //    도서명, 저자명, 출판사명, 출판일(XXXX-XX-XX형식의 문자열로 입력유도), 가격
            //    5개 모두 문자열로 입력받기

            //    BookController의 insertBook 메소드 호출시 입력받은 정보 전달


            System.out.println("\n---------3. 5번째 도서 출간일 출력---------");
            // 3. BookController의 printBookPublishDate 메소드 호출을 통해 마지막 도서의 출판일 확인


            System.out.println("\n---------4. 도서 검색 ---------");
            // 4. 검색할 도서명의 키워드를 입력받고 BookController의 searchBook 메소드 호출시 전달
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    bc.printAll();
                    break;
                case 2:
                    System.out.print("title : ");
                    String title = sc.nextLine();
                    System.out.print("author : ");
                    String author = sc.nextLine();
                    System.out.print("publisher : ");
                    String publisher = sc.nextLine();
                    System.out.print("publishDate : ");
                    String publishDate = sc.nextLine();
                    System.out.print("price : ");
                    int price = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    bc.insertBook(title, author, publisher, publishDate, price);
                    break;
                case 3:
                    bc.printBookPublishDate();
                    break;
                case 4:
                    String search = sc.nextLine();
                    bc.searchBook(search);
            }

        }
    }
}
