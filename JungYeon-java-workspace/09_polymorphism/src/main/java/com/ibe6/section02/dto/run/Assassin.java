package com.ibe6.section02.dto.run;

public class Assassin extends GameCharacter {

    public Assassin(){}

    public Assassin(String name, int hp, int level, int exp) {
        super(name, hp, level, exp);
    }

    @Override
    public String toString() {
        return "Assassin{" + super.toString() + "}";
    }

    @Override
    public void attack() {
        System.out.println("주먹으로 암살공격한다.");
        setEXp( getEXp() + 5); ;
    }

    @Override
    public void defence() {
        System.out.println("은둔해서 피한다.");
    }


}
