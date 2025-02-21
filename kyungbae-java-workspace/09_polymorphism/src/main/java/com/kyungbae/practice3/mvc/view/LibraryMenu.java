package com.kyungbae.practice3.mvc.view;

import com.kyungbae.practice3.mvc.controller.LibraryManager;
import com.kyungbae.practice3.mvc.dto.Book;
import com.kyungbae.practice3.mvc.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별 : ");
        char gender = sc.nextLine().charAt(0);

        Member mem = new Member(name, age, gender);

        lm.insertMember(mem);

        while (true){
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            System.out.print(">> 메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu){
                case 1 :
                    System.out.println(lm.myPage()); break;
                case 2 : selectAll(); break;
                case 3 : searchBook(); break;
                case 4 : rentBook(); break;
                case 0 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
            }

        }
    }

    public void selectAll(){
        Book[] bList = lm.selectAll();
        for (Book arr : bList){
            System.out.println(arr);
        }
    }

    public void searchBook() {
        System.out.println("도서 검색 : ");
        String book = sc.nextLine();
        Book[] searchList = lm.searchBook(book);

        for (Book arr : searchList){
            System.out.println(arr);
        }

    }

    public void rentBook() {
        selectAll();
        System.out.println("대여할 도서 선택 : ");
        int num = sc.nextInt();
        sc.nextLine();
        switch (lm.rentBook(num)) {
            case 0 :
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여 불가능합니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
                break;
        }
    }

}
