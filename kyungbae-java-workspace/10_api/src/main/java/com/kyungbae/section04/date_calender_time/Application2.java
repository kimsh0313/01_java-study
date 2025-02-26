package com.kyungbae.section04.date_calender_time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
//        Calendar today = new Calendar(); // 추상클래스라 바로 생성 불가

        // 방법1. static getInstance() 메소드 호출로 생성된 하위객체 받기
        /*
        Calendar today = Calendar.getInstance();
        System.out.println(today);
        System.out.println(today instanceof GregorianCalendar);
         */

        // 방법2. 직접 GregorianCalendar 생성
        Calendar today = new GregorianCalendar();
        System.out.println(today);

        // 년, 월, 일, 시, 분, 초 정보를 get메소드로 알아올 수 있음
        int year = today.get(Calendar.YEAR); // (1) 이랑 동일 상수필드로 만들어놓음
        int month = today.get(Calendar.MONTH) + 1; // 월 = 0~11 따라서 + 1 해줘야 함
        int date = today.get(Calendar.DATE);
        int ampm = today.get(Calendar.AM_PM); // AM일 경우 0 | PM일 경우 1
        int hour12 = today.get(Calendar.HOUR);
        int hour24 = today.get(Calendar.HOUR_OF_DAY);
        int min = today.get(Calendar.MINUTE);
        int sec = today.get(Calendar.SECOND);

        System.out.printf("%d년 %d월 %d일 %s%d시(%d시) %d분 %d초\n"
                , year, month, date, (ampm == 0 ? "오전" : "오후"), hour12, hour24, min, sec
        );

        // 내가 원하는 날짜 및 시간으로 세팅
        // 방법1. 현재 날짜 및 시간의 객체를 생성 => 값 수정
        Calendar cal1 = new GregorianCalendar();
        cal1.set(Calendar.YEAR, 2023);
        cal1.set(Calendar.MONTH, Calendar.JUNE); // 월 = 0~11 | 상수필드 Calendar.월(영어)로 설정 가능
        cal1.set(Calendar.DATE, 11);

        System.out.println(cal1);

        // 방법2. 생성할때 값 전달하기
        Calendar cal2 = new GregorianCalendar(2023, Calendar.JUNE, 11);
        Calendar cal3 = new GregorianCalendar(2023, Calendar.JUNE, 11, 23, 30, 20);

        // Calendar 객체를 Date 객체로 변환하기
        Date calToDate = new Date(cal3.getTimeInMillis()); // getTimeInMillis() = Calendar 값을 millisecond 단위로 변환
        System.out.println(calToDate);

        // 단점.
        // 윤년 연산을 못함
    }
}
