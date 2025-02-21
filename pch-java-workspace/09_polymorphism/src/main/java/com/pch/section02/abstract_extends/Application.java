package com.pch.section02.abstract_extends;

public class Application {
    public static void main(String[] args) {
        /*
            추상 클래스
            1.  abstract class
            2.  형태를 갖추지 못한 클래스 (즉, 미완성된 클래스)
            3.  일반필드 + 일반메소드 + 추상메소드(생략가능)
                => 추상메소드가 없어도 추상클래스 선언 가능
            4.  추상클래스로는 인스턴스 생성 불가 (단, reference type 으로는 가능)
                추상클래스를 상속받는 하위 클래스를 이용해 instance를 생성해야 하고
                이때 추상클래스는 상위 타입 레퍼런스로 사용될 수 있음(다형성)
         */
//        Sports s = new Sports(); // 'Sports' is abstract; cannot be instantiated
        Sports s; // 레퍼런스 타입

    }
}
