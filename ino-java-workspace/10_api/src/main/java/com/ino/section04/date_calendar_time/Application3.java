package com.ino.section04.date_calendar_time;

import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.lang.Thread.sleep;

public class Application3 {
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        Date today = new Date();
        System.out.println( sdf.format(today));

        sleep(10000);
        Calendar c = Calendar.getInstance();
        System.out.println(sdf.format(c.getTimeInMillis()));
    }
}
