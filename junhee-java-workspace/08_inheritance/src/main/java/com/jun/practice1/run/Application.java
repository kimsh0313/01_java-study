package com.jun.practice1.run;

import com.jun.practice1.dto.Person;
import com.jun.practice1.dto.Student;

public class Application {
    public static void main(String[] args) {
        /*
1. 3명의 학생 정보를 기록할 수 있도록 객체 배열을 할당하고
    아래의 사용 데이터를 참고하여 3명의 학생 객체 생성 후
    반복문을 통해 출력
2. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고
    반복문을 사용하여 키보드로 사원 정보를 입력 받도록 구현
    2명 정의 사원 정보를 입력 받아 저장하고
    현재까지 기록된 사원들의 정보 출력
 */

        Student[]stArr = new Student[3];

        stArr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        stArr[1] = new Student("김말똥", 21, 187.3, 80.0, 1, "경영학과");
        stArr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for(Student s : stArr) {
            System.out.println(s);

        }
    }
}
