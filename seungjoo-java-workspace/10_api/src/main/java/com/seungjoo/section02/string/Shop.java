package com.seungjoo.section02.string;

public class Shop {

    private String shopNumber;
    private String name;
    private String address;
    private String phoneNumber;
    private String category;
    private String enrollDay;

    public Shop(){}

    public Shop(String shopNumber, String name, String address, String phoneNumber, String category, String enrollDay) {
        this.shopNumber = shopNumber;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.category = category;
        this.enrollDay = enrollDay;
    }

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber;
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

    @Override
    public String toString() {
        return "Shop{" +
                "shopNumber='" + shopNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", category='" + category + '\'' +
                ", enrollDay='" + enrollDay + '\'' +
                '}';
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEnrollDay() {
        return enrollDay;
    }

    public void setEnrollDay(String enrollDay) {
        this.enrollDay = enrollDay;
    }
}
