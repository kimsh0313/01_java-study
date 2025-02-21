package com.sh.section03.wrapper;

public class Application {
    public static void main(String[] args) {
        /*
        ##Wrapper
        1. 기본자료형을 인스턴스화 시킬 수 있는 클래스
        2. 기본자료형을 인스턴스화 해야되는 경우
            ㄴ기본자료형 데이터를 가지고 메소드를 호출해야될 때
            ㄴ특정 메소드의 매개변수로 기본 자료형이 아닌 객체타입만이 요구될 때
            ㄴ다형성을 적용시키고 싶을 때
        3. Wrapper 클래스 종류
            ㄴBoolean(boolean)
            ㄴByte   (byte
            ㄴShort  (short
            ㄴInteger(int
            ㄴLong   (long
            ㄴFloat  (float
            ㄴDouble (double
            ㄴCharacter (char
            ㄴ

         */
        //1.Boxing : 기본자료형=>Wrapper클래스자료형(인스턴스화
        int intvalue1 = 20;
        int intvalue2=30;

        //System.out.println(intvalue1.hashCode);

        Integer boxingNumber =new Integer(intvalue1); //1.1객체 생성 방식 JDK 9부터 deprecated됨 (권장X
        Integer boxingNumber1 = Integer.valueOf(intvalue1); //1.2 static 메소드 사용 방식
        Integer boxingNumber2 = intvalue2;  //autoBoxing (JDK1.5부터 가능

        System.out.println(boxingNumber);
        System.out.println(boxingNumber1);
        System.out.println(boxingNumber2);

        System.out.println(boxingNumber1.equals(boxingNumber2));

        //2.UnBoxing : wrapper클래스 자료형 => 기본자료형
        int unBoxingNumber = boxingNumber1.intValue(); //2.1 xxxValue()
        int unBoxingNumber2 = boxingNumber2; //autoUnBoxing (JDK1.5부터 가능
        System.out.println(unBoxingNumber);
        System.out.println(unBoxingNumber2);



    }
}
