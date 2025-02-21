package com.kyungbae.section03.interface_implements;

public class Application {

    public static void main(String[] args) {

//        new Person(); // 에러발생 (추상클래스)
//        new Behavior(); // 에러발생 (인터페이스)

//        Person[] arr = new Person[3];
        Behavior[] arr = new Behavior[2];
        arr[0] = new Student("길동홍", 15, "SSG중학교", 2);
        arr[1] = new Worker("말숙순", 35, "SSG I%C", "차장");

//        for (int i = 0; i <arr.length; i++) {
//            arr[i]
//        }

        for (Behavior a : arr){
            System.out.println(a);
            Behavior.born();
            a.work();
            a.eat();
            a.die();
            System.out.println("======================================");
        }


    }

}
