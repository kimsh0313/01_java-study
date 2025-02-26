package com.minkook.section04.date_calendar_time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String [] args){
        /*
            ## java.util.Calendar ##
            1. JDK 1.1에 Date 클래의 대안으로 나옴
            2. 날짜 및 시간에 대한 값 기록 가능
            3. 추상클래스 => 객체 생성 불가
                국가별, 시간대별로 구체화시켜둔 하위 클래스들(다형성)
         */

        //방법1. static getInstance() 메소드 호출로 생성된 하위 객체 받기
        Calendar today = Calendar.getInstance();
        Calendar today2 = GregorianCalendar.getInstance();
        today2.get(10);
        System.out.println(today2.get(10));
    }
}
