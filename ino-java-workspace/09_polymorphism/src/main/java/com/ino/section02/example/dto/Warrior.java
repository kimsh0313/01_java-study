package com.ino.section02.example.dto;

public class Warrior extends GameCharacter {

    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Warrior() {
     }

    public Warrior(String name, int hp, int level, int exp, String weapon) {
        super(name, hp, level, exp);
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Warrior{" + super.toString() +
                "weapon='" + weapon + '\'' +
                '}';
    }

    public void attack() {
        System.out.println("swing " + weapon);
        setExp(getExp() + 10);
    }

    public void defense() {
        System.out.println("defense by shield");
        setHp(getHp() - 2);
    }
}
