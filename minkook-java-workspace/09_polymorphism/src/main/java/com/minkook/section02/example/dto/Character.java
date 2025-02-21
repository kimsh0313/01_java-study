package com.minkook.section02.example.dto;

public abstract class Character {
    /*
    이름, 체력, 레벨, 경험치
     */
    private String nicName;
    private int hp;
    private int level;
    private int exp;

    public Character() {
    }

    public Character(String nicName, int hp, int level, int exp) {
        this.nicName = nicName;
        this.hp = hp;
        this.level = level;
        this.exp = exp;
    }

    public String getNicName() {
        return nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if(this.hp <= 0){
            this.level--;
            this.hp = 100;
            System.out.println("모든 체력이 소모하여 레벨이 감소하였습니다. 체력은 다시 100이 되었습니다.");
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
        this.exp = exp;
        if(this.exp <= 0){
            this.level++;
            this.exp -= 100;
            System.out.println("레벨업이 되셨습니다. 축하합니다.");
        }

    }

    @Override
    public String toString() {
        return "nicName='" + nicName + '\'' +
                ", hp=" + hp +
                ", level=" + level +
                ", exp=" + exp +
                '}';
    }

    public abstract void attack();

    public abstract void defense();



}
