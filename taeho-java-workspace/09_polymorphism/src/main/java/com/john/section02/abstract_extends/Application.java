package com.john.section02.abstract_extends;

/*
    추상 클래스의 사용 목적
    1. 추상클래스의 추상메서드는 오버라이딩에 대한 강제성이 부여됨
    => 추상클래스를 상속받는 모든 하위클래스들에 동일한 형태의 메서드를 정의하도록 강제화
    => 메서드 통일성
 */
public class Application {
    public static void main(String[] args) {

        Sports sports1 = new Basketball();
        Sports sports2 = new Football();

        Sports[] sportArr = new Sports[2];
        sportArr[0] = new Basketball();
        sportArr[1] = new Football();

        for (int i = 0; i < sportArr.length; i++) {
            sportArr[i].rule(); // Dynamic Binding
        }
    }
}
