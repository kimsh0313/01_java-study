package com.ino.section02.example.dto;

public abstract class GameCharacter {

    private String name;
    private int hp;
    private int level;
    private int exp;

    public GameCharacter() {
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", level=" + level +
                ", exp=" + exp +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            level -= 1;
            hp = 100;
        } else {
            this.hp = hp;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        if (exp >= 100) {
            level++;
            exp -= 100;
        } else {
            this.exp = exp;
        }
    }

    public GameCharacter(String name, int hp, int level, int exp) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.exp = exp;
    }

    public abstract void attack();

    public abstract void defense();
}
