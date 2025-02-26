package com.kyungbae.section03.wrapper;

public class Application2 {
    public static void main(String[] args) {

        byte b = Byte.parseByte("1");       // 1
        short s = Short.parseShort("2");    // 2
        int i = Integer.parseInt("4");      // 4 **
        long l = Long.parseLong("8");       // 8
        float f = Float.parseFloat("4.0");  // 4.0
        double d = Double.parseDouble("8.0"); // 8.0 **
        boolean bool = Boolean.parseBoolean("true");
        char c = "abs".charAt(0); // Character에는 parsing 메소드 없음

        System.out.println("============================");
        // ex)
        String str1 = "10";
        String str2 = "15.3";

        System.out.println(str1 + str2); // = "1015.3" String 형

        int iNum = Integer.parseInt(str1); // "10" -> 10
        double dNum = Double.parseDouble(str2); // "15.3" -> 15.3

        System.out.println(iNum + dNum); // 25.3 double 형

    }
}
