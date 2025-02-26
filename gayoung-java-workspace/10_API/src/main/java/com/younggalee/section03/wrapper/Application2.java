package com.younggalee.section03.wrapper;

public class Application2 {
    public static void main(String[] args) {
        /*
        ## 문자열 >> 기본자료형 ##
        문자열 값을 기본자료형으로 변경 (파싱)
        Wrapper클래스.parse~(문자열) >> 기본자료형 반환
         */
        byte b = Byte.parseByte("1");
        // ...
        boolean bool = Boolean.parseBoolean("true");
        char c = "abc".charAt(0); // Character 에는 parsing메소드가 없음
    }
}
