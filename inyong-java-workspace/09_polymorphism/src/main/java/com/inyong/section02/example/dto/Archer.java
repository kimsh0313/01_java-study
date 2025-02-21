package com.inyong.section02.example.dto;

public class Archer extends Character {


    private int distance;
    private int count;

    public Archer() {
    }

    public Archer(String name, int hp, int exp, int level, int distance, int count) {
        super(name, hp, exp, level);
        this.distance = distance;
        this.count = count;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void attack() {
        int exp = getExp();

        if(count > 0) {
            System.out.println("m 화살 공격");


            System.out.println("잔여 활수" + --count);

            setExp(exp + 15);
        }else {
            System.out.println("화살이 없어 공격을 할 수 없습니다.");
        }

    }

    @Override
    public void defense() {
        int hp = getHp();
        System.out.println("막을 수 없습니다.");
        setHp(hp - 20);
    }

    @Override
    public String toString() {
        return "Archer{" + super.toString() +
                "distance=" + distance +
                ", count=" + count +
                '}';
    }
}
