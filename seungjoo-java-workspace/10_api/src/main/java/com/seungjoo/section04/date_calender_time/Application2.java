package com.seungjoo.section04.date_calender_time;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {

//     //  Calender today = new Calendar.getInstance();
//
//        //방법1. static getInstance() 메소드 호출로 생성된 하위객체 받기
//        Calendar today = Calendar.getInstance();
//        System.out.println(today);
//
//        //방법2. 직접 GregorianCalender 사용
//        System.out.println(today instanceof GregorianCalendar);
//        System.out.println(today);
//
//
//
//        //년,월, 일, 시, 분, 초 정보를 get메소드로 알아올 수 있음.
//        int year = today.get(Calendar.YEAR);
//        int month = today.get(Calendar.MONTH) + 1;
//        int date = today.get(Calendar.DATE);
//        int ampm = today.get(Calendar.HOUR);
//        int hour12 = today.get(Calendar.HOUR);
//        int hour24 = today.get(Calendar.HOUR_OF_DAY);
//        int min = today.get(Calendar.MINUTE);
//        int sec = today.get(Calendar.SECOND);


        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DATE, 20);
        cal.set(Calendar.DATE, 11);

        System.out.println(cal);

        //방법2. 생성할 떄 값 전달하기
        Calendar cal2 = new GregorianCalendar();
        Calendar cal3 = new GregorianCalendar();

        //* Calendar 객체를 Date로 변환하기
        Date calToDate = new Date(cal3.getTimeInMillis());







    }
}
