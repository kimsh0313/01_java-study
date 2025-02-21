package com.john.section01.polymorphism;


/*
    다형성(polymorphism)
    - 하나의 타입으로 여러 인스턴스를 가질 수 있는 것
    - 하나의 타입으로 여러 인스턴스 처리가능, 하나의 메서드 호출로 인스턴스별 다른 동작을 하도록 할 수 있음

    장점
        1. 느슨한 결합, 여러 타입의 객체를 하나의 타입으로 관리하므로 유지보수 및 생산성 향상
        2. 상속을 기반한 기술로 상속관계에 있는 모든 객체는 동일한 메시지 수신, 객체별 다르게 처리 가능 (동적 바인딩)
 */

public class Application {
    public static void main(String[] args) {

        /*
            부모타입의 레퍼런스로 부모인스턴스 관리
            부모타입의 인스턴스 = 부모타입의 주소값을 가진 객체를 생성
         */
        Parent p1 = new Parent();
        p1.printParent();
        System.out.println("===============");

        /*
            자식타입 레퍼런스로 자식 인스턴스 관리
         */
        Child1 c1 = new Child1();
        c1.printParent();
        c1.printChild1();
        System.out.println("===============");

        /*
            부모타입 레퍼런스로 자식 인스턴스 관리 == 다형성
            Parent p2 = (Parent) new Child2();
         */
        Parent p2 = new Child2();   // 자식 인스턴스를 생성했지만 Parent 타입으로 선언되어 있어 자식메서드 사용 불가
        ((Child2)p2).printChild2(); // down casting 을 사용하여 자식메서드를 사용
        System.out.println("===============");
        /*
            상속구조 클래스 간의 형변환 : up casting / down casting
            up casting
                - 자식타입이 부모타입(상위)으로 형변환
                - 자동형변환 됨(묵시적형변환)
                - ex) 자식.부모 메서드(), 부모(레퍼런스) = 자식인스턴스;
            down casting
                - 부모타입이 자식타입(하위)으로 형변환
                - 강제형변환(명시적형변환)
                - ex) ((자식타입)부모).자식메서드;
         */

        Child1[] child1Arr = new Child1[2];
        child1Arr[0] = new Child1(1,2,3);
        child1Arr[1] = new Child1(2,3,4);

        Child2[] child2Arr = new Child2[2];
        child2Arr[0] = new Child2(4,5,6);
        child2Arr[1] = new Child2(7,8,9);

        // using polymorphism
        Parent[] parentArr = new Parent[4];
        parentArr[0] = new Child1(1,2,3);
        parentArr[1] = new Child1(2,3,4);
        parentArr[2] = new Child2(4,5,6);
        parentArr[3] = new Child2(7,8,9);

        ((Child1)parentArr[0]).printChild1();
        ((Child2)parentArr[2]).printChild2();
//        클래스 형변환 오류
//        ((Child2)parentArr[1]).printChild2();
        System.out.println("===============");

        System.out.println("Ex1 Using instanceof (Static Binding)");
        // instanceof 참조하는 인스턴스 타입이 일치하는지 비교
        for(int i=0; i<parentArr.length; i++) {
            if(parentArr[i] instanceof Child1) {
                ((Child1)parentArr[i]).printChild1();
            } else{
                ((Child2)parentArr[i]).printChild2();
            }
        }

        System.out.println("===============");
        System.out.println("Ex2 Using Overriding (Dynamic Binding)");
        for (int i=0; i<parentArr.length; i++) {
            parentArr[i].print();
        }

    }
}
