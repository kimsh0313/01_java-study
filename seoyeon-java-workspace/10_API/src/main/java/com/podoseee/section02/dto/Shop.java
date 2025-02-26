package com.podoseee.section02.dto;

public class Shop {
    private String number;
    private String name;
    private String address;
    private String phone;
    private String category;
    private String date;

    public Shop(){}

    public Shop(String number, String name, String address, String phone, String category, String date) {
        this.number = number;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.category = category;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", category='" + category + '\'' +
                ", date='" + date + '\'';
    }
}
