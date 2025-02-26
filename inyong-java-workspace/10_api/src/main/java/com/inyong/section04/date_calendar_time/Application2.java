package com.inyong.section04.date_calendar_time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {

//        Calendar today = Calendar.getInstance();
//        System.out.println(today);
//        System.out.println(today instanceof GregorianCalendar);

        Calendar today = new GregorianCalendar();
        System.out.println(today);

        int year = today.get(1);
        int year2 = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH);
        int date = today.get(Calendar.DATE);
        int hour12 = today.get(Calendar.HOUR);
        int hour24 = today.get(Calendar.HOUR_OF_DAY);
        int min = today.get(Calendar.MINUTE);
        int second = today.get(Calendar.SECOND);

        // 방법1. 현재 날짜 및 시간의 객체생성 => 값 수정
        Calendar cal1 = new GregorianCalendar();
        cal1.set(Calendar.YEAR, 2023);
        cal1.set(Calendar.MONTH, 5);
        cal1.set(Calendar.DATE, 11);

        System.out.println(cal1);

        // 방법2. 생성할 때 값 전달하기
        Calendar cal2 = new GregorianCalendar(2023, Calendar.JUNE, 11);
        Calendar cal3 = new GregorianCalendar(2023, Calendar.JUNE, 11,15,30,20);
        System.out.println(cal2);
        System.out.println(cal3);

        Date calToDate = new Date( cal3.getTimeInMillis());
        System.out.println(calToDate);









    }
}
