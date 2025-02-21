package com.sh.section4.date_calendar_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application4 {
    public static void main(String[] args) {
        /*
        java.time.LocalDate|LocalTime|LocalDateTime
        객체 생성 불가
        > static now()  : 현재 날짜 및 시간 정보를 가져옴
        > static of() :늑정 날짜 및 시간 정보를 세팅가능

         */

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
        System.out.println(date1.getYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getDayOfMonth());

        LocalDate date2 = LocalDate.of(1902 , 1, 11);
        System.out.println(date2);

        System.out.println("=================================");

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        System.out.println(time1.toString().substring(0,8));

        //

        LocalTime time2 = LocalTime.of(13,30,20);
        System.out.println(time2);

        System.out.println("===============");

        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1);//년-월-일 T 시:분:초.나노초
        System.out.println(dateTime1.toString().replace("T", ""));

        LocalDateTime datetime2 =LocalDateTime.of(2024,5,11,13,0,15);
        System.out.println(datetime2);

        //java.time.DateTimeFormatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH/hh mm분 ss초");
        String nowStr = dtf.format(dateTime1);
        System.out.println(nowStr);
    }
}
