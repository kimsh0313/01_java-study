package section03.interface_implements;

public interface Behavior {
    /**
     * 인터페이스
     * 1. 반드시 추상메서드만 가능.
     * 2. 필드는 상수필드만 선언 가능 - public static final ~~ . 생략이 가능하다.
     * 3. 인터페이스는 다중상속이 가능하다. - implements
     */

    int OPENING_TIME = 9;
    int CLOSING_TIME = 18;

    void eat();

    void work();

    //static 메서드는 정의 가능, 단 impl클래스에서 오버라이딩은 불가능
    static void born() {
        System.out.println("태어남");
    }

    //default는 오버라이딩 가능 - public으로
   default void die(){
        System.out.println("죽음");
    }

}
