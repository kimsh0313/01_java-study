package com.ino.section02.example.dto;

public class Archor extends GameCharacter {

    private int distance;
    private int remain;

    public Archor() {}

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }

    public Archor(String name, int hp, int level, int exp, int distance, int remain) {
        super(name, hp, level, exp);
        this.distance = distance;
        this.remain = remain;
    }

    public void attack() {
        if (remain > 0) {
            System.out.println(distance + "거리까지 공격한다.");
            remain -= 1;
            System.out.println("remain arrows" + remain);
            setExp(getExp() + 15);
        }
        else {
            return;
        }
    }

    public void defense() {
        System.out.println("Archor Defense");
        setHp(getHp() - 20);
    }

    @Override
    public String toString() {
        return "Archor{" + super.toString() +
                "distance=" + distance +
                ", remain=" + remain +
                '}';
    }
}
