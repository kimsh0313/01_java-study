package com.ino.section04.date_calendar_time;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println(today);
        System.out.println(today instanceof GregorianCalendar);

        Calendar calenday = new GregorianCalendar();
        System.out.println(today);

        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH)+1;
        int day = today.get(Calendar.DATE);
        int ampm = today.get(Calendar.AM_PM);
        int time24 = today.get(Calendar.HOUR_OF_DAY);
        int time12 = today.get(Calendar.HOUR);
        int min = today.get(Calendar.MINUTE);
        int sec = today.get(Calendar.SECOND);


        System.out.println("year : " + year + " month : " + month + " day : " + day + " ampm : " + ampm + " time : " + time12 + " min : " + min + " sec : " + sec);


        Calendar cal1 = new GregorianCalendar();
        cal1.set(Calendar.YEAR, 2023);
        cal1.set(Calendar.MONTH, Calendar.JULY);
        cal1.set(Calendar.DATE, 29);
        System.out.println(cal1.toString());

        Calendar cal2 = new GregorianCalendar(2023, Calendar.JULY, 11, 15, 30, 20);

        Date calToDate = new Date(cal2.getTimeInMillis());
    }
}
