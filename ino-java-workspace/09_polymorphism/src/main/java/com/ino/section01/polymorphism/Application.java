package com.ino.section01.polymorphism;

public class Application {
    public static void main(String[] args) {

        System.out.println("1. 부모타입 레퍼런스로 부모 인스턴스 관리");
        Parent p1 = new Parent();
        p1.printParent();

        System.out.println("2. 자식타입 레퍼런스로 자식 인스턴스 관리");
        Child1 c1 = new Child1();
        c1.printParent();
        c1.printChild1();

        System.out.println("3. 부모타입 레퍼런스로 자식 인스턴스 관리 (다형성)");
        Parent p2 = new Child1(1,2,3); // 내부적으로 자동 형변환 진행.  child1 -> parent 우 -> 좌
        System.out.println(p2.getClass());
        System.out.println(p2.getInformation());
        System.out.println(((Child1)p2).getZ());

        Parent[] arr = new Parent[4];
        arr[0] = new Child1(1, 2, 5);
        arr[1] = new Child2(2, 2, 5);
        arr[2] = new Child1(3, 2, 5);
        arr[3] = new Child2(4, 2, 5);

        // instanceof
        for (int i = 0; i < 4; i++) {
            if ((arr[i] instanceof Child1)) {
                ((Child1) arr[i]).printChild1();
            } else {
                ((Child2) arr[i]).printChild2();
            }
        }
    }
}
