package com.podoseee.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        Monster_Bad mon1 = new Monster_Bad();
        mon1.name = "프랑케";
        mon1.hp = -200;

        System.out.println(mon1.name);
        System.out.println(mon1.hp);
        
        /*
            ## 문제점3 ##
            메소드를 두긴했지만 여전히 필드에 직접 접근이 가능하긴함
         */

        Monster_Good mon2 = new Monster_Good();
        /*
        mon2.name = "미이라";
        mon2.hp = 200;
        System.out.println(mon2.name);
        System.out.println(mon2.hp);
         */
        mon2.setName("미이라");
        mon2.setHp(-200);
        System.out.println(mon2.getInfo());


        /*
            ## 캡슐화 ##
            1. Encapsulation
            2. 필드의 직접 접근 제한 (private) => 정보은닉
            3. 간접적으로 필드를 수정 및 조회 할 수 있는 메소드(public)를
               클래스 내부에 작성하는 기법
            4. 즉, 필드(속성)와 메소드(기능)를 묶어서 관리하는 기법
            5. 클래스 작성시 특별한 목적이 아닌 이상 캡슐화가 기본 원칙
         */
    }
}
