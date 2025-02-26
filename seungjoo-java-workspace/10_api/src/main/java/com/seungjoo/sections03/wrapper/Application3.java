package com.seungjoo.sections03.wrapper;

public class Application3 {
    public static void main(String[] args) {


        String i = Integer.valueOf(4).toString();
        // Wrapper클래스 사용 : valueOf 메소드를 통해 객체화 시키고 toString 통해 문자열화
        //2. String 클래스의 static valueOf 메소드 사용
        String str = String.valueOf(10);
        //3) 문자열 합치기 사용
        String str2 = 123 + "";
    }
}
