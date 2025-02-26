package com.minkook.section03.interface_implements;

public interface Behavior {
    /*
        ## 인터페이스 ##
        1. interface
        2. 추상메소드와 상수필드만 가질 수 있는 클래스의 변형체
        3. 필드 작성시 묵시적으로 상수필드이므로 public static final 생략가능
        4. 인터페이스는 다중 상속이 가능하다.
        5. 인터페이스는 상속 받을때는 implements 키워드사용



     */
    //일반필드 선언불가
    //private int num
    /*public static final*/ int OPENING_TIME = 0;
    /*public static final*/ int CLOSING_TIME = 18;


    //일반 메소드 정의불가
    //public void method() {}

    //추상메소드 작성가능
    /*public abstract*/ void eat();
    /*public abstract*/ void work();

    //jdk 1.8부터 사용가능
    public static void born(){
        System.out.println("우리는 모두 엄마 뱃속에서 태어났어요");
    }

    public default void die(){
        System.out.println("우리는 언젠가는 죽어요");
    }
}
