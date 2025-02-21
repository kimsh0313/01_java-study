package com.sh.section03.wrapper;

public class Application2 {
    public static void main(String[] args) {
        /*
        ## 문자열 => 기본자료형
        문자열 값을 기본자료형으로 변경 (파싱

        Wrapper클래스.parseXXX(문자열)=>기본자료형 반환
         */
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("3");
        long l = Long.parseLong("4");
        float f = Float.parseFloat("3.0f");
        char c = "abc".charAt(0);//Character에는 parsing메소드 없음

        System.out.println("=========================================");

        String str1 = "10";
        String str2 = "10.5";

        int iNum = Integer.parseInt(str1);
        double dNum = Double.parseDouble(str2);
        System.out.println(iNum + dNum);


    }
}

