package com.john.section03.interface_implements;

/*
    클래스에서 클래스를 상속받을 때
        - 단일 상속만 가능
        - 클래스 extends 클래스
        - 화살표 "실선 느낌"
     클래스에서 인터페이스를 구현할 때
        - 다중 상속 가능
        - 클래스 implements 인터페이스1, 인터페이스2...
        - 화살표 '점선 느낌'
     인터페이스에서 인터페이스를 상속 받을 때
        - 다중 상속 가능
        - 인터페이스 extends 인터페이스, 인터페이스...
        - 화살표 "실선 느낌"
 */
public class Application {
    public static void main(String[] args) {
        // new Person() 추상클래스로 생성불가
        // new Behavior() 인터페이스로 생성불가

        Behavior[] arr = new Behavior[2];
        arr[0] = new Student("후..",15,"비",2);
        arr[1] = new Worker("김",25,"ㄴㄴㄴ","차");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            Behavior.born();
            arr[i].work();
            arr[i].eat();
            arr[i].die();
        }
    }
}
