package com.kyungbae.section02.string;

public class Application3 {
    public static void main(String[] args) {

        // 문자열 생성하는 방법
        // 1. 문자열 객체 : new String("문자열")
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1);
        System.out.println(str2.toString());
        // String 클래스에서 toString 메소드 이미 오버라이딩 해놨음 (실제 담긴 문자열 반환)

        System.out.println(str1 == str2); // false (주소값 비교)
        System.out.println(str1.equals(str2)); // true
        // String 클래스에서 equals() 메소드 오버라이딩 (실제 담긴 문자열 비교)

        System.out.println(str1.hashCode()); // str2와 동일
        System.out.println(str2.hashCode()); // str1과 동일
        // String 클래스에서 hachCode() 메소드 오버라이딩 (주소값이 아닌 문자열가지고 만듬)

        // 정말 주소값이 다른지를 확인하고자 할 경우 => System.identityHashCode(레퍼런스)
        System.out.println(System.identityHashCode(str1)); // 실제 주소 표출
        System.out.println(System.identityHashCode(str2));

        // 2. 문자열 리터럴
        String str3 = "hello";
        String str4 = "hello";
        // * String Constant Pool
        // 문자열 리터럴로 작성할 시 리터럴 값을 String Constant Pool (상수 풀) 에 저장을 한다.
        // 다른 문자열 리터럴이 기존에 String Constant Pool 에 작성이 되어있는 문자열이라면, 그 주소값을 가져온다. (Singleton 방식)

        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        System.out.println(str3 == str4); // true (주소값 일치함)

        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));


    }

}
