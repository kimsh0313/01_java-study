package com.jun.section03.intetface_implements;

public class Application {
    public static void main(String[] args) {

//         new Person();   // 추상클래스라서 생성 불가
//         new Behavior(); // 인터페이스라서 생성 불가

        Behavior[] arr = new Behavior[2];
        arr[0] = new Student("홍길동", 15, "SSG Academy", 2);
        arr[1] = new Worker("김말순", 35, "SSG I&C", "차장");


//        for(int i=0; i<arr.length; i++){arr[i]}

        for(Behavior b : arr){
            System.out.println(b);
            Behavior.born();
            b.work();
            b.eat();
            b.die();
            System.out.println("=========================");
        }
        /*
            # 클래스에서 클래스를 상속받을 때
                : 단일상속만 가능
                : 클래스 extends 클래스
                : 화살표 "실선"

            # 클래스에서 인터페이스를 구현(상속) 할 때
                : 다중상속 가능
                : 클래스 implements 인터페이스, 인터페이스, ....
                : 화살표 "점선"

            # 인터페이스에서 인터페이스를 상속받을 때
                : 다중상속 가능
                : 인터페이스 extends 인터페이스, 인터페이스, ...
                : 화살표 "실선"

                extends 일반클래스 --> extends 추상클래스 --> implements 인터페이스

                -------------------------------------------------------------->
                                   강제성이 더 짙어짐

         */

    }
}
