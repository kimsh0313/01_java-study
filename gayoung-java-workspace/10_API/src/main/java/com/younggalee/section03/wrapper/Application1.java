package com.younggalee.section03.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /*
            ## Wrapper ##
            1. 기본자료형을 인스턴스화(객체화) 시킬 수 있는 클래스 (메소드 활용을 위해)
            2. 기본자료형을 인스턴스화 해야되는 경우
                1) 기본자료형 데이터를 가지고 메소드를 호출해야될때
                2) 특정 메소드의 매개변수로 기본자료형이 아닌 객체타입만이 요구될 때
                3) 다형성을 적용시키고 싶을 때
            3. Wrapper 클래스 종류
                1) Boolean, Byte, Short, Integer, Long, Float, Double, Character
         */

        // 1. Boxing : 기본자료형 >> Wrapper 클래스 자료형 (인스턴스화)
        int intValue = 20;
        int intValue2 = 30;

        Integer boxingNumber = new Integer(intValue); // 객체 생성방식  @Deprecated : 권장하지 않는 방식, forRemoval = true // 곧 사라질 예정
        Integer boxingNumber1 = Integer.valueOf(intValue); // static 메소드 사용방식
        Integer boxingNumber2 = intValue2;  // AutoBoxing ****** 가장 간단함
        Integer boxingNumber3 = 80;

        System.out.println(boxingNumber);
        System.out.println(boxingNumber1);
        System.out.println(boxingNumber2);
        System.out.println(boxingNumber3);

        // 2. UnBoxing : Wrapper클래스 자료형 >> 기본자료형
        int unBoxingNumber1 = boxingNumber1.intValue();  // ~~Value() 사용방식
        int unBoxingNumber2 = boxingNumber2;   // AutoUnBoxing (jdk 1.5부터 가능 )

    }
}
