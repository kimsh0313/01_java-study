package com.kyungbae.section02.example.dto;

public class Archer extends Character {

    private int arrowRange;
    private int arrow;

    public Archer(){}

    public Archer(String name, int arrowRange, int arrow) {
        super(name);
        this.arrowRange = arrowRange;
        this.arrow = arrow;
    }

    public int getArrowRange() {
        return arrowRange;
    }

    public void setArrowRange(int arrowRange) {
        this.arrowRange = arrowRange;
    }

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    @Override
    public void attack(){
        if (arrow > 0) {
            System.out.printf("%dm 까지 화살을 쏘아 공격\n", arrowRange);
            --arrow;
            System.out.println("exp + 10");
            setExp(getExp() + 15);
            expCount();
        } else {
            System.out.println("arrow가 부족합니다");
        }
    }

    @Override
    public void defense(){
        System.out.println("강하게 맞습니다");
        System.out.println("health - 20");
        setHealth(getHealth()-20);
        healthCount();
    }

    @Override
    public String toString() {
        return "Archer{" +
                "arrowRange=" + arrowRange +
                ", arrow=" + arrow +
                "} " + super.toString();
    }
}
