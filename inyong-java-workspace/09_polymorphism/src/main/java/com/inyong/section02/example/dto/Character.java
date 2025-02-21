package com.inyong.section02.example.dto;

public abstract class Character {
    private String name;
    private int hp ;
    private int exp ;
    private int level ;

    public Character() {
    }

    public Character(String name, int hp, int exp, int level) {
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.level = level;
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
        this.hp = hp;

        if(hp <= 0){
            setHp(100);
            setLevel(--level);
        }
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
        if (exp >= 100) {
            this.level++;
            this.exp -= 100;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public void levelUp(int level){
        this.exp = 0;
        this.level = level + 1;
    }

    public void level100Up(int level){
        this.exp = 0;
        this.level = level + 100;
    }

    public abstract void attack();

    public abstract void defense();

    @Override
    public String toString() {
        return "Character { " +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", exp=" + exp +
                ", level=" + level +
                " }";
    }
}
