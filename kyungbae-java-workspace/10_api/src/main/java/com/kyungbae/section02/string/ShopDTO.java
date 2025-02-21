package com.kyungbae.section02.string;

public class ShopDTO {

    private String num;
    private String name;
    private String address;
    private String phone;
    private String category;
    private String date;

    public ShopDTO(){}

    public ShopDTO(String num, String name, String address, String phone, String category, String date) {
        this.num = num;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.category = category;
        this.date = date;
    }

    @Override
    public String toString() {
        return "ShopDTO{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", category='" + category + '\'' +
                ", date='" + date + '\'' +
                '}';
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
