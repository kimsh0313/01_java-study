package com.seungjoo.section04.date_calender_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application4 {
    public static void main(String[] args) {



        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        System.out.println(date1.getYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfWeek());

        LocalDate date2 = LocalDate.of(2024,5,11);
        System.out.println(date2);


        System.out.println("======");

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        System.out.println(time1.toString().substring(0,8));

        LocalTime time2 = LocalTime.of(13,30,20);
        System.out.println(time2);

        System.out.println("=======");


        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1);
        System.out.println(dateTime1);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String nowStr = dtf.format(dateTime1);
        System.out.println(nowStr);














    }
}
