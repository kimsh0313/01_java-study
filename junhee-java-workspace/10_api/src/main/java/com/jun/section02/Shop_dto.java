package com.jun.section02;

public class Shop_dto {

    private int num;
    private String name;
    private String address;
    private String phoneNum;
    private String category;
    private String baseDate;

    public Shop_dto(int num, String name, String address, String phoneNum, String category, String baseDate) {
        this.num = num;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.category = category;
        this.baseDate = baseDate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBaseDate() {
        return baseDate;
    }

    public void setBaseDate(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    public String toString() {
        return
                "연번=" + num +
                ", 상호명='" + name + '\'' +
                ", 소재지도로명주소='" + address + '\'' +
                ", 전화번호='" + phoneNum + '\'' +
                ", 비고='" + category + '\'' +
                ", 데이터기준일자='" + baseDate + '\'';
    }

}
