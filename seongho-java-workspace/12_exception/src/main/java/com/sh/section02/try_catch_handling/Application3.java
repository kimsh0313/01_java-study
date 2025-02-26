package com.sh.section02.try_catch_handling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("배열길이(양수): ");
            int size = sc.nextInt(); //InputMismatchException

            int[] arr = new int[size]; //NagativeArraySizeException
            System.out.println("arr : " + Arrays.toString(arr));

            System.out.println("배열 인덱스(적절한범위)");
            int index = sc.nextInt(); //InputMismatchException
            System.out.println(index +" "+ arr[index]); //ArrayIndexOutOfBoundsException
            System.out.println("end");
        }catch (InputMismatchException e){
            System.out.println("바보");
        }catch (RuntimeException e){
            System.out.println("바보오");
            System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());

            e.printStackTrace();
        }
//하위 예외클래스 타입이 상위 예외클래스 타입보다 아래에 위치해 있으면 안 됨
    }
}
