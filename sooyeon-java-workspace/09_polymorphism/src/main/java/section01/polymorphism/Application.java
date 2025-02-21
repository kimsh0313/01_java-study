package section01.polymorphism;

public class Application {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.printParent();

        System.out.println("자식 레퍼런스, 자식 인스턴스");
        Child1 c1 = new Child1();
        c1.printChild1();
        c1.printParent(); //부모메서드도 사용 가능

        System.out.println("부모 레퍼런스, 자식 인스턴스(다형성");
        Parent p2 = new Child1();
        //Parent p2 = (Parent) new Child1();
        p2.printParent();
        ((Child1) p2).printChild1();
        /**
         * ## 동적 바인딩
         * 컴파일시 해당 레퍼런스 타입으로 메서드와 연결되어ㅣㅇㅆ다 - 정적
         * 런타임시 실젱 니스턴스가 가지ㅡㄴ 오버라이딩된 메서드로 바인딩이 바뀌어 동작
         */
        //자식 메서드 사용 불가

        /**
         * ## 클래스 형변환
         * 1. 상속구조의 클래스들 간의 형변환 가능
         * - UpCasting
         *  * 자식 -> 부모
         *  * 자동
         * - DownCasting
         *  * 부모 -> 자식
         *  * 강제, 명시적형변환
         */

        System.out.println("============================================");
        /**
         * ##다형성
         * - 하나의 타입으로 여러 인스턴스를 가질 수 있음
         * - 각 인스턴스에 따라 다른 행동이 수행되게 할 수 있음
         *      - 하나의 타입으로 여러 타입 관리 가능 - 유지보수,결합도, 확장성
         * - 상속을 기반한 기반
         */

        Child1[] arr1 = new Child1[2];
        arr1[0] = new Child1(1, 2, 4);
        arr1[1] = new Child1(2, 3, 5);

        Child2[] arr2 = new Child2[2];
        arr2[0] = new Child2(2222, 1111, 5555);
        arr2[1] = new Child2(5557, 7777, 2222);

        Parent[] arr = new Parent[4];
        arr[0] = new Child1(1, 2, 4);
        arr[1] = new Child1(2, 3, 5);
        arr[2] = new Child2(2222, 1111, 5555);
        arr[3] = new Child2(5557, 7777, 2222);

        arr[0].printParent();
        ((Child1)arr[0]).printChild1();

        for(Parent p : arr){
            if(p instanceof Child1 child1){
                child1.printChild1();
            }else if (p instanceof Child2 child2){
                child2.printChild2();
            }
        }
    }

}

