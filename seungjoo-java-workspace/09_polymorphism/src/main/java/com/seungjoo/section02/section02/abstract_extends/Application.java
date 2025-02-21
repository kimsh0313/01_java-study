package com.seungjoo.section02.section02.abstract_extends;

public class Application {
    public static void main(String[] args) {


        System.out.println("1.부모타입 레퍼런스로 부모인스턴스 관리");
        Parent p1 = new Parent();
        p1.printParent();
        //p1 레퍼런스로 Parent에만 접근 가능

        System.out.println("2.자식타입 레퍼런스로 자식인스턴스 관리");
        Child1 c1 = new Child1();
        c1.printChild1();
        c1.printParent();
        c1.print();

        System.out.println("3.부모타입 레퍼런스로 자식인스턴스 관리 (다형성)");
        Parent p2 = new Child1(); //내부적으로 자동 형 변환이 발생, 자식타입이 부모타입으로 형변환
        //Parent 타입이므로 Child에 정의되어있는 메서드 사용할 수x



        Child1[] arr1 = new Child1[2];
        arr1[0] = new Child1(1,2,4);
        arr1[1] = new Child1(2,3,5);

        Child2[] arr2 = new Child2[2];
        arr2[0] = new Child2(2,1,5);
        arr2[1] = new Child2(2,3,9);

        //다형성 적용후
        Parent[] arr = new Parent[4];

        arr[0] = new Child1(1,2,4);
        arr[1] = new Child2(2,3,5);
        arr[2] = new Child2(2,3,9);
        arr[3] = new Child1(3,1,5);


        arr[0].printParent(); //arr은 Parent타입이으므로 Child에 정의되어있는 메서드를 사용할 수 x

        ((Child1)arr[0]).printChild1();
        ((Child2)arr[1]).printChild2();
       // ((Child1)arr[2]).printChild1(); //ClassCastException 발생 (클래스 형변환 오류)
        ((Child2)arr[2]).printChild2();
        ((Child1)arr[3]).printChild1();

        System.out.println("===============");

        for(int i =0; i < arr.length; i++) {
            /*if(i==0 || i ==3){
                ((Child1)arr[i]).printChild1();

            }else{
                ((Child2)arr[i]).printChild2();
            } */


            if (arr[i] instanceof Child1) {
                ((Child1) arr[i]).printChild1();
            } else {
                ((Child2) arr[i]).printChild2();
            }
        }

            System.out.println("===============");


            for(int i = 0; i<arr.length; i++){
                arr[i].print();
            }
        /*

         */
























        }




















    }

