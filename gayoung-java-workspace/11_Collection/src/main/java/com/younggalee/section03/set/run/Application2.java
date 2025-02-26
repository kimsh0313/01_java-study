package com.younggalee.section03.set.run;

import com.younggalee.section03.set.dto.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application2 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        System.out.println(set);

        set.add(new Student("이가영", 30, 40));  // A
        set.add(new Student("이가영2", 300, 40));
        set.add(new Student("홍길동", 24, 20));  // B  A와 B의 주소값이 다르기 때문에 다른 객체로 판단됨
        // set이지만 동등객체에 대해서 중복 추가해주는 모습 확인 가능

        // add 메소드 내에서 기존에 존재하는 요소들과 인자로 전달된 요소가지고 동등객체인지 판별
        // >> hashCode()의 결과가 일치하고, equals()의 결과가 true일 경우, 동등객체로 판별됨.

        // Student 클래스에 hashCode, equals 오버라이딩 전 : Object클래스의 hashCode, equals가 수행됨. >> 주소값 가지고 비교
        System.out.println(set);

        // hashCode(), equals() 오버라이딩(모든 필드 검사) 후 동등객체 판변되어 중복제거됨

        // conotains(Object o) : set 내에 전달된 요소가 포함되어있을 경우 true 반환
        System.out.println(set.contains(new Student("홍길동", 24, 20)));

        // 순회 방법 4가지 방법
        // 1. 향상된 for문
        // 2. 배열사용
        // 3. List사용(ListArray) : 매개변수(set) 생성자로 만들기 or addAll 쓰기
        // 4. Iterator 사용 new로 할당없이 .iterator()로 생성(?)후 객체.next()불러오기

        // 4번
        Iterator<Student> studentiterator = set.iterator();
        System.out.println(studentiterator.next());
        System.out.println(studentiterator.next());


    }
}
