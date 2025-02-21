package section03.example4;

public class FoodManager {

    // Food 상속받은 객체 다 가능, 음식만 가능
    public void eat(Food food) {

    }

    /**
     * 음식 중에서 -> 사용자가 먹을 수 있는 음식만 가능 **더 구체화***
     * 인터페이스로 더 구체화하여 사용자가 먹을 수 있는 음식을 따로 처리 가능.
     */
    public void eat(Eatable food){

    }
}
