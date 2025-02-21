package com.ibe6.section01.dto;

public class Tablet extends Electronic {
    private boolean penFlag;

    public Tablet(){}

    public Tablet(boolean penFlag) {
        this.penFlag = penFlag;
    }

    public Tablet(String brand, String name, int price, boolean penFlag) {
        super(brand, name, price);
        this.penFlag = penFlag;
    }

    public boolean isPenFlag() {
        return penFlag;
    }

    public void setPenFlag(boolean penFlag) {
        this.penFlag = penFlag;
    }

    @Override
    public String toString() {
        return "Tablet{" + super.toString() +
                ", penFlag=" + (penFlag ? "있음" : "없음") +
                '}';
    }
}
