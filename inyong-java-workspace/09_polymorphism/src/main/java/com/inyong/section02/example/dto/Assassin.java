package com.inyong.section02.example.dto;

public class Assassin extends Character {
    public Assassin() {
    }

    public Assassin(String name, int hp, int exp, int level) {
        super(name, hp, exp, level);
    }

    @Override
    public void attack() {
        int exp = getExp();
        setExp(exp + 5);
    }

    @Override
    public void defense() {

        int hp = getHp();
        int dodge = (int) (Math.random() * 100 + 1);

        if (dodge > 80) {
            setHp(hp - 5);
            System.out.println("못피했습니다.");
        } else {
            System.out.println("은둔해서 피한다");
        }

    }

    @Override
    public String toString() {
        return super.toString() + "Assassin{}";
    }
}
