package com.ibe6.section02.string;

public class Shop {
    private String num;
    private String name;
    private String address;
    private String category;
    private String rd;

    public Shop(){}

    public Shop(String num, String name, String address, String category, String rd) {
        this.num = num;
        this.name = name;
        this.address = address;
        this.category = category;
        this.rd = rd;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", category='" + category + '\'' +
                ", rd='" + rd + '\'' +
                '}';
    }
}
