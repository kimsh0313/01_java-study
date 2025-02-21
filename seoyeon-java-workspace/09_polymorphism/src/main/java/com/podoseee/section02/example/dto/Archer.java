package com.podoseee.section02.example.dto;

public class Archer extends GameCharacter {
    private int distance;
    private int arrow;

    public Archer() {}

    public Archer(String name, int hp, int level, int exp, int distance, int arrow) {
        super(name, hp, level, exp);
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
    public String toString() {
        return "Archer{" +
                "distance=" + distance +
                ", arrow=" + arrow +
                '}';
    }

    @Override
    public void attack(){
        if(arrow>0){
            System.out.println(distance + "m 거리까지 적을 화살로 쏴서 공격한다.");
            System.out.println("잔여 활 수 : " + --arrow);
            setExp(getExp() + 15);
        }else{
            System.out.println("잔여 활 수가 없어서 공격을 할 수 없습니다.");
        }
    }

    @Override
    public void defence(){
        System.out.println("막을 수 없습니다...");
        setHp(getHp() - 20);
    }

}
