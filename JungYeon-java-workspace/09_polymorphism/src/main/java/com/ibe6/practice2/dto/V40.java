package com.ibe6.practice2.dto;

public class V40 extends SmartPhone
{
    @Override
    public void printMaker() {
        System.out.println("V40은 LG에서 만들어졌다.");
    }

    @Override
    public void charge() {
        System.out.println("고속충전");
    }

    @Override
    public void picture() {
        System.out.println("1200,1600만 화소 트리플 카메라");
    }

    @Override
    public void makeaCall() {
        System.out.println("번호를 누르고 통화버튼을 누름");
    }

    @Override
    public void takeaCall() {
        System.out.println("전화받기 버튼을 누름");
    }

    @Override
    public void touch() {
        System.out.println("정전식");
    }
}
