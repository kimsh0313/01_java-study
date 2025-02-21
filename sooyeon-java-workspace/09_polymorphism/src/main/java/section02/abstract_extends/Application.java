package section02.abstract_extends;

public class Application {
    public static void main(String[] args) {
        /**
         * ## 추상클래스
         * 1. 형태를 갖추지 못한 클래스
         * 2. 일반ㅍ리드 + 일반메서드 + 추상메서드(오버라이딩 강제)
         * 3. 추상클래스는 인스턴스 생성 불가. N n = new N();
         *         단, 변수선언은 가능 N n;
         *         -> 추상클래스를 상속받는 하위 클래스로 인스턴스를 생성해야함.
         *
         * * 오버라이딩이 자동으로 됨
         */

        Sports s1 = new BasketBall();
        Sports s2 = new FootBall();

        Sports[] arr = {new BasketBall(), new FootBall()};

        for(Sports s : arr) {
            s.rule();
        }

    }
}
