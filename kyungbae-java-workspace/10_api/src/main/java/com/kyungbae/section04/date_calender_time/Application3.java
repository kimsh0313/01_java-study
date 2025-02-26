package com.kyungbae.section04.date_calender_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// SimpleDateFormat
public class Application3 {
    public static void main(String[] args) {

        // java.util.Date 객체 생성 후 반영
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E hh(HH):mm:ss");
        String dateStr = sdf.format(today);
        System.out.println(dateStr);

        // java.util.Calendar 객체 생성 후 반영 (Calendar 객체 바로 전달 시 오류발생)
        Calendar today2 = Calendar.getInstance();
//        String dateStr2 = sdf.format(today2); // 오류가 발생하지만 빨간줄은 안나옴
//        String dateStr2 = sdf.format(new Date(today2.getTimeInMillis())); // Calendar 객체를 Date 객체로 변환해서 전달
        String dateStr2 = sdf.format(today2.getTimeInMillis()); // millisecond 값을 전달해도 가능
        System.out.println(dateStr2);

    }
}
