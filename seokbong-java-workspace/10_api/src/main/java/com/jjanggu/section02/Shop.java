package com.jjanggu.section02;

public class Shop {
//    가게의 번호, 이름, 주소, 전화번호, 카테고리, 등록일

    private String  num;
    private String name;
    private String address;
    private String number;
    private String cat;
    private String date;

    public Shop() {}

    public Shop(String  num, String name, String address, String number, String cat, String date) {
        this.num = num;
        this.name = name;
        this.address = address;
        this.number = number;
        this.cat = cat;
        this.date = date;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return
                num + "," + name + "," + address + "," + number + "," + cat + "," + date ;
    }
}
