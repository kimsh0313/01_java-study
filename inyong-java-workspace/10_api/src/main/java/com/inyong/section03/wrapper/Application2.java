package com.inyong.section03.wrapper;

public class Application2 {
    public static void main(String[] args) {

        /*
        문자열 -> 기본자료형

        문자열 값을 기본자료형으로 변경 (파싱)

        Wrapper클래스.parseXXX(문자열) -> 기본자료형 반환
         */

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");
        float f = Float.parseFloat("4.0f");
        double d = Double.parseDouble("8.0");
        boolean bool = Boolean.parseBoolean("true");
        char c = "abc".charAt(0);

        System.out.println(b + s);

        String str1 = "10";
        String str2 = "20";
        System.out.println(str1 + str2);

        System.out.println(Integer.parseInt(str1) + Double.parseDouble(str2));




    }
}
