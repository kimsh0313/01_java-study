package com.younggalee.section02;

public class Application3 {
    public static void main(String[] args) {
        // 문자열 생성하는 방법
        // 1. 문자열 객체 : new String("문자열")
        // 힙 메모리에 저장됨 , str1 == str2 (false) >> 문자열 객체는 equals 사용해야함

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 + " " + str2); //분명 str은 참조형 변수이지만 String클래스에서 Object toString()을 오버라이딩하여 문자열 출력하도록 작성되어있기 때문
        // 주소값이 아닌 문자열이 출력되는 이유 (따라서 str1 == str2 하면 주소값이 달라 false 출력됨. 하지만 equals은 오버라이딩 되서 true 출력됨)
        // hashCode도 string 클래스에서 실제문자열로 비교되게끔 오버라이드 되어 있어 같은 값 출력됨.
        System.out.println(System.identityHashCode(str1));  /// 이걸로 찐 주소값 출력할 수 있음

        // 2. 문자열 리터럴 : "문자열"
        // 상수 풀에 저장됨, 재사용성 좋음, str1 == str2 (true)

        String str3 = "hello";
        String str4 = "hello";

        /*
        ##문자열 리터럴##
        1. 문자열리터럴은 JVM이 관리하고 String Constant pool(상수풀) 영역에 저장됨
        2. String Constant Pool 에는 이전 문자열리터럴과 동일한 문자열리터럴이 발생될 경우
           기존의 문자열리터럴을 **재사용**함. (즉, 싱글통(단일 인스턴스) 처럼 관리)
         */
    }
}
