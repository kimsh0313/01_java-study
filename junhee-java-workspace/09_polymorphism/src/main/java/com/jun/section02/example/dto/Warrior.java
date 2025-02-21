package com.jun.section02.example.dto;

import java.util.Arrays;

public class Warrior extends Character {
    private String weapon;
    private String[] item;

    public Warrior(){}


    public Warrior(String name, int hp, int level, int exp, String weapon, String[] item) {
        super(name, hp, level, exp);
        this.weapon = weapon;
        this.item = item;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String[] getItem() {
        return item;
    }

    public void setItem(String[] item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Warrior{" + super.toString() +
                "weapon='" + weapon + '\'' +
                ", item='" + Arrays.toString(item) +
                '}';
    }

    @Override
    public void attack() {
        System.out.println(weapon + "과(와) 같은 무기를 휘두르면서 공격한다.");
        setExp(getExp() + 10);
    }

    @Override
    public void defence() {
        System.out.println("방패를 이용해서 방어한다");
        setHp(getHp() - 2);

    }
}
