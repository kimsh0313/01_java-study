package com.homework.controller;


import com.homework.common.DateCalculator;
import com.homework.common.MathCalculator;
import com.homework.common.StringCalculator;
import com.homework.dto.FoodShop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Calculator implements DateCalculator, MathCalculator, StringCalculator {
    @Override
    public void printNowDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        String date = dateTime.toString();

        String mid = date.replace("T"," ");
        String dayofYearMonthDay = mid.substring(0,11);
        String hourfMinuteSecond = date.substring(date.indexOf(":")-2,19);
        //System.out.println(dayofYearMonthDay);
        //System.out.println(hourfMinuteSecond);
        System.out.println(dayofYearMonthDay + hourfMinuteSecond);

    }

    @Override
    public Calendar makeCalendar(String year, String month, String dayofMonth) {

        int iYear = Integer.parseInt(year);
        int iMonth = Integer.parseInt(month);
        int iDayofMonth  = Integer.parseInt(dayofMonth);

        Calendar myDay = new GregorianCalendar(iYear,iMonth,iDayofMonth);
        return myDay;
    }

    @Override
    public void printFormat(Calendar calc) {
        String day = "";
        switch(calc.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY : day = "일"; break;
            case Calendar.MONDAY : day = "월"; break;
            case Calendar.WEDNESDAY : day = "화"; break;
            case Calendar.TUESDAY : day = "수"; break;
            case Calendar.THURSDAY : day = "목"; break;
            case Calendar.FRIDAY : day = "금"; break;
            case Calendar.SATURDAY : day = "토"; break;
        }
        System.out.println(calc.get(1) + "-" + calc.get(2) + "-" + calc.get(5) + " " + day + "요일");
    }

    @Override
    public boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public long leapDate(int startYear, int endYear) {
        Long days = 0L;
        for(int i = startYear; i<=endYear; i++){
            if(isLeapYear(i)){
                days += 366;
            } else{
                days += 365;
            }
        }
        return days;
    }

    @Override
    public int sumString(String num1, String num2) {
        int num1Res = Integer.parseInt(num1);
        int num2Res = Integer.parseInt(num2);
        return num1Res + num2Res;
    }

    @Override
    public int minusString(String num1, String num2) {
        int num1Res = Integer.parseInt(num1);
        int num2Res =  Integer.parseInt(num2);
        return num1Res - num2Res;
    }

    @Override
    public int findCharCount(String str, char ch) {
        char [] charArr = new char[str.length()];
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            charArr[i] = str.toLowerCase().charAt(i);
        }
        for(int i = 0; i < charArr.length; i++){
            if(ch == charArr[i]) {
                count++;
            }
        }

        return count;
    }

    @Override
    public int selectTokenCount(String str) {
        StringTokenizer st = new StringTokenizer(str);
        int count = st.countTokens();

        return count;
    }

    @Override
    public String toSpaceUpper(String str) {

        String [] arr = str.split(" ");
        String res = "";

        for(int i =0; i<arr.length; i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.deleteCharAt(0);
            sb.insert(0,arr[i].toUpperCase().charAt(0));
            sb.insert(arr[i].lastIndexOf(arr[i].toLowerCase().charAt(0))+1," ");
            res += sb;
        }
        //System.out.println(res);
       return res;
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
        String []sArr = csvStr.split("\n");
       // System.out.println(sArr.length);
        String str = String.join(",",sArr);
        String [] newArr = str.split(",");
        FoodShop [] shops = new FoodShop[sArr.length]; //\n기준의 개수
        int cur = 0;
        for(int i = 0; i<shops.length; i++){
            shops[i] = new FoodShop(Integer.parseInt(newArr[cur]),newArr[cur+1],newArr[cur+2],newArr[cur+3],newArr[cur+4],LocalDate.parse(newArr[cur+5]));
            cur += 6;
        }

//        for(int i = 0; i<shops.length; i++){
//            System.out.println(shops[i]);
//        }
        return shops;
    }

    // 해당 클래스안에 정의해야되는 메소드들은 현재
	// StringCalculator, MathCalculator, DateCalculator 인터페이스에 추상메소드로 정의되어있다. 
	// 세 인터페이스를 구현하는 클래스로 완성하시오. 즉, implements 하여 해당 각 메소드를 완성하시오.
	
	
	
}
