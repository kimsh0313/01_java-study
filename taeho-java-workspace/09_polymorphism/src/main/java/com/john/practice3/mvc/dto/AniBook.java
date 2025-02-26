package com.john.practice3.mvc.dto;

public class AniBook extends Book {
    private int accessAge;

    public AniBook() {
    }

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    @Override
    public String toString() {
        //0번도서 : 백종원의 집밥 / 백종원 / tvN / true
        return super.toString() + " / " + accessAge;
    }
}
