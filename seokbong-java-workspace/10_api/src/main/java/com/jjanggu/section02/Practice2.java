package com.jjanggu.section02;

import java.util.Arrays;

public class Practice2{
    public static void main(String[] args) {

        String shopCsv =  "1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11\n"
                + "2,옛날밥상,광주광역시 남구 용대로119번길 6,062-653-7337,향토맛집,2022-01-11\n"
                + "3,송정떡갈비,광주광역시 광산구 광산로29번길 1,062-944-1439,향토맛집,2022-01-11\n"
                + "4,홍춘이,광주광역시 북구 무등로180번길 9-18,062-521-7733,향토맛집,2022-01-11\n"
                + "5,종가집떡갈비,광주광역시 광산구 상무대로 226,062-943-8282,향토맛집,2022-01-11\n"
                + "6,광신보리밥,광주광역시 북구 두리봉길 2-1(두암동),062-264-1811,향토맛집,2022-01-11\n"
                + "7,조선옥,광주광역시 남구 효덕로 103,062-654-3322,한상맛집,2022-01-11\n"
                + "8,송원회관,광주광역시 북구 경양로135번길 29(신안동),062-529-3250,한상맛집,2022-01-11\n"
                + "9,만선당어부의밥상,광주광역시 광산구 수완로11번길 3,062-955-5595,한상맛집,2022-01-11\n"
                + "10,백년미가(유촌점),광주광역시 서구 유덕로28번길 18,062-946-3392,한상맛집,2022-01-11";



        // 위와 같은 텍스트문자열(구조화되지 않은 문자열)을 구조화 시켜서 자바에서의 객체 형태로 관리할 수 있도록 변환해보기

        // "\n" 기준으로 각 가게 정보가 표현되어있음
        // ","  기준으로 해당 가게의 번호, 이름, 주소, 전화번호, 카테고리, 등록일이 표현되어있음

        // 가게마다의 정보를 기록할 수 있도록 Shop 이라는 dto 클래스 만들기
        // 각 가게에 대한 정보는 Shop 객체로, 그리고 이런 Shop객체들을 최종적으로 Shop[]에 기록될 수 있도록

        String[] arr = shopCsv.split("\n");
        Shop[] Shop = new Shop[arr.length];
        for(String s : arr){
            String[] tmpArr = s.split(",");
            String shopId = tmpArr[0];
            String shopName = tmpArr[1];
            String shopAdd = tmpArr[2];
            String shopNum = tmpArr[3];
            String shopCat = tmpArr[4];
            String shopDate = tmpArr[5];
            for(int i = 0; i < arr.length; i++) {
                Shop[i] = new Shop(shopId, shopName, shopAdd, shopNum, shopCat, shopDate);
            }

        }











    }

}
