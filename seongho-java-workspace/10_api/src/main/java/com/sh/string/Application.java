package com.sh.string;

public class Application {
    public static void main(String[] args) {
        //문자열 생성 방법
        //1. 문자열 객체 문자열 리터럴 : new String(문자열)
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1);
        System.out.println(str2.toString());
        //String 클래스에서 toString 메소드 이미 오버라이딩 해놨음(실제 담긴 문자열 반환하도록
        System.out.println(str1==str2);//주소값 비교 == false
        System.out.println(str1.equals(str2)    ); // true
        //String 클래스에서 equals 메소드는 이미 오버라이딩 해놨음(주소값 비교가 아닌 실제 담긴 문자열간 비교
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        //String 클래스에서 hashCode메소드 이미 오버라이딩 해놨음(주소값이 아닌 실제 담긴 문자열가지고 만듦

        //ㄹㅇ 주소값이 다른지 궁금하면
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        //2 문자열 리터럴 : "문자열"
        String str3 ="hello";
        String str4 ="hello";

        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        System.out.println(str3 == str4); //true
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        /*
        ##문자열 리터럴
        1. 문자열 리터럴은 String Constant Pool(상수풀) 영역에 저장됨
        2. String Constant Pool 에는 이전 문자열리터럴과 동일한 문자열리터럴이 발생될 경우
            기존의 문자열리터럴을 재사용함(즉,싱글톤(단일인스턴스)처럼 관리)
         */

    }
}
