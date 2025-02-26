package com.seungjoo.section02.string;

import java.sql.SQLOutput;

public class Application4 {
    public static void main(String[] args) {


        String str = "반가워";
        System.out.println(System.identityHashCode(str));

        str += "난 String이야";
        System.out.println(System.identityHashCode(str));


        System.out.println("===============");

        //StringBuilder 객체 생성시 처음에 16개의 문자들을 기록할 수 있는 버퍼가 내부적으로 생성
        StringBuilder sb = new StringBuilder("반가워");

        System.out.println("sb: " + sb.toString());
        System.out.println("주소값: " + System.identityHashCode(str));
        System.out.println("수용량" + sb.length());
        System.out.println("문자열의 길이: " + sb.length());

        System.out.println("=============");


        sb.delete(2, 5);
        sb.insert(1, "ㅎㅎㅎ");
        sb.reverse();
        sb.toString();


        performanceTest_String();
        performanceTest_StringBuilder();

    }

        public static void  performanceTest_String(){
            //String을 이용한 문자열 연결 (+연산자)


            char[] alphabet = "akfkfdhkajhd klhaskhkjkjh kladjfkj".toCharArray();

            String result = "";
            long start = System.nanoTime();
            for (int i = 0; i < alphabet.length; i++) {
                result += alphabet[i];

            }
            long end = System.nanoTime();

            System.out.println("String의 소요시간 : " + (end-start) + "ns");
            System.out.println("String 결과 : " + result);


    }
        public static void performanceTest_StringBuilder(){
            char[] alphabet = "akfkfdhkajhd klhaskhkjkjh kladjfkj".toCharArray();

            StringBuilder result = new StringBuilder();
            long start = System.nanoTime();
            for (int i = 0; i < alphabet.length; i++) {
                result.append(alphabet[i]);

            }
            long end = System.nanoTime();

            System.out.println("StringBuilder의 소요시간 : " + (end-start) + "ns");
            System.out.println("StringBuilder 결과 : " + result);






        }


















    }

