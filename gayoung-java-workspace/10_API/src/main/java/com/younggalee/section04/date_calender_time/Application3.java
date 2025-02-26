package com.younggalee.section04.date_calender_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application3 {
    public static void main(String[] args) {
        /*
         ## java.text.SimpleDateFormat ##
         1. 날짜 및 시간 정보를 내가 원하는 형식의 문자열로 변환시켜주는 클래스
         2. 작성가능 포맷 : y, M, d, E(요일), h/H, m, s
         simpleDateFormat sdf = new SimpleDateFormat("반영시키고자하는 형식(포맷)");
         sdf.format(java.util.Date객체) : String
         */

        // java.util.Date 객체 생성 후 반영
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E hh(HH):mm:ss");
        String dateStr = sdf.format(today);
        System.out.println(dateStr);


    }
}
