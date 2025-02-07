package com.jjanggu.section02.variable;

public class Application4 {

    public static void main(String[] args) {

        /*
            ## System.out.printf() ##
            System.out.printf("출력하고자하는 형식", 값, 값, ..);
            => 형식대로 값들이 출력되고 줄바꿈 발생 X

            ## 포맷 키워드 ##
            1. %d : 정수
            2. %c : 문자
            3. %s : 문자열
            4. %f : 실수
            5. %b : 논리값
         */

        int i1 = 10;
        int i2 = 20;

        //10 20%
        System.out.println(i1 + " " + i2 + "%");
        System.out.printf("%d %d%%\n", i1, i2);

        System.out.printf("%d\n", i1, i2); // 10
//        System.out.printf("%d %d \n", i1); //에러발생

        System.out.printf("%5d\n", i1); // 5칸의 공간 확보 + 오른쪽 정렬 (ex %nd : n칸 확보 + 오른쪽정렬)
        System.out.printf("%5d\n", 250);
        System.out.printf("%5d\n", i2);
        System.out.printf("%5d\n", 2);
        System.out.printf("%5d\n", 12000);

        System.out.printf("%-5d\n", i1); // 5칸의 공간 확보 + 왼쪽 정렬 (ex %-nd : n칸 확보 + 왼쪽정렬)
        System.out.printf("%-5d\n", 250);
        System.out.printf("%-5d\n", i2);

        double d1 = 1.23456789;
        double d2 = 4.53;

        System.out.printf("%f %f\n", d1, d2); // %f 기본적으로 출력시 소수점 아래 6째자리까지만 표현
        System.out.printf("%.3f %.1f\n", d1, d2); // %.nf 소수점 아래 n번째 자리까지 표현
        System.out.printf("%.9f %f\n", d1, d2);

        char ch = 'a';
        String str = "Hello";

        System.out.printf("%c %s %s\n", ch, str, ch);
        System.out.printf("%C %S %s\n", ch, str, ch);

    }
}
