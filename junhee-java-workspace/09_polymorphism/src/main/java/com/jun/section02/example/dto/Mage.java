package com.jun.section02.example.dto;

public class Mage extends Character{

    private int mp;

    public Mage(){}

    public Mage(String name, int hp, int level, int exp, int mp) {
        super(name, hp, level, exp);
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }

    @Override
    public String toString() {
        return "Mage{" +super.toString() +
                ", mp=" + mp +
                '}';
    }

    public void setMp(int mp) {
        this.mp = mp;

        if(this.mp <= 0){
            System.out.println("마력이 다 소진되었습니다. 방어하시면 다시 충전됩니다");
            this.mp=0;
        }


    }

    @Override
    public void attack() {
        System.out.println("마법을 쓰면서 공격한다");
        setExp(getExp() + 10);
        setMp(getExp() - 10);
    }

    @Override
    public void defence() {
        System.out.println("방어막을 쳐서 방어한다");
        setHp( getHp() - 5);
        setMp( getMp() + 5);
    }




}
