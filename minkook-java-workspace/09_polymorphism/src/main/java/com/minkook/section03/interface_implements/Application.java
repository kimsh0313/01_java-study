package com.minkook.section03.interface_implements;

public class Application {
    public static void main(String [] args){
//        new Person(); 에러발생
//        new Behavior();
        Behavior [] arr = new Behavior[2];
        arr[0] = new Student("홍길동",15,"SSG Academy",2);
        arr[1] = new Worker("김말순",35,"SGG I&C","차장");

        for(Behavior b : arr){
            System.out.println(b);
            Behavior.born();
            b.work();
            b.eat();
            b.die();
        }

        /*
            # 클래스에서 클래스를 상속받을 때
               : 단일상속만 가능
               : 클래스 extends 클래스
               : 화살표 "실선"
               
           # 클래스에서 인터페이스를 구현(상속)할 때
               :다중상속 가능
               : 클래스 implements 인터페이스, 인터페이스....
               : 화살표 "점선"
               
           # 인터페이스에서 인터페이스를 상속받을때
            : 다중상속 가능
            : 인터페이스 extends
            : 화살표 실선
         */
        
        /*
            extends 일반클래스 -> extends 추상클래스 -> implements 인터페이스
            강제성이 짙어짐 
         */
    }
}
