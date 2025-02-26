package com.minkook.section01.polymorphism;

public class Application {
    public static void main(String [] args){
        System.out.println("1. 부모타입 레퍼런스로 부모인스턴스 관리");
        Parent p1 = new Parent();
        p1.printParent(); //p1 레퍼런스로 Parent에만 접근가능

        System.out.println("2. 자식타입 레퍼런스로 자식인스턴스 관리");
        Child1 c1 = new Child1();
        c1.printChild1();
        c1.printParent();
        //c1 레퍼런스로 child1,parent 둘다 접근가능

        System.out.println("3. 부모타입 레퍼런스로 자식인스턴스 관리(다형성)");
        Parent p2 = new Child1();
        p2.printParent();
        ((Child1)p2).printChild1();
        
        //c1 레퍼런스로 child1,parent 둘다 접근가능

        
        /*
            ## 클래스 형변환
            1. 상속구조의 클래스들 간에는 형변환 가능
            2. 종류
                1) UpCasting
                -자식타입이 부모타입(상위)으로 형변환되는 과정
                -자동형변환(묵시적형변환)
                -ex) 자식.부모메소드()
                    부모 = 자식인스턴스
                    
               2) DownCasting
                -부모타입이 자식타입(하위)으로 형변환 되는 과정
                -강제형 변환(명시적 형변환)
                -ex) ((자식)부모).자식메소드
         */

        System.out.println("=======================================================");
        
        /*
            ## 다형성 ##
            1. polymorphism
            2. 하나의 타입으로 여러 인스턴스를 가질 수 있는것
            3. 따라서 하나의 타입으로 여러 타입의 인스턴스로 처리할 수 있고
               하나의 메소드 호출로 인스턴스별로 각기 다르 방법으로 동작되게 할 수 있음
            4. 다형성의 장점
                1) 여러타입의 객체를 하나의 타입으로 관리하므로 유지보수성, 생산성 향상
                2) 상속을 기반한 기술이므로 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
                3) 확장성이 좋은 코드를 작성할 수 있음
                4) 결합도를 낮춰 유지보수성을 증가시킬 수 있음
         */
        Child1[] arr1 = new Child1[2];
        arr1[0] = new Child1(1,2,4);
        arr1[1] = new Child1(2,3,5);

        Child2[] arr2 = new Child2[2];
        arr2[0] = new Child2(2,1,5);
        arr2[1] = new Child2(5,7,2);

        //다형성적용후
        Parent[] arr = new Parent[4];

        arr[0] = new Child1(1,2,4);
        arr[1] = new Child2(2,1,5);
        arr[2] = new Child2(5,7,2);
        arr[3] = new Child1(4,3,2);

        //다형성장점1. 여러타입의 객체를 하나의 타입으로 관리할 수 잇음

        ((Child1)arr[0]).printChild1();
        ((Child2)arr[1]).printChild2();
        //((Child1)arr[2]).printChild1(); //ClassCastException (클래스 형변환 오류)
        ((Child2)arr[2]).printChild2();
        ((Child1)arr[3]).printChild1();

        System.out.println("=======================================================");

        for(int i = 0; i<arr.length; i++){
            /*
                if(i == 0 || i == 3){
                    ((Child1)arr[i]).printChild1();
                }else{
                    ((Child2)arr[i]).printChild2();
                }

             */

            /*
                ## instanceOf 연산자 ##
                레퍼런스 변수가 참조하는 실제 인스턴스 타입이 특정 클래스 타입과 일치하는 지 비교해주는 연산
             */
            if(arr[i] instanceof Child1){
                ((Child1)arr[i]).printChild1();
            }else {
                ((Child2)arr[i]).printChild2();
            }
        }

        System.out.println("=======================================================");

        for(int i = 0; i<arr.length; i++){
            /*
                ## 동적 바인딩 ##
                컴파일 당시에는 해당 레퍼런스타입의 메소드와 연결되어 있다가 (정적바인딩)
                런타임 당시 실제 인스턴스가 가지는 오버라이딩 된 메소드로 바인딩이 바뀌어 동작되는걸의미
             */
            arr[i].printParent();
        }
        /*
            다형성장점2 모든 인스턴스에 동일 메세지를 수신하도록 진행
         */

    }
}
