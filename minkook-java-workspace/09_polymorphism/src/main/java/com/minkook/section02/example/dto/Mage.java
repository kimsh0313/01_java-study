package com.minkook.section02.example.dto;

public class Mage extends Character {
    private int mp;


    public Mage() {

    }

    public Mage(String nicName, int hp, int level, int exp, int wp) {
        super(nicName, hp, level, exp);
        this.mp = wp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;

        if(this.mp < 0) {
            System.out.println("마력이 다 소진되었습니다. 방어하시면 다시 충전됩니다.");
            this.mp = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "mp=" + mp +
                '}';
    }

    @Override
    public void attack() {
        System.out.println("마법을 쓰면서 공격한다.");
        super.setExp(super.getExp() + 10);
        setMp(getMp() - 10);

    }

    @Override
    public void defense() {
        System.out.println("방어막을 쳐서 방어한다.");
        super.setHp(super.getHp() - 5);
        setMp(getMp() + 5);
    }
}
