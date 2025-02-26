package com.minkook.section02.string;

public class Shop {
    //가게의 번호, 이름, 주소, 전화번호, 카테고리, 등록일
    private String shopNum;
    private String shopName;
    private String shopAddress;
    private String shopPhone;
    private String shopCategory;
    private String shopRegisterDate;

    public Shop() {

    }

    public Shop(String shopNum, String shopName, String shopAddress, String shopPhone, String shopCategory, String shopRegisterDate) {
        this.shopNum = shopNum;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopPhone = shopPhone;
        this.shopCategory = shopCategory;
        this.shopRegisterDate = shopRegisterDate;
    }

    public String getShopNum() {
        return shopNum;
    }

    public void setShopNum(String shopNum) {
        this.shopNum = shopNum;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public String getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(String shopCategory) {
        this.shopCategory = shopCategory;
    }

    public String getShopRegisterDate() {
        return shopRegisterDate;
    }

    public void setShopRegisterDate(String shopRegisterDate) {
        this.shopRegisterDate = shopRegisterDate;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopNum='" + shopNum + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", shopPhone='" + shopPhone + '\'' +
                ", shopCategory='" + shopCategory + '\'' +
                ", shopRegisterDate='" + shopRegisterDate + '\'' +
                '}';
    }
}
