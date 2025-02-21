package com.pch.section02.example.dto;

import java.util.Arrays;

public class Warrior extends CommonCharacter{
    private String weapon;
    private String[] items;

    public Warrior() {
    }

    public Warrior(String name, int hp, String weapon, String[] items) {
        super(name, hp);
        this.weapon = weapon;
        this.items = items;
    }

    @Override
    public void attack() {
        System.out.println("전사 " + super.getName() + "이 " + this.weapon + "을(를) 휘둘러 공격!");
        super.setLevel(getLevel() + 10);
        super.levelUp();
    }

    @Override
    public void defense() {
        System.out.println(super.getName() + "이 방패를 사용해 방어를 선택했다.");
        super.setHp(super.getHp() - 2);
        super.death();
    }

    @Override
    public String toString() {
        return "Warrior{" + super.toString() +
                "weapon='" + weapon + '\'' +
                ", items=" + Arrays.toString(items) +
                '}';
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String []getItems() {
        return items;
    }

    public void setItem(String []items) {
        this.items = items;
    }
}
