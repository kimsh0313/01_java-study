package com.younggalee.section02.abstract_extends;

public class Application {
    public static void main(String[] args) {
        /*
        # 추상클래스 #
        1. abstract method
        2. 형태를 갖추지 못한 클래스 (즉, 미완성된 클래스)
        3. 일반필드 + 일반메소드 [ + 추상메소드]
        >> 추상메소드가 없어도 추상클래스 선언 가능
        4. 추상클래스로는 인스턴스 생성불가 ****
            추상클래스를 생성받는 하위 클래스를 이용하여 인스턴스 생성해야되고
            이때 추상 클래스는 상위 타입 레퍼런스로 사용될 수 있음. (다형성)
         (단, 레퍼런스 타입으로는 가능)

         //Sprot s = new Sports()는 불가능
         // 근데 Sports s 선언은 가능
         */
        Sports[] arr = new Sports[2];
        arr[0] = new BasketBall();
        arr[1] = new FootBall();

        for (int i=0; i<arr.length; i++){
            arr[i].rule();  //동적바인딩
        }

        for (Sports s : arr){
            s.rule();
        }

        /*
        # 추상클래스 사용 목적 #
        추상클래스의 추상메소드는 오버라이딩에 대한 강제성이 부여됨
        즉, 추상클래스를 상속받는 모든 하위 클래스들에 동일한 혀애의 메소드를
        정의하도록 **강제화** 시킬 수 있음.
         >> 메소드 통일성 확보
         >> 표준화된 틀을 제공

         기존 실습에서는 오버라이딩이 선택사항이었지만
         추상메소드 지정한 메소드에 한 하여 강제사항이 됨.

         */

    }
}
