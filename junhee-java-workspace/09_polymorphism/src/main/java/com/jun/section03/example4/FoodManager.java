package com.jun.section03.example4;

public class FoodManager {

    //내가 먹고싶은 음식 객체만 전달맏는 메소드 구현

    // Food 타입으로 매개변수 설정시 => Food를 상속받는 모든 음식객체들이 다 들어올 수 있음
    public void eat(Food food){


    }

    //Eatable 타입으로 매개변수 설정시 => Eatable을 구현하는 음식객체만 넘겨받을 수 있음
    public void eat(Eatable eat){

    }

}
