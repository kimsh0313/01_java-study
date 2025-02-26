package com.minkook.section04.date_calendar_time;

import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String [] args){
        /*
            ## java.util.Date ##
            1. 날짜 및 시간에 대한 값을 기록할 수  있는 클래스
            2. JDK1.0부터 날짜 취급을 위해 사용되던 클래스로
                다국적으로 쓰기에는 적합하지않다
                => 생성자를 비롯해 대부분의 메소드가 Deprecated 되었음
         */

        Date today = new Date();

        System.out.println(today);

        System.out.println(today.getTime());

        //2) 매개변수 생성자로 생성 : 특정 날짜 및 시간 정보가 담기게 하고자 할 경우 사용
        //    Date(long) :  세팅하고자 하는 날짜 및 시간 정보의 millusecond 단위 값 전달

        Date date = new Date(1740115225716L);
        System.out.println(date);






    }
}
