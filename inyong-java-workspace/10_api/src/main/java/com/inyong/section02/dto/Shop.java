package com.inyong.section02.dto;


public class Shop {
    private String id;           // 가게 번호
    private String name;      // 가게 이름
    private String address;   // 가게 주소
    private String phone;     // 전화번호
    private String category;  // 카테고리
    private String registeredDate; // 등록일

    public Shop() {}

    public Shop(String id, String name, String address, String phone, String category, String registeredDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.category = category;
        this.registeredDate = registeredDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", category='" + category + '\'' +
                ", registeredDate=" + registeredDate +
                '}';
    }
}