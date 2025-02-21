package com.inyong.section02.example.dto;

public class Magician extends Character {
    private int mp;

    public Magician() {

    }

    public Magician(String name, int hp, int exp, int level, int mp) {
        super(name, hp, exp, level);
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;

        if (mp <= 0) {
            System.out.println("mp 사용 불가능");
        }


    }

    @Override
    public void attack() {
        int exp = getExp();

        setExp(exp + 10);
        setMp(mp - 10);

    }

    @Override
    public void defense() {
        int hp = getHp();

        setHp(hp - 5);
        setMp(mp + 10);

    }

    @Override
    public String toString() {
        return "Magician{" + super.toString() +
                "mp=" + mp +
                '}';
    }
}
