package practice3.mvc.view;

import practice3.mvc.controller.LibraryManager;
import practice3.mvc.dto.Book;
import practice3.mvc.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("이름  ");
        String name = sc.nextLine();
        System.out.println("나이 ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("성별 ");
        char gender = sc.next().charAt(0);
        lm.insertMember(new Member(name, age, gender));

        int functionNum;
        while (true) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1.  마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            functionNum = sc.nextInt();
            sc.nextLine();

            if (functionNum == 0) {
                return;
            }
            switch (functionNum) {
                case 1:
                    System.out.println(lm.myPage());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
            }
        }

    }

    public void selectAll() {
        for (Book book : lm.selectAll()) {
            if (book == null) {
                return;
            }
            System.out.println(book);
        }
    }

    public void searchBook() {
        System.out.println("검색할 제목");
        String title = sc.nextLine();
        Book[] foundBooks = lm.searchBook(title);

        if (foundBooks.length == 0) {
            System.out.println("검색된 도서가 없습니다.");
        }
        for (Book book : foundBooks) {
            System.out.println(book);
        }
    }

    public void rentBook() {
        System.out.println("도서 번호");
        int bookId = sc.nextInt();

        int result = lm.rentBook(bookId);
        if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if (result == 2) {
            System.out.println("성공적으로 대여되었습니다.");
        }

    }

}
