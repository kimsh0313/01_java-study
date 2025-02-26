package com.kyungbae.section01.math;

public class Application {
    public static void main(String[] args) {
        // PI : 파이값
        System.out.println("PI : " + Math.PI);

        // abs() : 절대값 반환
        int num1 = -10;
        System.out.println("num1 :" + num1);
        System.out.println("abs(num1) : " + Math.abs(num1));

        // ceil() : 올림값을 반환
        double num2 = 4.359;
        System.out.println("num2 : " + num2);
        System.out.println("ceil(num2) : " + /*(int)*/Math.ceil(num2));

        // round() : 반올림값을 반환
        System.out.println("round(num2) : " +Math.round(num2));

        // floor() : 버림값을 반환
        System.out.println("floor(numw) : " + Math.floor(num2));

        // rint() : 가장 가까운 정수값을 반환
        System.out.println("rint(num2) :" + Math.rint(num2));

        // sqrt() : 제곱근(루트) 값을 반환
        System.out.println("4의 제곱근 : " + Math.sqrt(4));

        // pow() : 제곱값을 반환
        System.out.println("2의 10 제곱 : " + Math.pow(2,10));
    }
}
