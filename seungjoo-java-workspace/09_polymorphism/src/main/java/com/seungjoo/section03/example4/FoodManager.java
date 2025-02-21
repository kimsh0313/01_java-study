package com.seungjoo.section03.example4;

public class FoodManager {

    // 내가 먹고싶은 음식 객체만 전달받는 메소드 구현


    public void eat(Food food){}


    //Eatable 타입으로 매개변수 설정시 -> Eatable을 구현하는 음식 객체만 넘겨받을 수 있음.
    public void eat(Eatable food){

    }
}
