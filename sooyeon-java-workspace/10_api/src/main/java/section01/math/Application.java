package section01.math;

public class Application {
    public static void main(String[] args) {
        /**
         * 자바 api - Application Programming Interface
         * 1. JDK 설치하면 제공됨
         */

        /**
         * ## java.lang.Math
         * 1. 수학과 관련된 기능을 제공하는 클래스
         * 2. 상수필드, static메서드로 구성
         *      -> 프로그램이 실행되면 static메모리에 올라가있다.
         * 3. 인스턴스 생성 필요 없음 - 생성자가 애초에 private - 싱글톤패턴????
         */

        System.out.println(Math.PI);
        System.out.println(Math.abs(-10)); //절대값
        System.out.println((int) Math.ceil(324234.2335125235));
        System.out.println(Math.round(234.2)); //반올림정수바환
        System.out.println(Math.floor(234.2)); //버림
        System.out.println(Math.rint(324.2));
    }
}
