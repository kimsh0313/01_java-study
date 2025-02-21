package com.ibe6.section02.dto.run;

import java.util.Arrays;

public class Warrior extends GameCharacter {
    private String weapon;
    private String[] items;

    public Warrior() {}

    public Warrior(String name, int hp, int level, int exp, String weapon, String[] items) {
        super(name, hp, level, exp);
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

    @Override
    public void attack() {
        System.out.println(weapon + "과(와) 같은 무기를 휘두르면서 공격한다.");
        super.setEXp( super. getEXp() + 10 );
    }

    @Override
    public void defence() {
        System.out.println("방패를 이용해서 방어한다.");
        setHp( getHp() - 2); //super 생략 가능. 생략시 앞에 this가 있는 상태
    }
}
