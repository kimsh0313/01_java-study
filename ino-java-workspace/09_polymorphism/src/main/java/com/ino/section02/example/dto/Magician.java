package com.ino.section02.example.dto;

public class Magician extends GameCharacter {
    private int mp;

    public Magician() {}

    public Magician(String name, int hp, int level, int exp, int mp) {
        super(name, hp, level, exp);
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void attack() {
        System.out.println("magician attacks");
        super.setExp(super.getExp() + 10);
        editMp(-10);
    }

    @Override
    public String toString() {
        return "Magician{" + super.toString() +
                "mp=" + mp +
                '}';
    }

    public void defense() {
        super.setHp(super.getHp() - 5);
        editMp(5);
    }

    public void editMp(int m) {
        mp += m;
        if (mp < 0) {
            mp = 0;
        }
    }
}
