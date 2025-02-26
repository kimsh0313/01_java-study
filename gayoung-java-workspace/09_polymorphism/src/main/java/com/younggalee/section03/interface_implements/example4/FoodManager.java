package com.younggalee.section03.interface_implements.example4;

public class FoodManager {
    //내가 먹고싶은 음식 객체만 전달받는 메소드 구현

    //Food 타입으로 매개변수 설정시 >> Food를 상속받는 모든 음식객체들이 다 들어올 수 있음
    public void eat(Food food){}


    // Eatable 타입으로 매개변수 설정시 >> Eatable을 구현하는 음식 객체만 넘겨받을 수 있음 (텅비어있는 eatable이지만 이런식으로도 활용되기도 한다. )
    public void eat(Eatable food) {}// 이렇게 하면 Eatable 을 구현한 것만 들어옴
}
