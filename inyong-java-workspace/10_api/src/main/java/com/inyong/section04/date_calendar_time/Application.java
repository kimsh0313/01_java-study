package com.inyong.section04.date_calendar_time;


import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) {

        /*
        ## java.util.Date
        1. 날짜 및 시간에 대한 값을 기록할 수 있는 클래스 (자바 초창기)
        2. JDK 1.0 부터 날짜 취급을 위해 사용되던 클래스로 다국적으로 쓰이기에 좋지 않음
        => 생성자를 비롯해 대부분 메소드가 deprecated 되었음
         */

        // 1)기본생성자로 생성
        Date today = new Date();
        System.out.println(today); // toString 오버라이딩

        // getTime() : 현재 시간 정보를 millisecond 단위로 반환
        System.out.println(today.getTime());

        // 2) 매개변수 생성자로 생성 : 특정 날짜 및 시간 정보가 담기게 하고자 할 경우 사용
        // Date(long) : 세팅하고자 하는 날짜 및 시간의 정보 millisecond 단위 값 전달
        Date date = new Date(1740113392123L);
        System.out.println(date);





    }
}
