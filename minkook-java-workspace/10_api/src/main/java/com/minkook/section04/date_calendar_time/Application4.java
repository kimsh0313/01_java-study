package com.minkook.section04.date_calendar_time;

import java.time.LocalDate;
import java.util.Locale;

public class Application4 {
    public static void main(String [] args){
        LocalDate ld = LocalDate.now();

        System.out.println(ld);
        System.out.println(ld.getYear());

        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.getDayOfMonth());
    }
}
