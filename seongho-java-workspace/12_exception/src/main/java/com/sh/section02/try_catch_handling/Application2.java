package com.sh.section02.try_catch_handling;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("0아닌 정수: ");
            int num = Integer.parseInt(sc.nextLine()); //NumberFormatException

            System.out.println(10 / num); //ArithmeticException
        }catch (ArithmeticException e){
            System.out.println("바보");
        }catch (NumberFormatException e){
            System.out.println("정수 변환 불가");
        }

        System.out.println("종료");
        //다중 catch가능
    }
}
