package com.jjanggu.section03.interface_implements;

public interface Behavior {

    /*
        ## 인터페이스 ##
        1. interface
        2. 추상메소드와 상수필드만 가질 수 있는 클래스의 변형체
        3. 필드 작성시 묵시적으로 상수필드이므로 public static final 생략 가능
           메소드 작성시 묵시적으로 추상메소드이므로 public abstract 생략 가능
        4. 인터페이스는 다중 상속이 가능하다.
        5. 인터페이스는 상속 받을때는 implements(구현) 키워드 사용
     */

    // 일반필드 선언 불가
    // private int num;

    // 상수필드만 선언 가능
    /*public static final*/ int OPENING_TIME = 9;
    /*public static final*/ int CLOSING_TIME = 18;

    // 일반 메소드 정의 불가
//    public void method() {}


    // 추상메소드 작성 가능
    /*public abstract*/ void eat();
    /*public abstract*/ void work();

    // 단, static 메소드는 정의 가능 (JDK 1.8 추가된 기능)
    public static void born() {
        System.out.println("우리는 모두 엄마 뱃속에서 태어났어요");
    }

    // 단, default 메소드는 정의 가능 (JDK 1.8 추가된 기능)
    // * default 예약어 : 접근제어자 x, 인터페이스측에서 본문이 있는 메소드 구현시 사용되는 예약어
    public default void die() {
        System.out.println("우리는 언젠간 죽게 되어있어요.");
    }




}
