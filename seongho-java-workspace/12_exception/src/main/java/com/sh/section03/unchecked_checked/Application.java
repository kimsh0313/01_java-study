package com.sh.section03.unchecked_checked;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
        unchecked Exception
        1. 예외처리 구문이 없어도 프로그램이 동작되는 예외 클래스들
            ㄴ컴파일 에러가 없어 프로그램 실행에는 문제없음
            단, 사용자가 잘못 사용했거나 개발자가 특정 케이스를 제대로 처리하지 않아서 발생되는 예외들
        2. 예외처리를 강제화 시키지 않았기 때문에 예외핸들링을 하는게 필수는 아님(선택)
        3. 간단한 조건문으로 애초에 예외가 발생되지 않도록 처리도 가능(권장사항)
        4. RuntimeException 클래스와 그 하위 클래스들
            -ArithmeticException
            -IndexOutOfBoundsException
            -NullPointerException
            -ClassCastException
            -NegativeArraySizeException

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("0아닌 숫자 : ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(num);

        System.out.println("나눗셈결과:  " + 10/num  );

    }
}
