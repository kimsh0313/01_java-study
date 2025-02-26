package com.inyong.section04.date_calendar_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application3 {
    public static void main(String[] args) {
        /*
        java.text.SimpleDateFormat
        1. 날짜 및 ㅅ ㅣ간 정보를 내가 원하는 형식의 문자열로 변환시켜주는 캘래스
        2. 작성가능 포맷 : y,M,d,e,h/H,m,s
        SimpleDateFormat sdf = new SimpleDateFormat("반영시키고자하는형식(포맷");
        sdf.format(java.util.Date객체) : String
         */

        Date today = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E HH(hh):mm:ss");
        String dateStr = sdf.format(today);
        System.out.println(dateStr);

        // java.util.Calendar 객체 생성 후 반영
        Calendar today2 = Calendar.getInstance();
        String dateStr2 = sdf.format(today2.getTimeInMillis()); // 밀리초 값을 전달
        System.out.println(dateStr2);





    }
}
