package com.younggalee.section02.example.dto;

public class Wizard extends Character{
    private int mp;

    public Wizard(){}

    public Wizard(String name, int hp, int exp, int level, int mp) {
        super(name, hp, exp, level);
        this.mp = mp;
    }


    public int getMp() {
        return mp;
    }


    public void setMp(int mp) {
        this.mp = mp;

        if(this.mp <= 0){
            System.out.println("마력소진. 방어하시면 다시 충전됩니다.");
            this.mp = 0;
        }
    }

    @Override
    public void attack(){
        System.out.println("마법을 쓰면서 공격한다.");
        setExp( getExp() + 10);
        setMp( getMp() - 10);
    }
    @Override
    public void defense(){
        setHp(getHp() - 5);
        setMp( getMp() + 5);
    }

    @Override
    public String toString() {
        return "Wizard{" + super.toString() +
                "mp=" + mp +
                '}';
    }
}
