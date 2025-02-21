package com.john.section02.abstract_example.dto;

import java.util.Arrays;

public class Warrior extends GameCharacter {
    private String weapon;
    private String[] items;

    public Warrior() {}

    public Warrior(int id, String name, int hp, int level, int exp, String weapon, String[] items) {
        super(id, name, hp, level, exp);
        this.weapon = weapon;
        this.items = items;
    }

    public String getWeapons() {
        return weapon;
    }

    public void setWeapons(String weapon) {
        this.weapon = weapon;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Warrior{" + super.toString() +
                "weapon='" + weapon + '\'' +
                ", items=" + Arrays.toString(items) +
                '}';
    }

    @Override
    public void attack(){
        System.out.println("전사의 공격! 무기 : " + weapon);
        int exp = super.getExp() + 10 > 100 ? (super.getExp() + 10) - 100 : super.getExp() + 10;
        super.setExp(exp);

    }

    @Override
    public void defense(){
        System.out.println("전사의 방어!");
        setHp(getHp() - 2);
    }
}
