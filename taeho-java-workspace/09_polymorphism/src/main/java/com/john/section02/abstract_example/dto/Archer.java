package com.john.section02.abstract_example.dto;

public class Archer extends GameCharacter {
    private int distance;
    private int bolt;

    public Archer() {
    }

    public Archer(int id, String name, int hp, int level, int exp, int distance, int bolt) {
        super(id, name, hp, level, exp);
        this.distance = distance;
        this.bolt = bolt;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getBolt() {
        return bolt;
    }

    public void setBolt(int bolt) {
        this.bolt = bolt;
    }

    @Override
    public String toString() {
        return "Archer{" + super.toString() +
                "distance=" + distance +
                ", bolt=" + bolt +
                '}';
    }

    @Override
    public void attack() {
        if (bolt > 0) {
            System.out.println("아처의 공격!");
            System.out.println("남은 화살 : " + (--bolt));
            setExp(getExp() + 15);
        } else {
            System.out.println("하지만 화살이 없었다!");
        }
    }

    @Override
    public void defense() {
        System.out.println("궁수는 적의 접근을 허용했다!");
        setHp(getHp() - 20);
    }

}
