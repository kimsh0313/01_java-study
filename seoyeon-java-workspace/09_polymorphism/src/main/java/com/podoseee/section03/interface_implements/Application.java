package com.podoseee.section03.interface_implements;

public class Application {
    public static void main(String[] args) {

//        new Person();     // 추상클래스라서 생성 불가
//        new Behavior();   // 인터페이스라서 생성 불가

        Behavior[] arr = new Behavior[2];
        arr[0] = new Student("이서연", 23, "SSG Academy", 2);
        arr[1] = new Worker("김수연", 26, "SSG I&C", "차장");

        //for(int i=0; i<arr.length; i++){ arr[i]
        for(Behavior b : arr){

            System.out.println(b);
            Behavior.born();
            b.work();
            b.eat();
            b.die();
            System.out.println("======================");
        }

        /*
             면접에서 많이 물어보는 개념!

             # 클래스에서 클래스를 상속받을 때

             # 클래스에서 인터페이스를 구현(상속)할 때

             # 인터페이스에서 인터페이스를 상속받을 때

         */
    }
}
