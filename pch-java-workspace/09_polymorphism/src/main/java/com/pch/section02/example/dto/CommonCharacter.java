package com.pch.section02.example.dto;

public abstract class CommonCharacter {
    private String name;
    private int maxHp;
    private int hp;
    private int level;
    private int maxExp;
    private int exp;

    public CommonCharacter() {
    }

    public CommonCharacter(String name, int maxHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = hp;
        this.level = 1;
        this.maxExp = 100;
        this.exp = 0;
    }

    public void death(){
        if(this.hp < 1) {
            System.out.println("사망하였습니다. 레벨이 1 로 초기화됩니다.");
            this.level = 1;
            this.hp = 100;
        }
    }

    public void levelUp(){
        while(this.exp>=maxExp){
            System.out.println("레벨업!");
            this.level++;
            this.exp -= exp;
            this.maxExp = maxExp + maxExp/10;
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", hp=" + hp +
                ", level=" + level +
                ", exp=" + exp;
    }

    public abstract void attack();
    public abstract void defense();

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
        this.exp = exp;
    }
}
