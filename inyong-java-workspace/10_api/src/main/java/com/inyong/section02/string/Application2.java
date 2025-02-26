package com.inyong.section02.string;

import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) {
        String str = "java,MySQL,MyBatis,Front,Spring";

        /*
         문자열 분리 방법
         1. split
         2. java.util.StringTokenizer (1회성) -> 더 빠름
         -  1회성 이므로 단어를 순차적으로 호출할때마다 countTokens의 값이 실시간으로 줄어든다
            카운트를 변수에 담는다
         - while(st.hasMoreTokens()) 으로 반복문 가능
         */
        StringTokenizer st = new StringTokenizer(str, ",");

        System.out.println(st.countTokens()); // 갯
        System.out.println(st.nextToken()); // 토큰 출력 java
        System.out.println(st.nextToken()); // 토큰 출력 MySQL

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            System.out.println() ;
        }
    }
}
