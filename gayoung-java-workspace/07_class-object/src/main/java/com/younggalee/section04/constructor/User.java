package com.younggalee.section04.constructor;

public class User {

    // 회원정보를 담기 위한 클래스

    /*
    작성순서 :
    필드 선언
    생성자 선언
    메소드 선언
     */

    //필드선언
    private String id;
    private String pwd;
    private String name;

    //생성자 선언


    /*
    ## 생성자 ##
    1. constructor
    2. 객체 생성시 호출되는 특별한 메소드
    3. 객체 생성 시점 외에 임의로 호출 할 수 없다. (new ~ 없이 임의로 호출하지 말라는 말)
    4. 생성자 사용 목적
        1) 객체 생성 시점에 수행할 명령이 있을 경우
        2) 객체 생성시 전달값을 전달해서 각 필드에 초기화를 시키고자할 경우
        3) 객체 생성하는 방법을 제한두기 위해 사용
    5. 생성자 종류
        1) 기본 생성자
         - 매개변수가 없기 때문에 생성자 호출 시 별도의 전달값을 받을 수 없음
         - 단지 객체 생성만이 목적일 때 사용됨
         - ** 별도의 생성자가 정의되어 있지 않을 경우 Java Compiler가 자동으로 추가해줌
         - 작성형식
           접근제어자 생성자명() {  // 생성자명은 class명과 동일해야한다. ***
                // 객체생성시 수행할 명령 작성
           }
        2) 매개변수 생성자
        - 매개변수 있는 생성자로, 생성자 호출 시 전달값을 받아서 사용할 수 있다.
        - 주로 전달된 값을 **필드에 초기화** 할 목적으로 사용
          즉, 객체 생성과 동시에 필드에 원하는 값을 초기화할 때 주로 사용
        - 작성형식
           접근제어자 생성자명(매개변수, ...){
                this.필드 = 매개변수;
           }
    */

    //메소드가 아니기 때문에 반환타입 없음 (반환하는게 없으니까)
    public User() {   // 생성자
        System.out.println("user 클래스의 기본생성자 호출됨");
        //객체 생성만을 위한 기본 생성자
        // 기본 생성자가 jvm이 자동으로 만들어주지만 그래도 작성해두는 습관 가지기
        // 매개변수 생성자 있으면 기본 생성자 자동으로 생성 안되니까
    }

    public User(String id, String pwd) {  //매개변수 2개짜리 생성자
        // 매개변수의 개수나, 자료형이 다르면 생성가능
        this.id = id;
        this.pwd = pwd;
    }

    public String getInformation() {
        return "아이디: " + id + ", 비밀번호" + pwd + ", 이름: " + name;
    }

    public User(String id, String pwd, String name) {
//        this.id = id;
//        this.pwd = pwd;   //****동일한 코드 생략하고 싶다면?
        this(id, pwd); // 사전에 작성되어 있는 매개변수 2개짜리 다른 생성자를 호출 (print까지 수행됨)
        // *******this 생성자
        //******반드시 생성자의 첫번째줄에 와야한다!!

        /*
        ## this() ##
        1. 동일 클래스 내에 작성되어있는 다른 생성자 호출구문
        2. 해당생성자 호출이 완료되면 복귀함
        3. 유의사항! 반드시 첫문장으로 기술 (this.name 선언 후 this() 호출하면 안됨.)
         */

        this.name = name;
    }
}
