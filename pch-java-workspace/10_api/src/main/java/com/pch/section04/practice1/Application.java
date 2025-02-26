package com.pch.section04.practice1;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        /**
         * ## 내가 원하는 날짜 및 시간으로 세팅 ##
         * 1. 현재 날짜 및 시간의 객체를 생성 => 값 수정
         */

        Calendar cal1 = new GregorianCalendar();
        cal1.set(Calendar.YEAR, 2023);
        cal1.set(Calendar.MONTH, Calendar.FEBRUARY);
        cal1.set(Calendar.DAY_OF_MONTH, 21);
    }
}
