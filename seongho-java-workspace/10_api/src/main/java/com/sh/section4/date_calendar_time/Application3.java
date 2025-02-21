package com.sh.section4.date_calendar_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application3 {
    public static void main(String[] args) {
        /*
        #java.text.SimpleDateFormat
        1.날짜 및 시간 정보를 내가 원하는 형식의 문자열로 변환
        2.작성가능 포맷
               ㄴ y:년
               ㄴ M:달
               ㄴ d:일
               ㄴ E:요일
               ㄴ h/H:시
               ㄴ m:분
               ㄴ s:초

               SimpleDateFormat sdf = new SimpleDateFormat("반영시키고자하는형식(포맷)");
               sdf.format(java.util.Date객체) :String
         */
        //java.util.Date 객체 생성 후 반영
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd HH(hh):mm:ss");
        String datestr = sdf.format((today));
        System.out.println(datestr);

        //java.util.Calendar 객체 생성 후 바녕ㅇ
        Calendar today2 = Calendar.getInstance();
        String datestr2= sdf.format(new Date(today2.getTimeInMillis()));
        System.out.println(datestr2);
    }
}
