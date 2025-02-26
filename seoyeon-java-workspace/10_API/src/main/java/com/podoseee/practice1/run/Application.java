package com.podoseee.practice1.run;

import com.podoseee.practice1.controller.BookController;

public class Application{
    public static void main(String[] args) {

        // BookController 메소드 호출을 위해 생성해두기
        BookController bc = new BookController();


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


    }

}
