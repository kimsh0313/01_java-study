package com.jjanggu.section02.example.dto;

public abstract class GameCharacter {

    private String name;
    private int hp;
    private int lv;
    private int exp;

    /*
    공통 속성 : 이름, 체력, 레벨, 경험치

    공통 행동 공격

    공통 행동 방어
    */

    public GameCharacter (){}

    public GameCharacter(String name, int hp, int lv, int exp) {
        this.name = name;
        this.hp = hp;
        this.lv = lv;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if(this.hp <= 0){
            this.lv--;
            this.hp = 100;
            System.out.println("모든 체력이 다 소모되어 레벨이 감소하였습니다. 체력이 100으로 회복되었습니다.");
        }
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
        if(this.exp >= 100){
            this.lv++;
            this.exp -= 100;
            System.out.println("레벨업!");
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", hp=" + hp +
                ", lv=" + lv +
                ", exp=" + exp ;
    }

    public abstract void attack();

    public abstract void defence();


}
