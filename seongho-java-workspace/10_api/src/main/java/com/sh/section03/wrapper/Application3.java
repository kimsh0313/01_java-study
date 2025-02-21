package com.sh.section03.wrapper;

public class Application3 {
    public static void main(String[] args) {
        /*
        기본자료형 =>문자열
        기본자료형을 문자열로

         */

        //wrapper 클래스사용 :valueOf 메소드를 통해 객체화 시키고 toString 통해 문자열화
        String i = Integer.valueOf(4).toString();

        //String 클래스의 static valueof메소드 사용
        String str = String.valueOf(10);

        //문자열 합치기 사용
        String str2 =123+"";

    }
}
