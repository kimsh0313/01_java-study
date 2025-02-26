package com.minkook.section04.date_calendar_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Application3 {
    /*
        ## SimpleDateFormat sdf = new SimpleDateFormat("반영시키고자 하는 형식");

        sdf.format(java.util.Date객체) : String


     */

    public static void main(String []args){
        Date today = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E HH(hh):mm:ss");
        String str = sdf.format(today);
        System.out.println(str);

        //java.util.calendar 객체 생성 후 반영
    }
}
