package com.inyong.section03.interface_implements;

public class Application {
    public static void main(String[] args) {
        //new Person(); 에러 발생
        //new Behavior(); interface 생성 불가

        Behavior[] arr = new Behavior[2];
        arr[0] = new Student("홍귈똥", 15, "더블sg 와이번스", 2);
        arr[1] = new Worker("김말순", 35, "SSG I&C", "사장");

        for (Behavior b : arr) {
            System.out.println(b);
            Behavior.born();
            b.work();
            b.eat();
            b.die();

            System.out.println("===============");
        }


        /*
        # 클래스에서 클래스를 상속받을때
            : 단일 상속
            : extends 클래스
            : 화살표 "실선"

        # 클래스에서 인터페이스를 구현(상속)할 때
            : 다중 상속 가능
            : implements, 인터페이스, 인터페이스, ...
            : 화살표 "점선"

        # 인터페이스에서 인터페이스를 상속 받을 때
            : 다중 상속 가능
            : 인터페이스 extends 인터페이스, 인터페이스, ..
            : 화살표 "실선"




            extends 일반 < extends 추상클래스 < implements 인터페이스
            강제성이 더 짙어짐

         */
    }
}
