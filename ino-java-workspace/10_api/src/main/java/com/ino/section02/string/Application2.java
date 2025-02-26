package com.ino.section02.string;

import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) {
        String str = "Java,MySQL,MyBatis,Fron,Spring";

        String[] arr = str.split(",");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " idx " + arr[i]);
        }

        // to control string as token -> use java.util.StringTokenizer\
        // StringTokenizer var = new StringTokenizer(String, Separator);
        // StringTokenizer object is instance;

        StringTokenizer stn = new StringTokenizer(str, ",");
        for (int i = 0; i < stn.countTokens(); i++) {
            System.out.println(stn.nextToken());
        }

        while(stn.hasMoreTokens()) {
            System.out.println(stn.nextToken());
        }
    }
}
