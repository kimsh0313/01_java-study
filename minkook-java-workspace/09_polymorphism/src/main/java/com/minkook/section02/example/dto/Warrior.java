package com.minkook.section02.example.dto;

import java.util.Arrays;

public class Warrior extends Character {

    private String weapon;
    private String [] items;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public Warrior() {

    }

    public Warrior(String nicName, int hp, int level, int exp, String weapon, String[] items) {
        super(nicName, hp, level, exp);
        this.weapon = weapon;
        this.items = items;
    }

    @Override
    public String toString() {
        return super.toString() + "weapon='" + weapon + '\'' +
                ", items=" + Arrays.toString(items) +
                '}';
    }

    @Override
    public void attack() {
        System.out.println(weapon + "과(와) 같은 무기를 휘두르면서 공격한다.");
        super.setExp(super.getExp() + 10);
    }

    @Override
    public void defense() {
        System.out.println("방패를 이용해서 방어한다.");
        super.setHp(super.getHp() - 2);
    }
}
