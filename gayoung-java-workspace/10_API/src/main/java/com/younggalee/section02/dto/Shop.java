package com.younggalee.section02.dto;

public class Shop {
    private int index;
    private String name;
    private String address;
    private String phone;
    private String category;
    private String registeredDate;

    public Shop() {}

    public Shop(int index, String name, String address, String phone, String category, String registeredDate) {
        this.index = index;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.category = category;
        this.registeredDate = registeredDate;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", category='" + category + '\'' +
                ", registeredDate=" + registeredDate +
                '}';
    }
}