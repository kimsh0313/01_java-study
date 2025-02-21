package com.podoseee.section02.abstract_extends;

public class BasketBall extends Sports {

    /*
       ## 추상메소드가 있는 추상클래스를 상속받을 경우 ##
       해결방법1. 추상메소드를 가질 수 있는 형태로 현재 이 클래스 또한 추상클래스로 두기
       해결방법2. 현재 클래스에서 추상메소드를 완성(구현==implement)시키면됨 (오버라이딩)
    */
    @Override
    public void rule(){
        System.out.println("공을 항상 손으로만 쳐야된다.");
    }
}
