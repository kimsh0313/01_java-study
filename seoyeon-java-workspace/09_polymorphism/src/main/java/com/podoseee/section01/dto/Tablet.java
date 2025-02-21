package com.podoseee.section01.dto;

public class Tablet extends Electronic {
    private boolean penFlag;

    public Tablet(){}

    public Tablet(String brand, String name, int price, boolean penFlah){
        super(brand, name, price);
        this.penFlag = penFlah;
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
