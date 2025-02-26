package com.seungjoo.section02.string;

import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) {
        String str = "Java,MySQL,MyBatis,Front,Spring";

        System.out.println("=======");

        StringTokenizer st = new StringTokenizer(str, ",");

        System.out.println("분리된 문자열의 개수(토큰의 개수): " + st.countTokens());



        for (int i = 0; i < st.countTokens(); i++) {
            System.out.println(st.nextToken());
        }
//해결방법1

//        int cnt = st.countTokens(); //5
//        for (int i = 0; i < cnt; i++) {
//            System.out.println(st.nextToken());
//
//        }
        // 해결방법2
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }


                }


}
