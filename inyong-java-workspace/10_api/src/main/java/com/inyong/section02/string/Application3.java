package com.inyong.section02.string;

public class Application3 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1);
        System.out.println(str2.toString());
        //String 클래스에서 toString 메소드 이미 오버라이딩 되어있음 실제 문자열 반환하도록)

        //2. 문자열 리터럴
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        // equals 메소드에서 이미 오버라이딩 해서 주소값이 아닌 문자열간 비교

        String str3 = "hello";
        String str4 = "hello";

        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        System.out.println(str3 == str4);

        /*
        문자열 리터럴
        문자열 리터럴은 String Constant Pool 영역에 저장됨

  	•	문자열 리터럴은 Java의 String Constant Pool에 저장됩니다.
	•	동일한 문자열 리터럴이 등장하면, Java는 기존 문자열을 재사용하여 메모리를 절약합니다.
	•	new String("text")를 사용하면 Heap 영역에 새로운 객체를 생성합니다.
	•	intern()을 사용하면 String Constant Pool의 문자열을 참조하도록 강제할 수 있습니다.

        기존의
         */

    }
}
