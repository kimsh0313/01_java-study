package com.seungjoo.section02.string;

public class Application3 {
    public static void main(String[] args) {



        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // String 클래스에서 toString 메소드 이미 오버라이딩 해놨음
        //실제 담긴 문자열 반환하도록

        System.out.println(str1 == str2); //false(주소값 비교)
        System.out.println(str1.equals(str2)); //true, 주소값 비교가 아닌 실제 담긴 문자열간 비교


        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        //주소값이 아닌 실제 담긴 문자열가지고 만듦, 같은 주소 가짐

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        //주소가 다른 것을 알 수 있음


        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str3 == str4);

        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

    }
}
