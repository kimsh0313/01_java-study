package com.minkook.practice1.run;

import com.minkook.practice1.dto.Employee;
import com.minkook.practice1.dto.Person;
import com.minkook.practice1.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        students[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        students[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
        students[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].toString());
        }



        System.out.println();

        Employee [] employees = new Employee[10];
        int count = 0;

        while(true){

            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.print("나이: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("신장: ");
            double height = sc.nextDouble();
            sc.nextLine();

            System.out.print("몸무게: ");
            double weight = sc.nextDouble();
            sc.nextLine();

            System.out.print("급여: ");
            int salary = sc.nextInt();
            sc.nextLine();

            System.out.print("부서: ");
            String dept =  sc.nextLine();


            employees[count] = new Employee(name,age,height,weight,salary,dept);
            count++;

            System.out.print("계속 입력하시겠습니까?");
            char ch = sc.nextLine().toLowerCase().charAt(0);
            if(ch == 'y'){
                continue;
            }
            if(ch == 'n'){
                for(int i = 0; i < count; i++){
                    System.out.println(employees[i].toString());
                }
                break;
            }

        }

    }
}
