package com.younggalee.section03.interface_implements;

public interface Behavior {
    // my) static 필드라서 별다른 선언이나 생성없이 데이터 사용가능함. 좋은듯.
    // Behavior를 Interface로 만들면 가능!!

    /* 인터페이스 Interface
    1. **추상메소드와 상수필드만** 가질 수 있는 클래스의 변형체 ( public static final / public abstract)
    2. 필드 작성시 묵시적으로 상수필드이므로 public static final 생략 가능
    3. 메소드 작성시 묵시적으로 추상메소드이므로  public abstract 생략 가능
    4. 인터페이스는 다중 상속이 가능하다.
    5. 인터페이스는 상속 받을 때, implements 키워드 사용
     */

    // 일반필드 선언 불가 ( Only 상수필드)
    /*public static final*/ int OPENING_TIME = 9;
    public static final int CLOSING_TIME =18;

    //추상메소드 작성가능  >> 상속받으면 무조건 구현해야됨.
    /*public abstract*/ void eat();
    public abstract void work();

    //일반메소드는 작성불가능    *** 고정된 메소드 오버라이딩 불가
    // 단, static 메소드는 정의 가능 (JDK 1.8 추가된 기능)
    public static void born(){
        System.out.println("엄마 뱃속에서 태어났어요!");
    }

    // 단, default 메소드는 정의 가능 (jdk 1.8 추가)
    public default void die(){  // 구현 필수 아님 (abstract와 차이있음)
        // 여기서 default는 접근제거자가 아니라 인터페이스 키워드
        System.out.println("죽음!");
    }

    // extend 일클 >> extends 추클 >> implements 인터페이스  순으로 강제성이 짙어짐
}


/*
Q. 인터페이스에서는 추상메소드만 만들 수 있다고 배웠는데 static과 default 메소드는 뭐야?

전에는 인터페이스에서 추상 메소드만 정의할 수 있었지만, Java 8부터는 static 메소드와 default 메소드도 추가할 수 있게 되었습니다.

1. 추상 메소드 (abstract method) (강제)
- 구현 클래스에서 반드시 구현(Override)해야 합니다.
- 인터페이스의 기본 메소드 형태입니다.

2. static 메소드 (재생성 금지)
- 정적 메소드로, 인터페이스 이름으로 호출해야 합니다.
- 객체를 생성하지 않고도 사용 가능합니다.
- 오버라이딩(Overriding) 불가능합니다.
- 주로 유틸리티 메소드나 공통 기능 제공을 위해 사용됩니다.

3. default 메소드 (선택)
- 디폴트 구현을 제공하는 메소드입니다. (default 키워드 사용)
- 구현 클래스에서 선택적으로 오버라이딩할 수 있습니다.


static 메소드를 통해 유틸리티 메소드를 제공하여, 클래스처럼 활용할 수 있게 만들었습니다.
default 메소드를 통해 기본 구현을 제공함으로써, 기존 구현 클래스의 수정 없이도 새 기능을 추가할 수 있게 했습니다.


(클래스)데이터관리 vs (인터페이스)설계규약
 */
