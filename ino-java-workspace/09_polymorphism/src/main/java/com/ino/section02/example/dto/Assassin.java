package com.ino.section02.example.dto;

public class Assassin extends GameCharacter {
    public void attack() {
        System.out.println("Assassin attack by hand");
        setExp(getExp() + 5);
    }

    public void defense() {
        System.out.println("Assassin avoids attack");
    }

    @Override
    public String toString() {
        return "Assassin{" + super.toString() + "}";
    }
}