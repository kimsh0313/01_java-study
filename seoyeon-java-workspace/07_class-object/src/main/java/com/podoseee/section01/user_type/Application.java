package com.podoseee.section01.user_type;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        // 회원정보(아이디,비번,이름,나이,성별,취미) 관리

        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = {"축구", "볼링", "테니스"};

        System.out.println("id: " + id);
        System.out.println("pwd: " + pwd);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
        System.out.println("hobby: " + Arrays.toString(hobby));
    

    /*
        ## 변수만을 가지고 프로그래밍시 단점 ##
        1. 변수들 일일히 다 관리해야하는 어려움
        2. 특정 메소드 호출시 회원정보(6개의변수) 값을 전달할 경우
            많은 인자값들 전달로 가독성이 떨어짐
        3. 특정 메소드에서 해당 회원정보를 반환해야될 경우
            반환은 1개만 가능하기 때문에 반환이 어려움
     */

        System.out.println("=========");
        
        // 사용자정의자료형(Member) 클래스를 가지고 필드에 정보를 담기 위해서
        // 클래스를 가지고 객체 생성해야됨
        Member member = new Member(); // 객체생성시 => 필드가 Heap메모리에 할당

        /*
            ## 객체의 멤버(필드,메소드)에 접근하는 방법 ##
            1. 객체명.멤버 방식으로 접근
            2. '.'은 참조연산자, 레퍼런스변수가 참조하고 있는 주소지로 접근한다는걸 의미
            3. 예시
               1) 필드 접근
                  레퍼런스.필드명
               2) 메소드 접근
                  레퍼런스.메소드명()
         */
        System.out.println("== 생성 직후 각 필드 초기값 ==");
        System.out.println("id: " + member.id);
        System.out.println("pwd: " + member.pwd);
        System.out.println("name: " + member.name);
        System.out.println("age: " + member.age);
        System.out.println("gender: " + member.gender);
        System.out.println("hobby: " + member.hobby);
        
        // 해당 객체의 각 필드에 값 대입
        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[]{"축구", "볼링", "테니스"};

        System.out.println("=== 필드에 값 대입 후 출력 ===");
        System.out.println("id: " + member.id);
        System.out.println("pwd: " + member.pwd);
        System.out.println("name: " + member.name);
        System.out.println("age: " + member.age);
        System.out.println("gender: " + member.gender);
        System.out.println("hobby: " + Arrays.toString(member.hobby));

    }
}
