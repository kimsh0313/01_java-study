package com.kyungbae.section01.polymorphism;

public class Application {

    public static void main(String[] args) {

        System.out.println("1. 부모타입 레퍼런스로 부모인스턴스 관리");
        Parent p1 = new Parent();
        p1.printParent();
        // `p1` 레퍼런스로 `parent`에만 접근 가능

        System.out.println("2. 자식타입 레퍼런스로 자식인스턴스 관리");
        Child1 c1 = new Child1();
        c1.printChild1();
        c1.printParent();
        // `c1` 레퍼런스로 `Child1`, `Parent` 둘 다 접근 가능

        System.out.println("3. 부모타입 레퍼런스로 자식인스턴스 관리 (다형성)");
        Parent p2 = /*(Parent)*/ new Child1();
        p2.printParent();
        ((Child1)p2).printChild1();

//        String str = (String) new Child1();
        System.out.println("===================================================================");

        // Child1 객체 2개와 Child2 객체 2개를 관리
        // 다형성 적용 전
        Child1[] arr1 = new Child1[2];
        arr1[0] = new Child1(1,2,4);
        arr1[1] = new Child1(2,3,5);

        Child2[] arr2 = new Child2[2];
        arr2[0] = new Child2(2,1,5);
        arr2[1] = new Child2(5,7,2);

        //다형성 적용 후
        Parent[] arr = new Parent[4];
        arr[0] = new Child1(1,2,4);
        arr[1] = new Child2(2,1,5);
        arr[2] = new Child2(5,7,2);
        arr[3] = new Child1(2,3,5);
        // 다형성장점1. 여러 타입ㅂ의 객체를 하나의 타입으로 관리할 수 있음

        ((Child1)arr[0]).printChild1();
        ((Child2)arr[1]).printChild2();
//        ((Child1)arr[2]).printChild1(); // Child2 객체를 Child1 으로 형변환을 진행하면 ClassCastException (클래스 형변환 오류)
        ((Child2)arr[2]).printChild2();
        ((Child1)arr[3]).printChild1();

        System.out.println("===================================================================");

        for (int i = 0; i < arr.length; i++) {

            /*
            if (i == 0 || i == 3) {
                ((Child1) arr[i]).printChild1();
            } else {
                ((Child2) arr[i]).printChild2();
            }
             */

            if (arr[i] instanceof Child1) {
                ((Child1) arr[i]).printChild1();
            } else {
                ((Child2) arr[i]).printChild2();
            }
        }

        System.out.println("===================================================================");

        // 동적바인딩
        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
        }
        /*
        enhanced for
        for (Parent parent : arr) {
            parent.print();
        }
         */
        System.out.println("===================================================================");

        Parent testP1 = new Parent();
        Child1 testC1 = new Child1();
        Parent testP2 = new Child1();

        System.out.println(testP1.hashCode());
        System.out.println(testC1.hashCode());
        System.out.println(testP2.hashCode());
        // Parent 타입이지만 Child1 메모리생성 (Child1 메모리엔 Parent가 포함되어있다.)
        // 따라서, 주소값은 Child1을 가리키지만 그 안에 Parent 타입만을 가져오고있다.
        System.out.println(((Child1)testP2).hashCode());
        // 강제 형변환을 통해 Parent 타입을 Child1 타입으로 변경하여 생성해둔 Child1 메모리에 접근할 수 있다.



    }

}
