package com.ino.section04.date_calendar_time;

import java.util.Date;

public class Appliation1 {
    public static void main(String[] args) {

        // 기본 생성자로 생성 : 현재 운영체제의 날짜 및 시간 정보 기준
        Date today = new Date();
        System.out.println(today); // toString override
        System.out.println(today.getTime());

        // 매개변수 생성자로 생성 : 특정 날짜 및 시간 정보가 담기게 하고자 할 경우 사용
        Date date = new Date(1740115127693L);
        System.out.println(date);
    }
}
