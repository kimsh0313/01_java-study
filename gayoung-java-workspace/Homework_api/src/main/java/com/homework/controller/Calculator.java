package com.homework.controller;

import com.homework.common.DateCalculator;
import com.homework.common.MathCalculator;
import com.homework.common.StringCalculator;
import com.homework.dto.FoodShop;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Calculator implements DateCalculator, MathCalculator, StringCalculator {


    // 해당 클래스안에 정의해야되는 메소드들은 현재
    // StringCalculator, MathCalculator, DateCalculator 인터페이스에 추상메소드로 정의되어있다.
    // 세 인터페이스를 구현하는 클래스로 완성하시오. 즉, implements 하여 해당 각 메소드를 완성하시오.

    // 메뉴 1, 2, 3, 4
    // StringCalculator 인터페이스에 있는 메소드 오버라이딩

    // 1. 전달받은 문자열로부터 전달된 문자가 대소문자 상관없이 몇 개있는지 반환하는 메소드
    @Override
    public int findCharCount(String str, char ch) {
        int count = 0;
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

        for(char c : str.toCharArray()) {
            if(c == ch) {
                count++;
            }
        }
        return count;
    }

    // 2. 전달받은 문자열을 공백을 기준으로 분리시켰을 때 몇 개의 문자열이 있는지 반환하는 메소드
    @Override
    public int selectTokenCount(String str) {
        StringTokenizer st = new StringTokenizer(str);
        return st.countTokens();
    }

    // 3. 전달받은 문자열에 공백을 기준으로 매 단어 앞글자마다 대문자로 처리하여 반환하시오
    @Override
    public String toSpaceUpper(String str) {
        StringBuilder sb = new StringBuilder();
        String[] inputArr = str.split(" ");

        for(String input : inputArr) {
            sb.append(Character.toUpperCase(input.charAt(0))).append(input.substring(1)).append(" ");
        }
        return sb.toString();
    }

    @Override
    public FoodShop[] csvFormat() {
        String csvStr =  "1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11\n"
                + "2,옛날밥상,광주광역시 남구 용대로119번길 6,062-653-7337,향토맛집,2022-01-11\n"
                + "3,송정떡갈비,광주광역시 광산구 광산로29번길 1,062-944-1439,향토맛집,2022-01-11\n"
                + "4,홍춘이,광주광역시 북구 무등로180번길 9-18,062-521-7733,향토맛집,2022-01-11\n"
                + "5,종가집떡갈비,광주광역시 광산구 상무대로 226,062-943-8282,향토맛집,2022-01-11\n"
                + "6,광신보리밥,광주광역시 북구 두리봉길 2-1(두암동),062-264-1811,향토맛집,2022-01-11\n"
                + "7,조선옥,광주광역시 남구 효덕로 103,062-654-3322,한상맛집,2022-01-11\n"
                + "8,송원회관,광주광역시 북구 경양로135번길 29(신안동),062-529-3250,한상맛집,2022-01-11\n"
                + "9,만선당어부의밥상,광주광역시 광산구 수완로11번길 3,062-955-5595,한상맛집,2022-01-11\n"
                + "10,백년미가(유촌점),광주광역시 서구 유덕로28번길 18,062-946-3392,한상맛집,2022-01-11";

        String[] foodStr = csvStr.split("\n");
        FoodShop[] foodShopArr = new FoodShop[10];

        for (int i=0; i<foodStr.length; i++){
            StringTokenizer st = new StringTokenizer(foodStr[i], ",");
            int index = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            String address = st.nextToken();
            String phone = st.nextToken();
            String category = st.nextToken();
            String registryDate = st.nextToken();

            String[] dateInfo = registryDate.split("-");
            foodShopArr[i] = new FoodShop(index,name,address,phone,category, LocalDate.of(Integer.parseInt(dateInfo[0]),Integer.parseInt(dateInfo[1]),Integer.parseInt(dateInfo[2]))); //
        }
        return foodShopArr;
    }

    // mathGameMenu 인터페이스에 있는 메소드 오버라이딩
    // 1번 전달받은 두 숫자(문자열형태)의 덧셈 결과를 구해 반환하기
    // 단, 실수값형태의 문자열일 경우 덧셈 연산 후 반올림해서 반환하기
    @Override
    public int sumString(String num1, String num2) {
        Double numA = Double.parseDouble(num1);
        Double numB = Double.parseDouble(num2);

        return (int)Math.round(numA + numB);
    }
    // 2번 전달받은 두 숫자(문자열형태)의 차(절대값)를 구해 반환하기.
    // 단, 실수값형태의 문자열일 경우 -1을 바로 반환할 것
    @Override
    public int minusString(String num1, String num2) {
        if (num1.contains(".") || num2.contains(".")){
            return -1;
        }
        int numA = Integer.parseInt(num1);
        int numB = Integer.parseInt(num2);

        return (int)Math.abs(numA - numB);
    }

    // dateGameMenu 인터페이스에 있는 메소드 오버라이딩
    // 1번 현재 날짜 및 시간 알아보기
    @Override
    public void printNowDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        //(toString, replace, substring, indexOf 메소드 모두 사용하여 푸시오)
        String timeNano = String.valueOf(LocalDateTime.now().getNano());
        int endPoint = dateTime.toString().indexOf(timeNano);
        String dateT = dateTime.toString().substring(0,endPoint-1);

        String date = dateT.replace('T', ' ');

        System.out.println(date);

    }
    // 2번 전달받은 년도,월,일(문자열형태)을 가지고 Calendar객체에 반영시켜 반환하는 메소드
    @Override
    public Calendar makeCalendar(String year, String month, String date) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, Integer.parseInt(year));
        calendar.set(Calendar.MONTH, Integer.parseInt(month) - 1);
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(date));
        return calendar;
    }

    // 3번 전달받은 Calendar 객체를 가지고 아래와 같은 형식으로 출력하는 메소드
    @Override
    public void printFormat(Calendar calc) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
        System.out.println(sdf.format(new Date(calc.getTimeInMillis())));
    }

    // 4번 전달된 년도가 윤년인지 여부값을 반환하는 메소드
    @Override
    public boolean isLeapYear(int year) {
        boolean result = false;
        if (year%4 == 0){
            if( year%100 == 0 && year%400 != 0){
                result = false;
            } else {
                result = true;
            }
        }

        return result;
    }

    // 5번 전달된 시작년도의 1월 1일부터 끝년도의 12월 31일까지의 총 일수를 계산해서 반환하는 메소드
    @Override
    public long leapDate(int startYear, int endYear) {
        int count = 0;
        for (int i = startYear ; i< endYear + 1; i++){
            if(isLeapYear(i)){
                count += 366;
            } else {
                count += 365;
            }
        }
        return count;
    }
}
