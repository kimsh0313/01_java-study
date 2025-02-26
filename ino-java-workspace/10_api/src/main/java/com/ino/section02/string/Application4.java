package com.ino.section02.string;

public class Application4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hi"); // default size = 16, init + decl -> 16 + param size
        System.out.println("sb : " + sb);
        // append : 기존 문자열 + 인자 문자열
        sb.append("hello");

        sb.append(", nice to meet you :)");
        System.out.println(sb);
        sb.delete(0 , 2);
        System.out.println(sb);
        sb.insert(5, " merong");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        String result = sb.toString();
        System.out.println(result);
    }
}
