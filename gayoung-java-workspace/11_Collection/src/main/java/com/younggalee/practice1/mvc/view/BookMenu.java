package com.younggalee.practice1.mvc.view;

import com.younggalee.practice1.mvc.controller.BookController;
import com.younggalee.practice1.mvc.dto.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookController bc = new BookController();

    public void mainMenu() {
        while(true){
            System.out.println("===== 메인 메뉴 =====" + "\n" +
                    "1. 새 도서 추가" + "\n" +
                    "2. 도서 전체 조회" + "\n" +
                    "3. 도서 검색 조회" + "\n" +
                    "4. 도서 삭제하기" + "\n" +
                    "0. 프로그램 종료하기" +  "\n" +
                    "메뉴 번호 선택 : ");

            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    insertBook();  // 도서추가
                    break;
                case 2:
                    selectList(); // 전체 조회
                    break;
                case 3:
                    searchBook();  // 도서검색
                    break;
                case 4:
                    deleteBook();  // 도서삭제
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public void insertBook(){

        System.out.print("도서명 : ");
        String title = sc.nextLine();
        System.out.print("저자명 : ");
        String author = sc.nextLine();
        System.out.print("장르번호 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("가격 : ");
        String price = sc.nextLine();

        bc.insertBook(title,author,category,price);

        System.out.println("성공적으로 추가되었습니다.");
    }

    public void selectList(){
        ArrayList<Book> bookList = bc.selecList();

        if(bookList.isEmpty()) {
            System.out.println("존재하는 도서가 없습니다.");
        } else {
            for (Book book : bookList) {
                System.out.println(book.toString());
            }
        }
    }

    public void searchBook() {
        while (true) {
            System.out.println("===== 검색 메뉴 =====" + "\n" +
                    "1. 도서명으로 검색" + "\n" +
                    "2. 저자명으로 검색" + "\n" +
                    "3. 도서명+저자명으로 검색" + "\n" +
                    "0. 뒤로가기" + "\n" +
                    "메뉴 번호 선택 : ");
            int searchMenu = Integer.parseInt(sc.nextLine());
            if (searchMenu == 0){
                mainMenu();
            }

            System.out.print("\n 검색할 키워드 : ");
            String Keyword = sc.nextLine();


                    /*
                        ===== 검색 메뉴 =====
                        1. 도서명으로 검색
                        2. 저자명으로 검색
                        3. 도서명+저자명으로 검색
                        0. 뒤로가기			  다시 mainMenu메소드로 리턴
                        메뉴 번호 선택 :  		>> 입력 받음

                    */
            ArrayList<Book> searchedList = bc.searchBook(Keyword, searchMenu);

            if (searchedList.isEmpty()) {
                System.out.println("검색 결과가 없습니다.");
            } else {
                for (Book book : searchedList) {
                    System.out.println(book.toString());
                }
            }

            // “검색할 키워드 : “ 			>> String 타입으로 입력 받기
            // BookController의 searchBook으로 메뉴번호와 함께 전달하며 호출 한 후 ArrayList돌려받기

            // 해당 리스트가 비어 있을 경우		>> “검색 결과가 없습니다.”출력
            // 해당 리스트가 비어있지 않을 경우	>> for문을 이용하여 검색 도서 출력
        }
    }

    public void deleteBook(){
        // “삭제할 도서명 : “ 				>> String 타입으로 입력 받기
        // “삭제할 저자명 : “				>> String 타입으로 입력 받기
        // BookController의 deleteBook 메소드로 전달하며 호출 한 후 결과 돌려받기

        System.out.print("삭제할 도서명 : ");
        String title = sc.nextLine();
        System.out.print("삭제할 저자명 : ");
        String author = sc.nextLine();

        Boolean result = bc.deleteBook(title, author);

        if (result) {
            System.out.println("성공적으로 삭제되었습니다.");
        } else {
            System.out.println("삭제할 도서가 존재하지 않습니다.");
        }

        // 성공적으로 삭제됐을 경우 		>> “성공적으로 삭제되었습니다.” 출력
        // 삭제할 도서를 찾지 못했을 경우	>> “삭제할 도서가 존재하지 않습니다.”출력
    }


}
