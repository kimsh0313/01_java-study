package com.pch.section02.string.dto;

public class Shop {
    private String shopName;
    private String address;
    private String number;
    private String category;
    private String updateDate;

    public Shop() {
    }

    public Shop(String shopName, String address, String number, String category, String updateDate) {
        this.shopName = shopName;
        this.address = address;
        this.number = number;
        this.category = category;
        this.updateDate = updateDate;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", category='" + category + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
}
