package com.seungjoo.sections03.wrapper;

public class Application1 {

    public static void main(String[] args) {


        int intValue1 = 20;
        int intValue2 = 30;


//        System.out.println(intValue1.equals(intValue2));

//       Integer boxingNumber = new Integer(intValue1); // 객체 생성방식(Jdk 9부터 deprecateeㅚㅁ(권장ㅌ))
       Integer boxingNumber1 = Integer.valueOf(intValue1); //static 메소드 사용 방식
       Integer boxingNumeber2 = intValue2; //AutoBoxing(5버전부터 가능)


        System.out.println(boxingNumber1);
        System.out.println(boxingNumeber2);

        //2.unboxing : Wrapper 클래스 자료형 => 기본 자료형

        int unBoxingNumber1 = boxingNumber1.intValue(); //intValue 사용 방식
        int unBoxingNumeber2 = boxingNumeber2;//AutoUnboxing 사용방식(5버전부터)


    }
}
