package com.john.practice3.mvc.dto;

public class CookBook extends Book {
    private boolean coupon;

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    @Override
    public String toString() {
        //0번도서 : 백종원의 집밥 / 백종원 / tvN / true
        return super.toString() + " / " + coupon;
    }
}
