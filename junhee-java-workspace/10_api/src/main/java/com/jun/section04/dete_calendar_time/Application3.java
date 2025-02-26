package com.jun.section04.dete_calendar_time;

import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application3 {
    public static void main(String[] args) {
           /*
        ## java.text.SimpleDateFormat ##
        1. 날짜 및 시간 정보를 내가 원하는 형식의 문자열로 변환시켜주는 클래스
        2. 작성가능 포맷
           ㄴ y = 년
           ㄴ M = 월
           ㄴ D = 일
           ㄴ E : 요일
           ㄴ h/H : 시간
           ㄴ m : 분

           SimpleDateFormat sdf = new SimpleDateFormat("반영시키고자하는형식(포맷)");
           sdf.format(java.util.Date객체) : String
     */

        // java.util.Date 객체 생성 후 반영
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E HH(hh):mm:ss");
        String dateStr = sdf.format(today);
        System.out.println(dateStr);

        //java.util.Calender 객체 생성 후 반영 (Calendar 객체 바로 전달시 오류발생)
        Calendar today2 = Calendar.getInstance();
        //String dateStr2 = sdf.format(new Date(today2.getTimeInMillis())); // Calendar 객체를 Date 객체로 변환해서 전달
        String dateStr2 = sdf.format(today2.getTimeInMillis());
        System.out.println(dateStr2);

    }

}
