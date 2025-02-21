package section02.abstract_extends;

public class BasketBall extends Sports{

    /**
     * ## 추상메서드가 있는추상 클래스를 상속 받을 경우
     * 1. 자식도 추상으로 만들기
     * 2. 추상 메서드 선언하기
     */
    @Override
    public void rule() {
        System.out.println("공을 손으로");
    }
}
