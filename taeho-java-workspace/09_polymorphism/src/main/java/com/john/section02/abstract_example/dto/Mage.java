package com.john.section02.abstract_example.dto;

public class Mage extends GameCharacter {
    private int mana;

    public Mage() {
    }

    public Mage(int id, String name, int hp, int level, int exp, int mana) {
        super(id, name, hp, level, exp);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            System.out.println("마나가 고갈 되었다!");
        }
        this.mana = Math.max(mana, 0);
    }

    @Override
    public String toString() {
        return "Mage{" + super.toString() +
                "mana=" + mana +
                '}';
    }

    @Override
    public void attack(){
        System.out.println("마법사의 공격!");
        setExp(getExp() + 10);
        setMana(getMana() - 10);
    }

    @Override
    public void defense(){
        System.out.println("마법사의 방어!");
        setHp(getHp() - 5);
        setMana(getMana() + 5);
    }

}
