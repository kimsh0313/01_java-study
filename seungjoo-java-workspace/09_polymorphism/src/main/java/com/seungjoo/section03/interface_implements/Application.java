package com.seungjoo.section03.interface_implements;

public class Application {
    public static void main(String[] args) {





        Behavior[] arr = new Behavior[2];
        arr[0] = new Student("홍길동", 15, "SSG Academy", 2);
        arr[1] = new Worker("김말순", 35, "SSG I&C", "차장");


        for (Behavior b : arr) {
            System.out.println(b);
            //b.born()이 안됨,
            Behavior.born(); //인터페이스를 통해 접근해야함, static메서드여서
            b.work();
            b.eat();
            b.die();
            System.out.println("==================");

        }
    }
}
