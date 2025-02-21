package com.inyong.section02.example.dto;

public class Warrior extends Character {

    private String weapon;
    private String item;

    public Warrior() {
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Warrior(String name, int hp, int exp, int level) {
        super(name, hp, exp, level);
    }

    public void getWeapon(String weapon){
        this.weapon = weapon;
    }


    @Override
    public void attack() {
        int exp = getExp();

        setExp(exp + 10);


        if(exp >= 100){
            int level = getLevel();
            super.levelUp(level);
        }
    }

    @Override
    public void defense() {
        int hp = getHp();

        setHp(hp - 2);
    }

    @Override
    public String toString() {
        return "Warrior{ " + super.toString() +
                "weapon='" + weapon + '\'' +
                ", item='" + item + '\'' +
                '}';
    }
}
