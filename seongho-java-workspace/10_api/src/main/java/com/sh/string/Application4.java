package com.sh.string;

import org.w3c.dom.ls.LSOutput;

public class Application4 {
    public static void main(String[] args) {
        /*
        문자열 관리 클래스 3가지
        ##Java.jang.String
        1.클래스지만 기본자료형 사용법 처럼 쓸 수 있음
        2.불변클래스(Immutable)
            ㄴ기존에 참조하던 곳에서 변경 불가(변경시마다 새로운곳을 참조
        3.변경이 빈번할 경우 매번 새로운 곳을 참조해서 GC가 매번 삭제해야 됨
        ㄴ조회용으로 쓰면 좋음
        ##Java.lang.StringBuilder:StringBuffer
        1.인스턴스를 생성한 후 메소드를 활용하여 사용해야됨
        2.가변클래스
            ㄴ기존에 참조하던 곳에서 변경 가능

        3.변경이 빈번한 경우 사용하면 좋음
        4.변경된 메소드를 메소드체이닝을 통해 사용가능
        5.StringBuilder와 StringBuffer의 차이점(동기화 제공여부
            ㄴ동기화:하나의 자원(데이터)에 대해 여러 스레드(일의 단위)가 접근하려할때
            ㄴ하나의 스레드만 사용할 수 있도록 하는 것
        >StringBuilder 동기화 제공X ==>속도 빠름
        >StringBuffer 동기화 제공O ==>속도 느림

        멀티스레드 환경(여러개의 일처리가 동시다발적으로 수행되는 환경
            :동기화가 제공되는걸로 해야 안전 =>StringBuffer
        단일스레드 환경(한번에 하나의 일만 처리하는 환경)
            :동기화 필요 없으니 StringBuilder
            ㄴ동기화가 제공되는 걸 사용시 속도저하


         */
        String str = "반가워";
        System.out.println(System.identityHashCode(str));
        str += "난 Stringdldi!";//str + 난 String이야!
        System.out.println(System.identityHashCode(str));

        System.out.println("===================");


     performanceTest_String();
     performanceTest_StringBuilder();

    }
    public static void  performanceTest_String(){
        char[] alphabet = "abcdefg".toCharArray();

        String result = "";
        long start =System.nanoTime();
        for (int i = 0; i<alphabet.length;i++){
            result+=alphabet[i];
        }
        long end = System.nanoTime();
        System.out.println("String 결과:" +result);
        System.out.println("String 시간:"+ (end-start));
    }
    public static void performanceTest_StringBuilder(){
        char[] alphabet = "abcdefg".toCharArray();
        StringBuilder sb = new StringBuilder();
        long start =System.nanoTime();
        for (int i = 0; i<alphabet.length;i++){
            sb.append(alphabet[i]);
        }
        long end = System.nanoTime();
        System.out.println("StringBuilder: "+sb );
        System.out.println("StringBuilder 시간:"+ (end-start));


    }
}
