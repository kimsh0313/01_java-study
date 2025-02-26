package com.john.section03.example4;

public class FoodManager {
    public void eat(Food food) {

    }
    
    // Eatable 타입으로 매개변수 설정시 => Eatable을 구현하는 음식객체만 넘겨받을 수 있음
    public void eat(Eatable food){}
}
