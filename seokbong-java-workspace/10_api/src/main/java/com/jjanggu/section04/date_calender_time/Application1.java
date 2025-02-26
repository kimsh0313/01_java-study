package com.jjanggu.section04.date_calender_time;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {

        /*
            ## java.util.Date ##
            1. 날짜 및 시간에 대한 값을 기록할 수 있는 클래스
            2. JDK 1.0 부터 날짜 취급을 위해 사용되던 클래스로
               다국적으로 쓰이기에 적합하지 않음
               => 생성자를 비롯해 대부분의 메소드가 Deprecated 되었음
         */

        // 1) 기본 생성자로 생성 : 현재 운영체제의 날짜 및 시간 정보가 담김
        Date today = new Date();
        System.out.println(today); // 요일 월 며칠 시각 KST(korea standard time) 년도 // toString() 오버라이딩 되어있음

        // getTime() : 현재 시간 정보를 millisecond 로 반환 (long형)
        System.out.println(today.getTime());

        // 2) 매개변수 생성자로 생성 : 특정 날짜 및 시간 정보가 담기게 하고자 할 경우 사용
        //    Date(long)         : 세팅하고자 하는 날짜 및 시간 정보의 millisecond 단위 값 전달
        Date date = new Date(1740115167566L);
        System.out.println(date);
    }
}
