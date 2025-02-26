package section03.wrapper;

import java.sql.Wrapper;

public class Application1 {
    public static void main(String[] args) {
        /**
         * Wrapper
         * 기본 자료형을 인스턴스화 시킬 수 있는 클래스
         *  - 기본자료형 데이터를 가지고 메거드를 호출해야될 때
         *  - 특정 메서드의 매개변수가 기본자료형이 아니라 객체타입만 받을 때
         *  - 다형성을 적용
         *
         *  Boolean,Byte,Short,Integer,Long,Float,Double,Character
         */

        int value1 = 20;
        int value2 = 30;

        Integer boxingNumber = value1;
        Integer boxingNumber2 = Integer.valueOf(value2);
        int unBoxingNumber1 = boxingNumber.intValue();
        int unBoxingNumber2 = boxingNumber2;

    }
}
