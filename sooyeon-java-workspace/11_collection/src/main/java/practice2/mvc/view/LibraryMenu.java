package practice2.mvc.view;

import practice2.mvc.controller.LibraryManager;
import practice2.mvc.dto.Book;
import practice2.mvc.dto.Member;

import java.util.List;
import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("이름, 나이, 성별을 입력하세요");
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        char gender = sc.next().charAt(0);
        lm.insertMember(name, age, gender);

        System.out.println("""
                			  	==== 메뉴 ====	  
                				1.  마이페이지		
                				2. 도서 전체 조회	
                				3. 도서 검색		  
                				4. 도서 대여하기	 
                				0. 프로그램 종료하기	
                """);
        int menuNum = sc.nextInt();
        sc.nextLine();

        if (menuNum == 0) {
            return;
        }
        if (menuNum == 1) {
            myPage();
        } else if (menuNum == 2) {
            selectAll();
        } else if (menuNum == 3) {
            searchBook();
        } else if (menuNum == 4) {
            rentBook();
        } else {
            System.out.println("존재하지 않는 기능입니다.");
        }
    }

    public void myPage() {
        Member member = lm.getMember();
        System.out.println(member);

        System.out.println("출력하시겠습니까?(y/n)");
        String answer = sc.nextLine().toLowerCase();
        if (answer.equals("n")) {
            return;
        }
        System.out.println("수정할 이름,나이,성별을 입력하세요");
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        char gender = sc.next().charAt(0);
        lm.updateMember(name, age, gender);
        System.out.println("성공적으로 수정되었습니다.");
    }

    public void selectAll() {
        List<Book> result = lm.selectAll();
        for (int i = 0; i < result.size(); i++) {
            System.out.println(i + "번째 " + result.get(i));
        }
    }

    public void searchBook() {
        System.out.println("검색할 키워드 :");
        String keyword = sc.nextLine();

        List<Book> reuslt = lm.searchBook(keyword);
        if (!reuslt.isEmpty()) {
            for (Book book : reuslt) {
                System.out.println(book);
            }
        } else {
            System.out.println("없음");
        }
    }

    public void rentBook() {
        selectAll();

        System.out.println("대여할 도서 번호 선택 ");
        int searchBookNum = sc.nextInt();
        int rentResult = lm.rentBook(searchBookNum);

        if (rentResult == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        } else if (rentResult == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if (rentResult == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
        }
    }

}
