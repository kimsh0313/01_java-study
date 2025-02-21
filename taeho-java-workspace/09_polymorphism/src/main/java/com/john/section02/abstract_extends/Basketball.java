package com.john.section02.abstract_extends;

/*
    추상 메서드가 있는 추상 클래스를 상속받는 방법
        1.추상 메서드를 가질 수 있는 형태로 해당클래스도 추상클래스로 변환
        2.현재 클래스에서 추상메서드를 완성(구현===implements)

 */
public class Basketball extends Sports{
    @Override
    public void rule() {
        System.out.println("Basketball rule");
    }
}
