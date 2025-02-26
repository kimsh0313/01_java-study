package com.kyungbae.section03.wrapper;

public class Application1 {
    public static void main(String[] args) {
        // 1. Boxing : 기본자료형 => Wrapper 클래스자료형 (인스턴스화)
        int intValue1 = 20;
        int intValue2 = 30;

//        System.out.println(intValue1.hashCode()); // 기본자료형은 메소드 호출 불가

        // 1_1 객체 생성 방식
        Integer boxingNumber = new Integer(intValue1);
        // 빨간줄 => @Deprecated : java 문법에서 없어질 예정인 문법이다 (권장하지 않는다.)
        // 실행에는 문제 없음

        // 1_2 static 메소드 사용 방식
        Integer boxingNumber1 = Integer.valueOf(intValue1);
        // 1_3 AutoBoxing ( JDK 1.5 이상 )
        Integer boxingNumber2 = intValue2;

        System.out.println(boxingNumber);
        System.out.println(boxingNumber1);
        System.out.println(boxingNumber2);

        System.out.println(boxingNumber1.equals(boxingNumber2));
        System.out.println(boxingNumber1.compareTo(boxingNumber2));

        // 2. Unboxing : Wrapper클래스자료형 => 기본자료형
        // 2_1 xxxValue() 사용 방식
        int unboxingNumber1 = boxingNumber1.intValue();
        // 2_2 AutoUnboxing (JDK 1.5 부터 가능)
        int unboxingNumber2 = boxingNumber2;

        System.out.println(unboxingNumber1);
        System.out.println(unboxingNumber2);



    }
}
