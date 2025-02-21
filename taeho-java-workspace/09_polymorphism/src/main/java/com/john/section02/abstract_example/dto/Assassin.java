package com.john.section02.abstract_example.dto;

public class Assassin extends GameCharacter {
    public Assassin() {
    }

    public Assassin(int id, String name, int hp, int level, int exp) {
        super(id, name, hp, level, exp);
    }

    @Override
    public String toString() {
        return "Assassin{" + super.toString() + "}";
    }

    @Override
    public void attack(){
        System.out.println("암살자의 공격!");
        setExp(getExp() + 5);
    }

    @Override
    public void defense(){
        System.out.println("암살자의 회피!");
    }
}
