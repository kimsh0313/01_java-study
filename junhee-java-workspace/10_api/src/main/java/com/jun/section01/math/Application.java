package com.jun.section01.math;

public class Application {
    public static void main(String[] args) {


    /*
        ## 자바 API ##
        1. java Application Programming Interface
        2. 자바 시스템을 제어하기 위해 제공되는 명령어들의 집합
           즉, 자바 프로그램 개발시 자주 사용되는 클래스 및 인터페이스의 모음집
        3. JDK 설치시 제공됨, 자바 개발 도구라고 생각
     */

        /*
            ## java.lang.Math ##
            1. 수학과 관련된 기능을 제공하는 클래스
            2. 상수 필드, static 메소드들로 구성되어있음
               즉, 프로그램 실행시 이미 static 메모리 영역에 다 올라가있음
               => 클래스명. 이로 상수필드 및 메소드 접근 가능
            3. 인스턴스 생성이 필요없으므로 외부로부터 생성을 제한하기 위해
                private 으로 기본생성자가 정의되어있음
         */

        // * pI : 파이값을 가지고 있는 상수필드
        System.out.println("파이: " + Math.PI);

        // * abs() : 절대값을 반환
        int num1 = -10;
        System.out.println("abs() : " + Math.abs(num1));

        // * ceil() : 올림값을 반환
        double num2 = 4.349;
        System.out.println("ceil() : " + /*(int)*/Math.ceil(num2));

        // * round() : 반올림값을 반환
        System.out.println("round : " + Math.round(num2));

        // * floor() : 버림값을 반환
        System.out.println("floor() : " + Math.floor(num2));

        // * rint() : 가장 가까운 정수값을 반환
        System.out.println("rint() : " + Math.rint(num2));

        // * sqrt() : 제곱근(루트) 값을 반환
        System.out.println("4의 제곱근 : " + Math.sqrt(4));

        // * pow() : 제곱 값을 반환
        System.out.println("2의 10제곱" + Math.pow(2, 10));

       // new Math(); private 으로 되어있음

    }
}
