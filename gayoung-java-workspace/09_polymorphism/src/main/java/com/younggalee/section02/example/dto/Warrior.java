package com.younggalee.section02.example.dto;

import java.util.Arrays;

public class Warrior extends Character {
    // 무기, 아이템
    private String weapon;
    private String[] item;

    public Warrior(){}

    public Warrior(String name, int hp, int exp, int level, String weapon, String[] item) {
        super(name, hp, exp, level);
        this.weapon = weapon;
        this.item = item;
    }

    //입력을 받아도 되고 안받아도 되고
    @Override
    public void attack(){
        System.out.println(weapon + "과 같은 무기로 공격한다.");
        super.setExp(super.getExp() + 10);
    }
    @Override
    public void defense(){
        System.out.println("방패로 방어한다.");
        setHp(getHp() - 2);// super.setHp(super.getHp() -2); super 생략 가능 this 찾다가 없으면 부모클래스로 가니까
    }

    @Override
    public String toString() {
        return "Warrior{" + super.toString() +
                "weapon='" + weapon + '\'' +
                ", item='" + Arrays.toString(item) + '\'' +
                '}';
    }
}
