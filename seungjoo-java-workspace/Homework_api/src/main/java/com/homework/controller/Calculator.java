package com.homework.controller;


import com.homework.common.DateCalculator;
import com.homework.common.MathCalculator;
import com.homework.common.StringCalculator;
import com.homework.dto.FoodShop;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Calculator implements DateCalculator, MathCalculator, StringCalculator {
    @Override
    public void printNowDateTime() {
        LocalDateTime now = LocalDateTime.now();
        String str = now.toString();
        String str1 = str.replace("T", " ");
        int idx = str1.indexOf(".");
        String str2 = str1.substring(0, idx);
        System.out.println(str2);
    }

    @Override
    public Calendar makeCalendar(String year, String month, String date) {
        Calendar calendar = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(date));
        return calendar;
    }

    @Override
    public void printFormat(Calendar calc) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일"); // 원하는 형식 지정
        Date date = calc.getTime(); // Calendar → Date 변환
        System.out.println(sdf.format(date));
    }

    @Override
    public boolean isLeapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public long leapDate(int startYear, int endYear) {
        long sum = 0;
        for(int i = startYear; i <= endYear; i++) {
            if(isLeapYear(i)) {
                sum+= 366;
            }else{
                sum += 365;
            }
        }
        return sum;
    }

    @Override
    public int sumString(String num1, String num2) {
        if(num1.contains(".") || num2.contains(".")) {
            return Math.round((Integer.parseInt(num1) + Integer.parseInt(num2)));
        }else{
           return Integer.parseInt(num1) + Integer.parseInt(num2);
        }


    }

    @Override
    public int minusString(String num1, String num2) {
        if(num1.contains(".") || num2.contains(".")){
            return -1;
        }else{
            return Math.abs(Integer.parseInt(num1)-Integer.parseInt(num2));
        }
    }

    @Override
    public int findCharCount(String str, char ch) {
        int cnt = 0;
        String str1 = str.toLowerCase(); // 전체 문자열을 소문자로 변환
        char chLower = Character.toLowerCase(ch);
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == chLower) {
                cnt++;
        }
        }
        return cnt;
    }

    @Override
    public int selectTokenCount(String str) {
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(str," ");

        return st.countTokens();
    }

    @Override
    public String toSpaceUpper(String str) {
        String[] str_arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String st : str_arr){
            for(int i = 0;i  < st.length(); i++) {
                if (i == 0) {
                    sb.append(String.valueOf(st.charAt(i)).toUpperCase());
                } else {
                    sb.append(String.valueOf(st.charAt(i)));
                }

            }
            sb.append(" ");
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

        String[] arr = csvStr.split("\n");
        FoodShop[] foodShops = new FoodShop[arr.length];
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for(int i = 0;i  < arr.length;i++){
            String[] str_arr = arr[i].split(",");
            LocalDate date = LocalDate.parse(str_arr[5], dtf);
            foodShops[i] = new FoodShop(Integer.parseInt(str_arr[0]), str_arr[1], str_arr[2], str_arr[3],str_arr[4], date);
        }




        return foodShops;
    }

    // 해당 클래스안에 정의해야되는 메소드들은 현재
	// StringCalculator, MathCalculator, DateCalculator 인터페이스에 추상메소드로 정의되어있다. 
	// 세 인터페이스를 구현하는 클래스로 완성하시오. 즉, implements 하여 해당 각 메소드를 완성하시오.
	
	
	
}
