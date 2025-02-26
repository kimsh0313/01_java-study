package com.seungjoo.section04.date_calender_time;

import java.util.Date;

public class Application {
    public static void main(String[] args) {

        // 1) 기본 생성자로 생성
        Date today = new Date();
        System.out.println(today.getTime());

        //getTime(): 현재 시간 정보를 milliseconde 단위로 반환
        System.out.println(today.getTime());


        //2) 매개변수 생성자로 생성: 특정 날짜 및 시간 정보가 담기게 하고자 할 경우 사용
        //ㅅ[팅하고자 하는 날짜 및 시간 정보의 millisecond 단위 값 전달
        Date date = new Date(130224433434L);
        System.out.println(date);
    }
}
