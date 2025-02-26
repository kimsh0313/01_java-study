package com.younggalee.section01.math;

public class Application {
    public static void main(String[] args) {
        /*
            ##자바API##
            java application programming Interface
            1. 자바 시스템을 제어하기 위해 제공되는 명령어들의 집합
            즉, 자바 프로그램 개발시 자주 사용되는 클래스 및 인터페이스의 모음집
            2. jdk 설치시 제공됨, 자바 개발 도구라고 생각
         */

        /*
            ## java.lang.Math ##
            1. 수학과 관련된 기능을 제공하는 클래스
            2. 상수 필드, static 메소드 들로 구성되어있음
                즉, 프로그램 실행시 이미 Static 메모리 영역에 다 올라가 있음
                 >> 클래스명. 으로 상수 필드 및 메소드 접근 가능
            3. 인스턴스 생성이 필요 없으므로 외부로부터 생성을 제한하기 위해
            private으로 기본 생성자가 정의되어있음

         */

        // * PI : 파이값을 가지고 있는 상수필드
        System.out.println(Math.PI);
        // * abs() : 절대값을 반환
        int num = -10;
        System.out.println(Math.abs(num));
        // * ceil() : 올림값을 반환
        double num2 = 3.14159265358979;
        System.out.println(Math.ceil(num2));

        // * round() : 반올림한 값을 반환
        System.out.println(Math.round(num2));
        // * rint() : 가장 가까운 정수를 반환
        System.out.println(Math.rint(num2));
        // sqrt() 제곱근출력, pow() 제곱값 반환


    }
}
