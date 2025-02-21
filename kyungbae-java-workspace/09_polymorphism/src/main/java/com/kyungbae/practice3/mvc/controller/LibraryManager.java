package com.kyungbae.practice3.mvc.controller;

import com.kyungbae.practice3.mvc.dto.AniBook;
import com.kyungbae.practice3.mvc.dto.Book;
import com.kyungbae.practice3.mvc.dto.CookBook;
import com.kyungbae.practice3.mvc.dto.Member;

public class LibraryManager {

    private Member mem;
    private Book[] bList = new Book[5];

    {// 초기화 블록을 이용하여 샘플 데이터 초기화 (복사해가기)
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member mem){
        this.mem = mem;
    }

    public Member myPage() {
        return mem;
    }

    public Book[] selectAll() {
        return bList;
    }


    public Book[] searchBook(String keyword){
        int bookNum = 0;
        Book[] found = new Book[5];
        for (int i = 0; i < bList.length; i++) {
            if ((bList[i].toString().contains(keyword))) {
                found[bookNum] = bList[i];
                bookNum++;
            }

        }
        return found;
    }

    public int rentBook(int index) {
        int result = 0;
        if ( bList[index].getClass().equals(AniBook.class) ) {
            if (mem.getAge() < ((AniBook)bList[index]).getAccessAge()) {
                result = 1;
            }
        } else if (bList[index].getClass().equals(CookBook.class)) {
            if(((CookBook)bList[index]).isCoupon()){
                mem.setCouponCount(mem.getCouponCount() + 1);
                result = 2;
            }
        }
        return result;
    }

//    public void test(int a){
//        if (bList[a].getClass().equals(AniBook.class)) {
//            System.out.println("정답");
//        }else{
//            System.out.println("땡");
//        }
//    }



}
