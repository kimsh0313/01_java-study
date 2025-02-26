package com.younggalee.section04.date_calender_time;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /*
        ## java.util.Date ##
        1. 날짜 및 시간에 대한 값을 기록할 수 있는 클래스
        2. 너무 예전 클래스라 다국적으로 쓰이기에 적합하지 않음. (대부분 Deprecated 되었음)
         */

        // 1) 기본 생성자로 생성
        Date today = new Date();
        System.out.println(today);
        long time = System.currentTimeMillis();
        System.out.println(time);
        System.out.println(today.getTime());

        // 2) 매개변수 생성자로 생성 : 특정 날짜 및 시간 정보가 담기게 하고자 할 경우 사용
        Date date = new Date(1740115212053L);
        System.out.println(date);

    }
}
