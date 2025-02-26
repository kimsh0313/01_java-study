package com.ino.section02.string;

public class Shop {
    private int no;
    private String name;
    private String address;
    private String number;
    private String category;
    private String date;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public Shop(int no, String name, String address, String number, String category, String date) {
        this.no = no;
        this.name = name;
        this.address = address;
        this.number = number;
        this.category = category;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", category='" + category + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
