package com.younggalee.section03.interface_implements;

public class Application {
    public static void main(String[] args) {
//        new Person(); // 추상클래스라서 불가능
//        new Behavior();  //인터페이스라서 생성불가

        Behavior[] arr = new Behavior[2];
        arr[0] = new Student("홍길동", 15, "SSG Academy", 2);
        arr[1] = new Worker(35, "이가영", "SSG Academy", "차장");

        for(Behavior b : arr){
            System.out.println(b);
            Behavior.born(); // b.born() 불가
            b.work();
            b.eat();
            b.die();
            System.out.println("-----------------");
        }

        /*
        # 클래스에서 클래스를 상속받을 때
            : 단일 상속만 가능
            : 클래스 extends 클래스
            : 클래스 다이어그램에서는 (자식 to 부모)화살표, 실선 사용
        # 클래스에서 인터페이스 구현(상속)해야할때
            : 다중상속 가능
            : 클래스 implements 인터페이스1, 인터페이스2, ...
            : 클래스 다이어그램에서는 점선 사용
        # 인터페이스에서 인터페이스를 상속받을때
            : 다중상속 가능
            : 인터페이스 extends 인터페이스1, 인터페이스2, ...
            : 화살표 "실선"

        #

         */
    }
}
