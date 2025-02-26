package com.john.section03.interface_implements;

/*
    인터페이스(interface)
    - 추상메서드와 상수 필드만 가질 수 있음
    - 필드 작성 시 묵시적으로 상수필드로 판단하여 public static final 생략 가능
    - 메서드 작성 시 묵시적으로 추상메서드로 판단하여 public abstract 생략 가능
    - 다중 상속 가능, 인터페이스를 상속받을 때는 implements 키워드 사용
    implements (구현) // extends (물려받음)

    ====

 */
public interface Behavior {
    public static final int OPENING_TIME = 9;
    int CLOSING_TIME = 18;

    void eat();
    public abstract void work();

//    jdk 1.8 이후 블록 구조가 있는 static method 구현 가능
    public static void born(){
        System.out.println("Interface static method Called");
    }
//   default 예약어: 접근제어자X 인터페이스 측에서 본문이 있는 메서드 구현시 사용되는 예약어
    public default void die(){}
}
