package practice1.controller;

import practice1.dto.Book;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BookController {
    private Book[] list = new Book[5];

    {    // 초기화블럭 (초기에 4개의 도서가 세팅될 수 있도록)
        list[0] = new Book("자바의 정석", "제임스 고슬링", "나무", new GregorianCalendar(2018, 4 - 1, 15), 20000);
        list[1] = new Book("여러분들 성공할꺼에요", "캥거루", "BR", new GregorianCalendar(2019, 6 - 1, 15), 30000);
        list[2] = new Book("API의 모든것", "캥거루", "BR", new GregorianCalendar(2017, 2 - 1, 13), 15000);
        list[3] = new Book("씨언어 프로그래밍", "김절차", "문학동네", new GregorianCalendar(2016, 8 - 1, 30), 10000);
    }

    public void printAll() {
        for (Book book : list) {
            if (book == null) {
                return;
            }
            System.out.println(book);
        }
    }

    public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, int price) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                String[] dateToken = newDate.split("-");
                if (dateToken.length != 3) {
                    System.out.println("년도,월,일을 yyyy-MM-dd양식으로 입력하세요.");
                    return;
                }
                Calendar calNewDate = new GregorianCalendar(
                        Integer.parseInt(dateToken[0]),
                        Integer.parseInt(dateToken[1]) - 1,
                        Integer.parseInt(dateToken[2]),
                        0, 0, 0);

                list[i] = new Book(newTitle, newAuthor, newPublisher, calNewDate, price);
                return;
            }

            if (i == list.length - 1) {
                System.out.println("모든 책을 추가했습니다.");
                return;
            }
        }
    }

    public void printBookPublishDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd 출간");

        int lastValidIndex = -1;

        for (int i = list.length - 1; i >= 0; i--) { /// 뒤에서부터 확인하는 게 더 효율적이다 = 바로 인덱스 업데이트 가능, 리스트가 다 차있을 때 유리
            if (list[i] != null) {
                lastValidIndex = i;
                break;
            }
        }
        /*
        for(int i = 0; i<list.length; i++){
            if(list[i] == null){ /// 마지막 인덱스 값 찾기
                lastValidIndex = i-1;
                break;
            }else {
                if(i == list.length-1){
                    lastValidIndex = i;
                }
            }
        }

         */
        if (lastValidIndex == -1) {
            System.out.println("저장된 책이 없습니다.");
            return;
        }
        System.out.println(sdf.format(list[lastValidIndex].getPublishDate().getTimeInMillis()));
    }

    public void searchBook(String searchTitle) {
        boolean found = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getTitle().contains(searchTitle)) {
                System.out.println(list[i]);
                found = true;
            }
            if (i == list.length - 1 && !found) {
                System.out.println("존재하는 책이 없습니다.");
            }
        }
    }

}
