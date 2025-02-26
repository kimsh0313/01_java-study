package com.seungjoo.section02.string;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {

        String str1 = "hello";
        System.out.println(str1.length());

        System.out.println(str1.charAt(2));

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";


        System.out.println("compareTo() : " + str2.compareTo(str3)); //같음
        System.out.println("compareTo() : " + str2.compareTo(str4)); //인자로 전달된 문자열이 더 작다, 32
        System.out.println("compareTo() : " + str4.compareTo(str2)); //-32

        System.out.println(str2.equals(str4));
        System.out.println(str2.equalsIgnoreCase(str4));


        System.out.println(str2.concat(str5));

        String idxStr = "Hello World";
        System.out.println(idxStr.indexOf("l"));
        System.out.println(idxStr.lastIndexOf("l"));

        System.out.println(idxStr.substring(6));
        System.out.println(idxStr.substring(0,4));



        String email = "user01@naver.com";
        System.out.println("startsWith(user) : " + email.startsWith("user"));
        System.out.println("startsWith(user) : " + email.startsWith("admin"));

        System.out.println("endsWith(.com) : " + email.endsWith(".com"));
        System.out.println("endsWith(.kr) : " + email.endsWith(".kr"));

        System.out.println("contains@ : " + email.contains("@"));

        String ip = "192.168.0.202";
        System.out.println("replace() : " + ip.replace(".", "_"));

        String content = "\n 안녕하세요. 캥거루입니다. \n";
        System.out.println(content.trim() + "#");

        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());


        String lectures = "Java, Mysql, MyBatis, Front, Spring";

        String[] lecArr = lectures.split(",");
        System.out.println(lecArr.length);
        for (String lec : lecArr) {
            System.out.println(lec);
        }

        String newStr = String.join("-", lecArr);
        System.out.println(newStr);












    }
}
