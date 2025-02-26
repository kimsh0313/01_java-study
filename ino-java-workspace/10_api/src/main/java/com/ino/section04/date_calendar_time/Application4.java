package com.ino.section04.date_calendar_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDate.now;

public class Application4 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate day = LocalDate.of(2024, 1, 12);
        System.out.println(now);

        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfMonth());

        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(lt.toString().substring(0,8));
        System.out.println(ldt);

        LocalTime time2 = LocalTime.of(13, 59, 20);
        System.out.println(time2);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YY-MM-dd");
        System.out.println(dateTimeFormatter.format(ldt));
    }
}
