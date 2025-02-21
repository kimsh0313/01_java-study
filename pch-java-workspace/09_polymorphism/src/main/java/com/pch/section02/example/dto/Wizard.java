package com.pch.section02.example.dto;

public class Wizard extends CommonCharacter{
    private int maxmp;
    private int mp;

    public Wizard() {
    }

    public Wizard(String name, int hp, int maxmp) {
        super(name, hp);
        this.maxmp = maxmp;
        this.mp = maxmp;
    }

    @Override
    public void attack() {
        if(this.mp<10) {
            System.out.println("마력이 부족해 공격할 수 없다");
        } else {
            System.out.println("마법사 " + super.getName() + "이 마법으로 공격!");
            super.setLevel(getLevel() + 10);
            this.mp -= 10;
            super.levelUp();
        }
    }

    @Override
    public void defense() {
        System.out.println(super.getName() + "이 방어막을 펼처 방어를 선택했다.");
        super.setHp(super.getHp() - 5);
        this.mp += 5;
        if(this.mp>maxmp) { this.mp = maxmp; }
        super.death();
    }

    @Override
    public String toString() {
        return "Wizard{" + super.toString() +
                "mp=" + mp +
                '}';
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMaxmp() {
        return maxmp;
    }

    public void setMaxmp(int maxmp) {
        this.maxmp = maxmp;
    }
}
