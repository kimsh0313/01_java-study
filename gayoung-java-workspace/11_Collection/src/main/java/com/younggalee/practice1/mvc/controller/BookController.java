package com.younggalee.practice1.mvc.controller;

import com.younggalee.practice1.mvc.dto.Book;
import com.younggalee.section02.list.dto.Music;

import java.util.*;

public class BookController {
    private ArrayList<Book> bookList = new ArrayList<>();
    {
        bookList.add(new Book("자바언어의 정석", "홍길동", "기타", 20000));
        bookList.add(new Book("C언어의 보람", "김말똥", "기타", 15000));
        bookList.add(new Book("도움이 되었나요", "캥거루", "인문", 17500));
        bookList.add(new Book("여러분", "홍홍홍", "의료", 10000));
    }

    public void insertBook(String title, String author, int category, String price){

        Map<Integer, String> categoryMap = new HashMap<>();

        categoryMap.put(1, "인문");
        categoryMap.put(2, "자연과학");
        categoryMap.put(3, "의료");
        categoryMap.put(4, "기타");

        bookList.add(new Book(title, author, categoryMap.get(category), Integer.parseInt(price)));
        // 전달받은 값들을 가지고 Book객체 생성 후 bookList에 추가하기
        // * 유의사항
        // - Book객체 생성시에 category필드에는 장르번호가 아닌 장르명으로 기록되어야됨
        // - Book객체 생성시에 price필드에는 가격값이 숫자로 기록되어야됨
    }

    public ArrayList<Book> selecList(){
        return bookList;
    }

    public ArrayList<Book> searchBook(String keyword, int menuNum){
        ArrayList<Book> searchedBook = new ArrayList<>();
        for (Book book : bookList) {
            if (menuNum == 1) {
                // 도서명
                if (book.getTitle().contains(keyword)) {
                    searchedBook.add(book);
                }
            } else if (menuNum == 2) {
                // 저자명
                if (book.getAuthor().contains(keyword)) {
                    searchedBook.add(book);
                }
            } else if (menuNum == 3) {
                // 도서명 또는 저자명
                if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                    searchedBook.add(book);
                }
            }
        }

        return searchedBook;

        // 현재 bookList내의 도서들 가지고 전달된 키워드 값이 포함 되어있는 도서들을 반환하기
        // 이때 전달된 메뉴번호가 1일 경우 도서명에 포함되어있는지 비교하고,
        // 메뉴번호가 2일 경우 저자명에 포함되어있는지 비교하고,
        // 메뉴번호가 3일 경우 도서명 포함되어있거나, 저자명에 포함되어있는지 비교할 것
    }

    public Boolean deleteBook(String title, String author){
        Boolean result = false;
        for (Book book : bookList){
            if(book.getTitle().equals(title) && book.getAuthor().equals(author)){
                bookList.remove(book);
                result = true;
                break;
            }
        }
        return result;
        // 현재 도서들 중 전달된 도서명과 저자명이 일치하는 도서를 찾아 삭제하고
        // 성공여부 값을 1 또는 0으로 반환하기
    }
}
