package com.sh.section01.exception;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        //예외 2 사용자에게 배열 길이 입력받아 배열 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("배열길이: ");
        int size = sc.nextInt();

        int[] arr= new int[size];
        System.out.println(Arrays.toString(arr));
        System.out.println("배열 인덱스: ");
        int index = sc.nextInt();
        System.out.println("arr ["+index+"]"+ arr[index] );
        System.out.println("end");
    }
}
