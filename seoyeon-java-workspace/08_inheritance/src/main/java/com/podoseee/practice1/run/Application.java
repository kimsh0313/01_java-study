package com.podoseee.practice1.run;

import com.podoseee.practice1.dto.Employee;
import com.podoseee.practice1.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
        Student[] students = new Student[3];

        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        // 위의 학생 정보 모두 출력
        /*for(int i=0; i<3; i++){
            System.out.println(students[i]);
        }*/
        // 향상된 for문 쓰기
        System.out.println("\n=== 학생 정보 출력 ===");
        for (Student student : students) {
            System.out.println(student);
        }

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
        Employee[] employees = new Employee[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        // 사원들의 정보를 키보드로 계속 입력 받고   --> while(true) 무한 반복문을 통해
        while (true) {
            if (count > 10) {
                System.out.println("더 이상 사원을 추가할 수 없습니다.");
                break;
            } // 10명이 초과될 경우 출력문 추가
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("신장 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게 : ");
            double weight = sc.nextDouble();
            System.out.print("급여 : ");
            double salary = sc.nextDouble();
            sc.nextLine(); // int나 double뒤에 nextline 오면 nextline 한 번 더 넣어주기
            System.out.print("부서 : ");
            String major = sc.nextLine();


            // 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
            employees[count] = new Employee(name, age, height, weight, (int) salary, major);
            // 한 명씩 추가 될 때마다 카운트함
            count++;
            // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
            System.out.print("계속 입력하시겠습니까?(y/n) : ");
            String answer = sc.nextLine().toLowerCase(); // 입력받은 대소문자 상관없이 소문자로 인식
            // ‘n’일 경우 더 이상 그만 입력 받도록..
            if (answer.equals("n")) { // string 비교는 == 아니고 equals
                break;
            }
        }
        // 배열에 담긴 사원들의 정보를 모두 출력

        System.out.println("\n=== 사원 정보 출력 ===");
        for (int i = 0; i < count; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }
}
