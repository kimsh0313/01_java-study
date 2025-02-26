package com.inyong.section03.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /*
        Wrapper
        1. 기본자료형을 인스턴스화 시킬수 있는 클래스
        2. 기본자료형을 인스턴스화 해야되는경우
            1) 기본자료형 데이터를 가지고 메소드를 호출해야될 때
            2) 특정 메소드의 매개변수로 기본자료형이 아닌 개체타입만이 요구될 때
            3) 다형성을 적용시키고 싶을 때
        3. Wrapper 클래스 종류
            1) Boolean   (boolean)
            2) Byte      (byte)
            3) Short     (short)
            4) Integer   (int)
            5) Long      (long)
            6) Float     (float)
            7) Double    (double)
            8) Character (char)

         */

        // 1. Boxing : 기본자료형 => Wrapper클래스 자료형

        int intValue1 = 20;
        int intValue2 = 20;

        Integer boxingNumber = new Integer(intValue1); // 1_1)객체 생성 방식
        // JDK 9부터 deprecated 됨

        Integer boxingNumber1 = Integer.valueOf(intValue1);
        Integer boxingNumber2 = intValue2;

        System.out.println(boxingNumber);
        System.out.println(boxingNumber1);
        System.out.println(boxingNumber2);

        System.out.println(boxingNumber1.equals(boxingNumber2));
        System.out.println(boxingNumber1.compareTo(boxingNumber2));


        // 2. UnBoxing : Wrapper클래스 자료형 => 자료형
        int unBoxingNumber1 = boxingNumber1.intValue();
        int unboxingNumber2 = boxingNumber2; //JDK 1.5부터 가능

        System.out.println(unBoxingNumber1);
        System.out.println(unboxingNumber2);


    }
}
