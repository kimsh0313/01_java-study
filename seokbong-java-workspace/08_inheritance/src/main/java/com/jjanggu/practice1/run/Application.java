package com.jjanggu.practice1.run;

import com.jjanggu.practice1.dto.Employee;
import com.jjanggu.practice1.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3, 80, 2 , "경영학과");
        students[2] = new Student("강개순", 23, 167, 45,4, "정보통신공학과");


        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }

        Employee[] arr = new Employee[10];
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("이름 : ");
            String name = sc.nextLine();
            System.out.println("나이 : ");
            int age = sc.nextInt();
            System.out.println("신장 : ");
            double height = sc.nextDouble();
            System.out.println("몸무게 : ");
            double weight = sc.nextDouble();
            System.out.println("급여 : ");
            int salary = sc.nextInt();
            System.out.println("부서 : ");
            String dept = sc.nextLine();



            for(int i = 0; i < arr.length; i++) {
                arr[i] = new Employee(name, age, height, weight, salary, dept );

                System.out.println("계속 입력하시겠습니까?(y/n) : ");
                char ch = sc.nextLine().charAt(0);
                if( ch == 'n' ){
                    break;
                }
                System.out.println(arr[i]);
            }



        }


    }
}
