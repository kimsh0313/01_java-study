package com.pch.section02.abstract_extends;

public class BasketBall extends Sports {
    /*
        ## 추상메소드가 있는 추상클래스를 상속받을 경우 ##
        해결법 1. 추상메서드를 가질 수 있는 형태로 현재 이 클래스 또한 추상클래스로 두기
        해결법 2. 현재 클래스에서 추상메소드를 완성 (구현 == implement) 시키면 됨(오버라이딩)
     */
    @Override
    public void rule() {
        System.out.println("공은 항상 손으로 쳐야한다.");
    }
}
