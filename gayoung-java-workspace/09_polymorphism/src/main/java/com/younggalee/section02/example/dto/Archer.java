package com.younggalee.section02.example.dto;

public class Archer extends Character{
    private int distance;
    private int arrow;

    public Archer(){}
    public Archer(String name, int hp, int exp, int level, int distance, int arrow) {
        super(name, hp, exp, level);
        this.distance = distance;
        this.arrow = arrow;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    @Override
    public void attack() {
        if(arrow > 0){
            System.out.println(distance + "m 거리까지 적을 화살로 쏴서 공격한다.");
            setExp( getExp() + 15);
            System.out.println("잔여 활수 : " +   --arrow);
        } else {
            System.out.println("화살이 없어 공격할 수 없습니다.");
        }

    }

    @Override
    public void defense() {
        setExp( getExp() - 20);
    }

    @Override
    public String toString() {
        return "Archer{" + super.toString() +
                "distance=" + distance +
                ", arrow=" + arrow +
                '}';
    }
}
