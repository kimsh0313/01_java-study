package com.kyungbae.section03.interface_implements;

public interface Behavior {

    // 일반 필드 선언 불가
    // private int num;

    // 상수필드만 선언 가능
    /*public static final*/ int OPENING_TIME = 9;
    int CLOSING_TIME = 18;

    // 일반 메소드 정의 불가
    // public void method(){}

    // 추상메소드 작성 가능
    /*public abstract*/ void eat();
    void work();

    // JDK 1.8 이상
    // static 메소드는 정의 가능
    public static void born(){
        System.out.println("우리는 모두 엄마 뱃속에서 태어났어요.");
    }
    // default 메소드 정의 가능
    // default 예약어 : 접근제어자 x, 인터페이스측에서 본문이 있는 메소드 구현시 사용
    public default void die(){
        System.out.println("우리는 언젠간 죽게 되어있어요.");
    }






}
