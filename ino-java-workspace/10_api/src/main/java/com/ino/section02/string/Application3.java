package com.ino.section02.string;

public class Application3 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String str = "반가워";
        System.out.println(System.identityHashCode(str));

        str += "i'm Sting";
        System.out.println(System.identityHashCode(str));

    }
}
