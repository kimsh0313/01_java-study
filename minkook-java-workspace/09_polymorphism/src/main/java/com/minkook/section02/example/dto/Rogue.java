package com.minkook.section02.example.dto;

public class Rogue extends Character {




    public Rogue() {
    }

    public Rogue(String nicName, int hp, int level, int exp) {
        super(nicName, hp, level, exp);
    }

    @Override
    public String toString() {
        return super.toString() + "Rogue{}";
    }

    @Override
    public void attack() {
        System.out.println("주먹으로 암살공격한다.");
        super.setExp(super.getExp() + 5);
    }

    @Override
    public void defense() {
        System.out.println("은둔해서 피한다.");

    }
}
