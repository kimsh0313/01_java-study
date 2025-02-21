package com.kyungbae.section02.example.dto;

public class Wizard extends Character {

    private int mana;

    public Wizard() {}

    public Wizard(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void manaCount(){
        if (mana <= 0) {
            mana = 0;
            System.out.println("mana 소진");
        }
    }

    @Override
    public void attack(){
        System.out.println("마법을 사용하여 공격");
        System.out.println("exp + 10");
        System.out.println("mana - 10");
        setExp(getExp()+10);
        mana -= 10;
        expCount();
        manaCount();
    }

    @Override
    public void defense(){
        System.out.println("방어막을 사용하여 방어");
        System.out.println("health - 5");
        System.out.println("mana + 5");
        setHealth(getHealth()-5);
        mana += 5;
        healthCount();
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                "} " + super.toString();
    }
}
