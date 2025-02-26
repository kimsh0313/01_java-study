package com.kyungbae.section04.date_calender_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// java.time.
public class Application4 {
    public static void main(String[] args) {

        // LocalDate
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        System.out.println(date1.getYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getDayOfMonth());

        LocalDate date2 = LocalDate.of(2023, 6, 11);
        System.out.println(date2);

        System.out.println("============================");

        // LocalTime
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        System.out.println(time1.toString().substring(0, 8)); // 나노초 빼고 보기

        // getHour(), getMinute(), getSecond(), getNano()

        LocalTime time2 = LocalTime.of(13, 30, 20);
        System.out.println(time2);

        System.out.println("============================");

        // LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime); // 년-월=일T시:분:초.나노초 형식으로 반환
        System.out.println(dateTime.toString().replace("T", "\t"));

        LocalDateTime dateTime2 = LocalDateTime.of(2023, 6, 11, 13, 0, 15);
        System.out.println(dateTime2);

        // java.time.DateTimeFormatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH(hh)시 mm분 ss초");
        String nowStr = dtf.format(dateTime);
        System.out.println(nowStr);

    }
}
