package com.sh.section01.exception;

import java.util.Scanner;

public class Application {
    /*
    오류 (Error
    1.시스템이 문제가 생겨 종료되는것
    2.예측불가

    예외(Exception
    1.오류와 동일하게 프로그램이 비정상적으로 종료되나
    문제가 발생될 수 있는 상황을 미리 예측하고 처리 가능
    2.예외 핸들링을 통해 예외 상황을 적절히 처리하여 코드의 흐름을 제어할 수 있음
     */

    public static void main(String[] args) {
        //예외상황 10/0
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 :" );
        int num = sc.nextInt();
        System.out.println(10/num);
        System.out.println("종료~");

    }
}
