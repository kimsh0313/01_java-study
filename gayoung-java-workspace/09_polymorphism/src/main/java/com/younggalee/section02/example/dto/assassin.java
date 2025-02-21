package com.younggalee.section02.example.dto;

public class assassin extends Character{
    public assassin () {}

    public assassin(String name, int hp, int exp, int level) {
        super(name, hp, exp, level);
    }

    @Override
    public void attack() {
        System.out.println("주먹으로 암살공격한다.");
        setExp(getExp() + 5);
    }

    @Override
    public void defense() {
        System.out.println("은둔하여 공격을 피합니다.");
    }

    @Override
    public String toString() {
        return "assassin{" + super.toString() + "}";
    }
}
