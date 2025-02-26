package com.homework.controller;


import com.homework.common.DateCalculator;
import com.homework.common.MathCalculator;
import com.homework.common.StringCalculator;
import com.homework.dto.FoodShop;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Calculator implements DateCalculator, MathCalculator, StringCalculator {
    @Override
    public void printNowDateTime() {
        LocalDateTime today = LocalDateTime.now();
        String sToday = today.toString();

        int Tloc = sToday.indexOf("T");
        int dotLoc = sToday.indexOf(".");

        String ymd = sToday.substring(0, Tloc);
        String msms = sToday.substring(Tloc, dotLoc);
        msms = msms.replace("T", " ");

        System.out.println('"'+ymd+msms+'"');
    }

    @Override
    public Calendar makeCalendar(String year, String month, String date) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(date));
        return calendar;
    }

    @Override
    public void printFormat(Calendar calc) {
        String [] week = {" ", "일", "월", "화", "수", "목", "금", "토"};
        System.out.println(calc.get(Calendar.YEAR)+"-"+calc.get(Calendar.MONTH)+"-"+calc.get(Calendar.DATE)+" "+week[calc.get(Calendar.DAY_OF_WEEK)]+"요일");
    }

    @Override
    public boolean isLeapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public long leapDate(int startYear, int endYear) {
        long ans = 0;

        for(int i = startYear; i <= endYear; i++) {
            if(isLeapYear(i)) {
                ans += 366;
            } else {
                ans += 365;
            }
        }

        return ans;
    }

    @Override
    public int sumString(String num1, String num2) {
        double sum = Double.parseDouble(num1) + Double.parseDouble(num2);

        int ans = (int) Math.round(sum);
        return ans;
    }

    @Override
    public int minusString(String num1, String num2) {
        if(num1.contains(".") || num2.contains(".")) {
            return -1;
        }
        return Math.abs(Integer.parseInt(num1) - Integer.parseInt(num2));
    }

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

    @Override
    public int selectTokenCount(String str) {
        StringTokenizer st = new StringTokenizer(str);
        return st.countTokens()-1;
    }

    @Override
    public String toSpaceUpper(String str) {
        String []sArr = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String s : sArr) {
            sb.append(Character.toUpperCase(s.charAt(0)));
            sb.append(s.substring(1)).append(" ");
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

        String []sArr = csvStr.split("\n");
        FoodShop[] fd = new FoodShop[sArr.length];
        for(int i = 0; i < fd.length; i++) {
            String[] s = sArr[i].split(",");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate registerDate = LocalDate.parse(s[5], formatter);

            fd[i] = new FoodShop(Integer.parseInt(s[0]), s[1], s[2], s[3], s[4], registerDate);
        }

        return fd;

    }

    // 해당 클래스안에 정의해야되는 메소드들은 현재
	// StringCalculator, MathCalculator, DateCalculator 인터페이스에 추상메소드로 정의되어있다. 
	// 세 인터페이스를 구현하는 클래스로 완성하시오. 즉, implements 하여 해당 각 메소드를 완성하시오.
	
	
	
}
