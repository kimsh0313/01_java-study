package com.seungjoo.practice3.mvc.view;

import com.seungjoo.practice3.mvc.controller.LibraryManager;
import com.seungjoo.practice3.mvc.dto.AniBook;
import com.seungjoo.practice3.mvc.dto.Book;
import com.seungjoo.practice3.mvc.dto.CookBook;
import com.seungjoo.practice3.mvc.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    private Scanner sc = new Scanner(System.in);

    public LibraryMenu(){}
    public LibraryMenu(LibraryManager lm, Scanner sc) {
        this.lm = lm;
        this.sc = sc;
    }

    public void mainMenu() {

        System.out.println("이름");
        String name  = sc.nextLine();
        System.out.println("나이");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("성별");
        char gender = sc.next().charAt(0);

        Member member = new Member(name, age, gender);
        lm.insertMember(member);







        while(true){
            int num = sc.nextInt();
            sc.nextLine();
            LibraryMenu lmu = new LibraryMenu(lm,sc);
            System.out.println("====메뉴=====");
            if(num == 1){
                System.out.println("1.마이페이지");
                System.out.println(lm.myPage());
            }else if(num == 2){
                System.out.println("2.도서 전체 조회");
                lmu.selectAll();
            }else if(num == 3){
                System.out.println("3.도서 검색");
                lmu.searchBook();
            } else if (num == 4) {
                System.out.println("4.도서 대여하기");
                lmu.rentBook();
            } else if (num == 0) {
                System.out.println("프로그램 종료하기");
                break;
            }
        }

    }
    public void selectAll(){
        Book[] bList = lm.selectAll();
        for(int i = 0; i < bList.length; i++){
            if(bList[i] instanceof CookBook){
                System.out.println(i + "번도서 : " + bList[i].getTitle() + " / " + bList[i].getAuthor() + " / " + bList[i].getPublisher() + " / " + ((CookBook)bList[i]).getCoupon());
        }else if(bList[i] instanceof AniBook){
                System.out.println(i + "번도서 : " + bList[i].getTitle() + " / " + bList[i].getAuthor() + " / " + bList[i].getPublisher() + " / " + ((AniBook)bList[i]).getAccessAge());

            }
        }

        }


        public void searchBook(){
            String keyword = sc.nextLine();
            Book[] searchList = lm.searchBook(keyword);
            for(Book s : searchList){
                System.out.println(s);
            }
        }
        public void rentBook(){
            selectAll();
            System.out.print("대여할 도서 번호 선택 : ");
            int num = sc.nextInt();
            sc.nextLine();
            int result = lm.rentBook(num);
            if(result == 0){
                System.out.println("성공적으로 대여되었습니다.");
            } else if (result == 1) {
                System.out.println("나이 제한으로 대여 불가능입니다.");

            }else{
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
                System.out.println("마이페이지를 통해 확인하세요.");
                }

        }







    }





















