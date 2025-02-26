package com.inyong.section03.interface_implements;

public interface Behavior2 {

    /*
    interface

    메소드는 추상 메소드만 가능
    추상메소드와 상수필드만 가질 수 있는 클래스의 변형체
    필드 작성시 묵시적으로 상수필드 이므로 public static final 생략 가능

    일반필드 선언 불가 / 상수 필드만 가능
    public static final 생락가능
    메소드 작성시 묵시적으로 추상메소드이므로 public abstract 생략 가능

    인터페이스는 다중 상속 가능

    인터페이스는 상속 방르 때는 implements 키워드 사용

     */

    public static final int OPENING_TIME = 9;
    int CLOSING_TIME = 18;

    // 일반 메소드 정의 불가
    // public void method(){}


    // 추상 메소드
    public abstract void eat();
    /*public abstract*/ void work();

    /// 단, static 메소드는 정의 가능 (JDK 1.8 추가된 기능)
    public static void born() {
        System.out.println("응애 한적이 있어요");
    }

    /// 단, default 메소드는 정의 가능 (JDK 1.8 추가된 기능)
    /// default : 접근제어자 x,
    /// 인터페이스측에서 본문이 있는 메소드 구현시 사용되는 예약어
    /// 선택적 오버라이딩
    public default void die() {
        System.out.println("i will be back");
    }
}
