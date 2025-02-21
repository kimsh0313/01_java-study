package com.jjanggu.section02.example.dto;

import java.util.Arrays;

public class Warrior extends GameCharacter {

    //    전사 : 공통 + 무기, 아이템
    private String weapon;
    private String[] items;

    public Warrior(){}

    public Warrior(String name, int hp, int lv, int exp, String weapon, String[] items) {
        super(name, hp, lv, exp);
        this.weapon = weapon;
        this.items = items;
    }

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

    @Override
    public String toString() {
        return "Warrior{" + super.toString() +
                ", weapon='" + weapon + '\'' +
                ", items=" + Arrays.toString(items) +
                '}';
    }

    //전사 : 무기 휘두름 && 경험치 +10
    @Override
    public void attack() {
        System.out.println(weapon + "과(와) 같은 무기를 휘두르면서 공격한다.");
        setExp(getExp() + 10);
    }

    //전사 : 방패 이용 && 체력 -2
    @Override
    public void defence(){
        System.out.println("방패를 이용해서 방어한다.");
        setHp(getHp() - 2);
    }




}
