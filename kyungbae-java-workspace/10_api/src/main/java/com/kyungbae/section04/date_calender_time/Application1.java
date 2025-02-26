package com.kyungbae.section04.date_calender_time;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {

        // 1) 기본 생성자로 생성 : 현재 운영체제의 날짜 및 시간 정보가 담김
        Date today = new Date();
        System.out.println(today); // toString() 오버라이딩 되어있음

        // getTime() : 현재 시간 정보를 millisecond 단위 로 반환 (long 형)
        System.out.println(today.getTime()); // 1970년 1월 1일 기준으로 지나간 시간을 ms 단위

        // 2) 매개변수 생성자로 생성 : 특정 날짜 및 시간 정보가 담기게 하고자 할 경우 사용
        // Date(long) : 세팅하고자 하는 날짜 및 시간 정보의 millisecond 단위 값 전달
        Date newDate = new Date(1740115156364L);
        System.out.println(newDate);

    }
}
