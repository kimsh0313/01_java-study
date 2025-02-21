package com.podoseee.section01.user_type;

public class Member {

    /*
        ## 필드 ##
        1. Field
        2. 클래스에 선언한 변수를 의미
        3. 멤버 변수라고도 함
           * 멤버 : 클래스에 정의되어 있는 변수 또는 메소드를 의미함
        4. 클래스 기반으로 생성되는 객체의 속성을 저장할 수 있음
        5. 필드는 해당 동일한 클래스 내의 모든 영역에서 사용할 수 있음
        6. 작성 형식 ─────────────────────────┐
		   │ 접근제어자 자료형 필드명 [= 값]; │
		   └──────────────────────────────────┘
     */
    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobby;

}
