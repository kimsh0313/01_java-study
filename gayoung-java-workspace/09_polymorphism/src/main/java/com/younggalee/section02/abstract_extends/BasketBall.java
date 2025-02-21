package com.younggalee.section02.abstract_extends;

public class BasketBall extends Sports{  //추상클래스는 상속받을 수

    // abstract 의미: 미완성임. 사용못함. 쓸거면 완성해서 쓰세요.
    // 제너레이터에 Implement method로 abstract 메소드들 템플릿 불러올 수 있음


    /*
     ## 추상메소드가 있는 추상클래스를 상속받을 경우
     해결 1. 추상메소드를 가질 수 있는 형태로 현재 이 클래스 또한 추상클래스로 두기
     해결 2. 현재 클래스에서 추상메소드를 완성 (구현 == Implement)시키면 됨 (오버라이딩)
     */

    @Override
    public void rule() {
        System.out.println("공을 항상 손으로만 쳐야된다. ");
    }

}
