package com.younggalee.section04.date_calender_time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        /*
        ## java.util.Calendar ##
        1. JDk 1.1 에 Date 클래스의 대안으로 나옴
        2. 날짜 및 시간에 대한 값 기록 가능
        3. 추상클래스 >> 객체  생성불가
          국가별, 시간대별로 구체화시켜둔 하위 클래스들로 생성해서 사용 (다형성)
         */

        // 방법1 static getInstance() 메소드 호출로 생성된 하위객체 받기
        // Calender는 추상클래스이기 때문에 직접 인스턴스 생성이 불가하며 정적 메서드인 getInstance() 사용해야한다.
        Calendar today = Calendar.getInstance();
        System.out.println(today instanceof GregorianCalendar);   //true 해당객체가 특정 클래스 및 인터페이스의 인스턴스인지 확인하는 키워드

        //방법2. 직접 GregorianCalendar 생성
        Calendar today2 = new GregorianCalendar();
        System.out.println(today2);

        //년, 월, 일, 시, 분, 초 정보를 get메소드로 알아올 수 있음
        int year = today2.get(1);
        int year2 = today2.get(Calendar.YEAR);
        int month = today2.get(Calendar.MONTH);
        int date = today.get(Calendar.DATE);
        // AM_PM / HOUR / HOUR_OF_DAY / MINUTE / SECOND
        System.out.printf("%d년 %d월 %d일", year,month,date);

        // ## 내가 원하는 날짜 및 시간으로 세팅 ##
        //방법1. 현재 날짜 및 시간의 객체를 생성 >> 값 수정
        Calendar cal1 = new GregorianCalendar();
        cal1.set(Calendar.YEAR, 2023);
        cal1.set(Calendar.MONTH, Calendar.JULY); // Calendar 에서 월은 0~11로 취급 또는 Calendar.달
        cal1.set(Calendar.DATE,11);
        System.out.println(cal1);
        System.out.println("===========");

        // 방법2. 생성할 때 값 전달하기
        Calendar cal2 = new GregorianCalendar(2023, Calendar.JULY, 11);
        Calendar cal3 = new GregorianCalendar(2023, Calendar.JULY, 11,15, 30, 20);

        // Calendar 객체를 Date 객체로 변환하기
        Date calToDate = new Date(cal3.getTimeInMillis());
        System.out.println(calToDate);
    }
}
