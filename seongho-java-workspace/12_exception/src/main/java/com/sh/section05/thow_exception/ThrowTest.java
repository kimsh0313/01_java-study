package com.sh.section05.thow_exception;

public class ThrowTest {
    //자바는 예외로 인식 못하지만 프로그램에서 요구되는 예외상황있음
    //ㄴ직접 thow로 예외 발생시킬 수 있음
    //ㄴthrow new 예외클래스([예외 메세지])

    public void checkScore(int score){
        System.out.println(score+ "점 획득");
        if (score>100 || score<0){
            throw new RuntimeException();
        }
        System.out.println(score+"점을 획득");
    }
    public void checkAge(int age){
        if (age<0|| age>120){
            throw new RuntimeException("바보 ");

        }
        System.out.println(age +"살");
    }
    public void checkGrade(char grade){
        if (!(grade>='A' && grade<='D')){
            throw  new Exception(grade+"은 유효X");
        }
        System.out.println(grade+"등급");
    }
}
