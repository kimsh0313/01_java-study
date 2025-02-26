package com.ino.section03.wrapper;

public class Application1 {

    public static void main(String[] args) {
        int intValue1 = 10;
        // deprecated, JDK 9부터 권장하지 않음
//        Integer boxedNumber = new Integer(intValue1);

        Integer boxedNumber1 = Integer.valueOf(intValue1); // static 메소드 방식

        Integer boxedNumber2 = intValue1; // AutoBoxing , JDK 1.5부터 가능

        System.out.println(boxedNumber1.equals(boxedNumber2));

        int unBoxingNum1 = boxedNumber1.intValue(); // xxxValue() 사용을 통한 언박싱
        int unBoxingNum2 = boxedNumber2; // AutoUnBoxing, JDK 1.5 이상부터


    }
}
