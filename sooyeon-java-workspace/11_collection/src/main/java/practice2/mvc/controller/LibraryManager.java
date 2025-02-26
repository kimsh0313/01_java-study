package practice2.mvc.controller;

import practice2.mvc.dto.AniBook;
import practice2.mvc.dto.Book;
import practice2.mvc.dto.CookBook;
import practice2.mvc.dto.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryManager {
    private Member member;
    private List<Book> bookList = new ArrayList<>();

    public void insertMember(String name, int age, char gender) {
        this.member = new Member(name, age, gender);
    }

    public Member getMember() {
        return this.member;
    }

    public void updateMember(String name, int age, char gender) {
        this.member = new Member(name, age, gender);
    }

    public List<Book> selectAll() {
        return this.bookList;
    }

    public List<Book> searchBook(String keyword) {
        List<Book> result = new ArrayList<>();

        for (Book book : this.bookList) {
            if (book.getTitle().contains(keyword)) {
                result.add(book);
            }
        }
        return List.copyOf(result);
    }

    public int rentBook(int index) {
        int result = 0;

        Book book = this.bookList.get(index);

        if (book instanceof AniBook aniBook) {
            if (aniBook.getAccessAge() > member.getAge()) {
                result = 1;
            }
        } else if (book instanceof CookBook cookBook) {
            if (cookBook.isCoupon()) {
                member.setCouponCount(member.getCouponCount() + 1);
                result = 2;
            }
        }
        return result;
    }

}
