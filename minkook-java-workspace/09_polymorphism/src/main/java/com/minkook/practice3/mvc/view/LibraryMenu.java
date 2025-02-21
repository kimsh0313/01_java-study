package com.minkook.practice3.mvc.view;

import com.minkook.practice3.mvc.controller.LibraryManager;
import com.minkook.practice3.mvc.dto.AniBook;
import com.minkook.practice3.mvc.dto.Book;
import com.minkook.practice3.mvc.dto.CookBook;
import com.minkook.practice3.mvc.dto.Member;

import java.util.Scanner;

public class LibraryMenu{

    private LibraryManager lm = new LibraryManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별: ");
        char gender = sc.nextLine().charAt(0);
        char rGender = (gender == 'm' ? '남':'여');

        Member mem = new Member(name,age,rGender);
        lm.insertMember(mem);
        //System.out.println(mem.getName());
        //System.out.println(mem.getAge());
        //System.out.println(mem.getGender());

        // LibraryManager의 insertMember() 메소드에 전달



        /*
        ==== 메뉴 ====	  // 무한 반복 실행
            1.  마이페이지		// LibraryManager의 myPage() 호출한 후 그 결과값 출력
            2. 도서 전체 조회	// LibraryMenu의 selectAll() 호출
            3. 도서 검색		  // LibraryMenu의 searchBook() 호출
            4. 도서 대여하기	// LibraryMenu의 rentBook() 호출
            0. 프로그램 종료하기
        */

        while (true){
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            System.out.print(">>>번호");
            int menu = sc.nextInt();
            sc.nextLine();

            if(menu == 0){
                break;
            }
            if(menu == 1){
                System.out.println("회원이름:"+ lm.myPage().getName());
                System.out.println("회원나이:"+lm.myPage().getAge());
                System.out.println("회원성별:"+lm.myPage().getGender());
                System.out.println("보유쿠폰:"+lm.myPage().getCouponCount());
            }else if(menu == 2){
                selectAll();
            }else if(menu == 3){
                searchBook();
            }else if(menu == 4){
                rentBook();
            }
        }
    }

    public void selectAll() {
        // LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기

        Book[] bList = lm.selectAll();
        for(int i = 0; i < bList.length; i++){
            System.out.println(i + "번도서:" + bList[i].toString());
        }
        // => Book[] bList = lm.selectAll();

        // for문 이용하여 bList의 모든 도서 목록 출력
        // 단, i를 이용하여 인덱스도 같이 출력  대여할 때 도서번호를 알기 위해
        // ex) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
    }

    public void searchBook() {
        // “검색할 제목 키워드 : “ 		>> 입력 받음 (keyword : String)
        System.out.print("키워드:");
        String keyword = sc.nextLine();
        // LibraryManager의 searchBook() 메소드에 전달
        // 그 결과 값을 Book[] 자료형으로 받기
        // => Book[] searchList = lm.searchBook(keyword);
        Book [] searchList = lm.searchBook(keyword);

        // for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
        for(Book s : searchList){
            if(s != null){
                System.out.println(s.getTitle());
            }
        }
    }

    public void rentBook() {
        // 도서 대여를 위해 도서번호를 알아야 된다.
        // => selectAll() 메소드 호출을 통해 도서 리스트 한번 출력 해주고
        selectAll();
        System.out.print("대여할 도서 번호 선택: ");
        int num = sc.nextInt();
        lm.rentBook(num);
        int res = lm.rentBook(num);

        if(res == 0){
            System.out.println("성공적으로 대여되었습니다.");
        }else if(res == 1){
            System.out.println("나이제한으로 대여 불가능입니다.");
        }else if(res == 2){
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.마이페이지를 통해 확인하세요");
        }

        // “대여할 도서 번호 선택 : ” 		>> 입력 받음 (num : int)
        // LibraryManager의 rentBook(num) 메소드에 전달
        // 그 결과 값을 result로 받고 그 result가
        // 0일 경우   “성공적으로 대여되었습니다.” 출력
        // 1일 경우   “나이 제한으로 대여 불가능입니다.” 출력
        // 2일 경우   “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
        //             마이페이지를 통해 확인하세요” 출력
    }
}
