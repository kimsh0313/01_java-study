package practice3.mvc.controller;

import practice3.mvc.dto.AniBook;
import practice3.mvc.dto.Book;
import practice3.mvc.dto.CookBook;
import practice3.mvc.dto.Member;

import java.util.Arrays;

public class LibraryManager {
    private Member member; //? 매개변수로 전해주는게 더 낫나? -> 재고관리때문에 Book만 있는게 좋을거같으넫
    private Book[] bList = new Book[5];

    { // 초기화 블록을 이용하여 샘플 데이터 초기화 (복사해가기)
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member member) {
        this.member = member;
    }

    public Member myPage() {
        return this.member;
    }

    public Book[] selectAll() {
        return this.bList;
    }

    public Book[] searchBook(String keyword) {
        Book[] foundBooks = new Book[0];

        for (Book book : bList) {
            if (book.isContainKeyword(keyword)) {
                foundBooks = Arrays.copyOf(foundBooks, foundBooks.length + 1);
                foundBooks[foundBooks.length - 1] = book;
            }
        }
        return foundBooks;
    }

    public int rentBook(int index) {
        int result = 0;
        Book nowBook = bList[index];

        if (nowBook instanceof AniBook aniBook) {
            if (!aniBook.canRent(member)) {
                result = 1;
            }
        } else if (nowBook instanceof CookBook cookBook) {
            cookBook.updateUserCoupon(member);
            result = 2;

        }
        return result;
    }

}
