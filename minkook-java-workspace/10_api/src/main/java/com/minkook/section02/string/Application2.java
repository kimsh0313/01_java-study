package com.minkook.section02.string;

import java.util.StringTokenizer;

public class Application2 {
    public static void main(String [] args){
        
        //분리된 문자열들을 토큰으로 관리하고자 할 경우 => java.util.StringTokennizer 사용
        // StringTokenizer 변수 = new StringTokenizer("문자열,"구분자");
        // 단 StringTokenizer 객체 내에 담긴 분리된 문자열은 한번 꺼내면 끝
        String str = "JAVA,Python,Oracle,C++,C#";

        StringTokenizer st = new StringTokenizer(str,",");
//        System.out.println(st.countTokens());
//
//
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());


        int count = st.countTokens();

//        for(int i = 0; i < count; i++){
//            System.out.println(st.nextToken());
//        }

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1);
        System.out.println(str2.toString());

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        
        /*
            ## 문자열 리터럴 ##
            1. 문자열 리터럴은 String Constant Pool 영역에 저장됨
            2. String Constant Pool에는 이전 문자열 리터럴과 동일한 문자열 리터럴이 발생될 경우
                기존의 문자열 리터럴을 재사용함
         */
    }


}
