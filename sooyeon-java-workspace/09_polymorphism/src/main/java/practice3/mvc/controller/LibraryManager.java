package practice3.mvc.controller;

import practice3.mvc.dto.Book;
import practice3.mvc.dto.Member;

public class LibraryManager {
    private Member member; //멤버를 갖는게 맞아? 매개변수로 전해주는게 더 낫나? -> 재고관리때문에 Book만 있는게 좋을거같으넫
    private Book[] bList = new Book[5];

    public void insertMember(Member member) {
        this.member = member;
    }

    public Member myPage() {
        return this.member;
    }

    public Book[] selectAll(){
        return this.bList;
    }

    public Book[] searchBook(String keyword) {
        //찾는로직
        return this.bList;
    }

    public int rentBook(int index){
        return 0;
    }


}
