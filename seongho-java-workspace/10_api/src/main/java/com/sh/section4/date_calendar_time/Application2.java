package com.sh.section4.date_calendar_time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2  {
    public static void main(String[] args) {
        /*
        java.util.calendar
        날짜 및 시간에 대한 값 기록
        추상클래스> 객체 생성 불가
         국가별 ,시간대로별로 구체와시켜둔 하위 클래스들로 생성해서 사용(다형성
         */
        //Calendar today=new calendar();
        //방법1 static getInstance() 메소드 호출로 생성된 하위객체 받기
        Calendar today =Calendar.getInstance();
        System.out.println(today);

        Calendar call = new GregorianCalendar();
        call.set(Calendar.YEAR,2023);
        call.set(Calendar.MONTH,Calendar.JUNE);
        call.set(Calendar.DATE,11);
        System.out.println(call);

        Calendar car2 = new GregorianCalendar();

        Date calToDate =new Date(call.getTimeInMillis());
        System.out.println(calToDate);

        System.out.println(car2);

    }
}
