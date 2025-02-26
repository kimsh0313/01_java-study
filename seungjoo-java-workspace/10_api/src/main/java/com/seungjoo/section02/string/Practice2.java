package com.seungjoo.section02.string;

public class Practice2 {
    public static void main(String[] args) {


    String str = "1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11\n"
            + "2,옛날밥상,광주광역시 남구 용대로119번길 6,062-653-7337,향토맛집,2022-01-11\n"
            + "3,송정떡갈비,광주광역시 광산구 광산로29번길 1,062-944-1439,향토맛집,2022-01-11\n"
            + "4,홍춘이,광주광역시 북구 무등로180번길 9-18,062-521-7733,향토맛집,2022-01-11\n"
            + "5,종가집떡갈비,광주광역시 광산구 상무대로 226,062-943-8282,향토맛집,2022-01-11\n"
            + "6,광신보리밥,광주광역시 북구 두리봉길 2-1(두암동),062-264-1811,향토맛집,2022-01-11\n"
            + "7,조선옥,광주광역시 남구 효덕로 103,062-654-3322,한상맛집,2022-01-11\n"
            + "8,송원회관,광주광역시 북구 경양로135번길 29(신안동),062-529-3250,한상맛집,2022-01-11\n"
            + "9,만선당어부의밥상,광주광역시 광산구 수완로11번길 3,062-955-5595,한상맛집,2022-01-11\n"
            + "10,백년미가(유촌점),광주광역시 서구 유덕로28번길 18,062-946-3392,한상맛집,2022-01-11";

    String[] arr = str.split("\n"); //번호, 이름, 주소, 전화번호, 카테고리, 등록일      -> 길이는 10개

    Shop[] shops = new Shop[arr.length];
    for (int i = 0; i < arr.length; i++) {
        shops[i] = new Shop();
        String[] st_arr = arr[i].split(",");

        for(int j = 0; j< st_arr.length; j++) {
            switch(j) {
                case 0: shops[i].setShopNumber(st_arr[0]); break;
                case 1 : shops[i].setName(st_arr[1]); break;
                case 2: shops[i].setAddress(st_arr[2]); break;
                case 3 : shops[i].setPhoneNumber(st_arr[3]); break;
                case 4 : shops[i].setCategory(st_arr[4]); break;
                case 5 : shops[i].setEnrollDay(st_arr[5]); break;
            }
        }


        // 강사님은 각각의 6가지 요소를 매개변수 생성자에 넣음.
    }
    for(Shop shop : shops) {
        System.out.println(shop.toString());
    }

    }
}
