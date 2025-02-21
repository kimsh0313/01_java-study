package com.ino.section02.abstract_extends;

public class Application {
    public static void main(String[] args) {
//        Sports s = new Sports() {} -> 생성 불가
        Sports s1 = new BasketBall();
        Sports s2 = new FootBall();
        Sports[] arr = new Sports[2];
        arr[0] = new BasketBall();
        arr[1] = new FootBall();

        for (int i = 0; i < arr.length; i++) {
            arr[i].rule(); // dynamic binding
        }
    }
}
