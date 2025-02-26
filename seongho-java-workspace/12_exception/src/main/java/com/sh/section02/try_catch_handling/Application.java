package com.sh.section02.try_catch_handling;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
        예외 처리
        1. try ~ catch문 (예외처리_
        2. throws (예외회피

        try catch
        발생되는 예외를 직접 처리
         */



        //예외상황 10/0
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 :" );

        int num = sc.nextInt();

        try {
            System.out.println(10/num);
        }catch (ArithmeticException e){
            System.out.println("0으로 못나눔");
        }
        System.out.println("종료~");

    }
}
