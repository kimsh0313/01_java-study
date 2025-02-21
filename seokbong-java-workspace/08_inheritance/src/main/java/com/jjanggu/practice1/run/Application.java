package com.jjanggu.practice1.run;

import com.jjanggu.practice1.dto.Student;

public class Application {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3, 80, 2 , "경영학과");
        students[2] = new Student("강개순", 23, 167, 45,4, "정보통신공학과");


        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }


    }
}
