package com.younggalee.section02;

import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) {
        String str = "java,MySQL,MyBatis,Front,Spring";

        // 문자열 분시 시키는 방법
        // 방법1. 분리된 문자열들을 String[]으로 담아 관리하고자 할 경우 > split()메소드 사용
        //         문자열.split("구분자") : String[]
        String[] arr = str.split(",");

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
//            String[] test = arr[i].split("");
//            System.out.println(test[0]);
//            System.out.println(test[1]);
//            System.out.println(test[2]);
//            System.out.println(test[3]);
        }

        //방법2. 분리된 문자열들을 토큰으로 관리하고자 할 경우 >> java.util.StringTokenizer 사용
        //       StringTokenizer 변수 = new StringTokenizer();
        //       단, StringTokenizer 객체 내에 담긴 분리된 문자열은 한번 꺼내쓰면 끝 (일회성)
        System.out.println("=============================");
        StringTokenizer stn = new StringTokenizer(str,",");
        System.out.println("분리된 문자열의 개수(토큰의 개수): " + stn.countTokens());   // 5
//        System.out.println(stn.nextToken());
//        System.out.println(stn.nextToken());
//        System.out.println(stn.nextToken());
//        System.out.println(stn.countTokens()); // stn에 남아있는 토큰 수를 반환하는 메소드  // 2

        /*
        🆚 split() 메서드와 StringTokenizer 클래스 비교
        특징	    split() 메서드	StringTokenizer 클래스
        패키지     	java.lang.String	java.util.StringTokenizer
        반환 타입	String[] (문자열 배열)	Enumeration (토큰을 하나씩 반환)
        정규식 지원	✅ (정규 표현식 사용 가능)	❌ (단순 구분자만 사용)
        빈 문자열 처리	✅ (구분자 사이 빈 값도 포함 가능)	❌ (빈 토큰 무시)
        속도	상대적으로 느림 (정규식 사용 시 특히 느려짐)	상대적으로 빠름
        사용 시기	배열이 필요하거나, 정규식을 사용해야 하는 경우	단순 구분자로 빠르게 토큰을 순회할 때
        Thread-Safe	✅ (불변 객체)	❌ (동기화 필요 시 synchronized 사용)

         */

        System.out.println("=============================");

        // 토큰의 개수만큼 반복문을 통해 각 토큰 출력
//        for(int i=0; i<stn.countTokens() + i; i++){
//            System.out.println(stn.countTokens());
//            System.out.println(stn.nextToken());
//        }
        // stn.countTokens()가 5 > 4 > 3 되서 종료
        // ㄴ 해결 1
        //int count = stn.countTokens(); // 로 저장해서 for문 범위로 사용
        // ㄴ 해결 2  ***********************************************************
        while(stn.hasMoreTokens()){ // 남아있는 토큰이 있을때 반복문 수행
            System.out.println(stn.nextToken());
        }
    }
}
