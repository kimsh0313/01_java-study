package com.younggalee.section01.arithmetic;

public class Application1 {
    public static void main(String[] args){
        /*
            ## 산술연산자 ##
            1. 이항 연산자 (두 개의 값을 가지고 연산)
            2. 종류
               : + - * / %
            3. 우선순위
               1) * / %
               2) + -
         */
        int num1 = 10;
        int num2 = 0;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);  // 나누기했을 때의 몫
        System.out.println(num1 % num2);  // 나누기했을 때의 나머지

        // 값 % 2 == 0

    }
}
