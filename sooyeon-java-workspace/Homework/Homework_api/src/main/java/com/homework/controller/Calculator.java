package com.homework.controller;


import com.homework.common.DateCalculator;
import com.homework.common.MathCalculator;
import com.homework.common.StringCalculator;
import com.homework.dto.FoodShop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Calculator implements StringCalculator, MathCalculator, DateCalculator {
    private static final String csvStr = "1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11\n"
            + "2,옛날밥상,광주광역시 남구 용대로119번길 6,062-653-7337,향토맛집,2022-01-11\n"
            + "3,송정떡갈비,광주광역시 광산구 광산로29번길 1,062-944-1439,향토맛집,2022-01-11\n"
            + "4,홍춘이,광주광역시 북구 무등로180번길 9-18,062-521-7733,향토맛집,2022-01-11\n"
            + "5,종가집떡갈비,광주광역시 광산구 상무대로 226,062-943-8282,향토맛집,2022-01-11\n"
            + "6,광신보리밥,광주광역시 북구 두리봉길 2-1(두암동),062-264-1811,향토맛집,2022-01-11\n"
            + "7,조선옥,광주광역시 남구 효덕로 103,062-654-3322,한상맛집,2022-01-11\n"
            + "8,송원회관,광주광역시 북구 경양로135번길 29(신안동),062-529-3250,한상맛집,2022-01-11\n"
            + "9,만선당어부의밥상,광주광역시 광산구 수완로11번길 3,062-955-5595,한상맛집,2022-01-11\n"
            + "10,백년미가(유촌점),광주광역시 서구 유덕로28번길 18,062-946-3392,한상맛집,2022-01-11";


    @Override
    public int findCharCount(String str, char ch) {
        int count = 0;
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int selectTokenCount(String str) {
        return new StringTokenizer(str, " ").countTokens();
    }

    @Override
    public String toSpaceUpper(String str) {
        StringBuilder sb = new StringBuilder();

        for (String word : str.split(" ")) {
            word = word.trim();
            if (word.isEmpty()) {
                continue;
            }
            sb.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1));
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public FoodShop[] csvFormat() {
        String[] restaurants = csvStr.split("\n");
        FoodShop[] result = new FoodShop[restaurants.length];

        for (int i = 0; i < restaurants.length; i++) {
            String[] info = restaurants[i].split(",");

            int number = Integer.parseInt(info[0].trim());
            String shopName = info[1].trim();
            String address = info[2].trim();
            String phoneNumber = info[3].trim();
            String category = info[4].trim();
            LocalDate registerDate = LocalDate.parse(info[5].trim());

            result[i] = new FoodShop(number, shopName, address, phoneNumber, category, registerDate);
        }
        return result;
    }


    @Override
    public int sumString(String num1, String num2) {
        double number1 = Double.parseDouble(num1.trim());
        double number2 = Double.parseDouble(num2.trim());

        return (int) Math.round(number1 + number2);
    }

    @Override
    public int minusString(String num1, String num2) {
        double number1 = Double.parseDouble(num1.trim());
        double number2 = Double.parseDouble(num2.trim());
        if (number1 % 1 != 0 || number2 % 1 != 0) {
            return -1;
        }
        return (int) Math.abs(number1 - number2);
    }


    @Override
    public void printNowDateTime() {
        String now = LocalDateTime.now().toString();

        System.out.println(now
                .replace("T", " ")
                .substring(0, now.indexOf(".")));
    }

    @Override
    public Calendar makeCalendar(String year, String month, String date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(year.trim()),
                Integer.parseInt(month.trim()) - 1,
                Integer.parseInt(date.trim()));

        return calendar;
    }

    @Override
    public void printFormat(Calendar calc) {
        System.out.println(DateCalculator.DATE_FORMAT.format(calc.getTime()));
    }

    @Override
    public boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 400 == 0 || year % 100 != 0);
    }

    @Override
    public long leapDate(int startYear, int endYear) {
        long total = 0;
        int minYear = Math.min(startYear, endYear);
        int maxYear = Math.max(startYear, endYear);

        for (int i = minYear; i <= maxYear; i++) {
            total += isLeapYear(i) ? 366L : 365L;
        }
        return total;
    }

}
