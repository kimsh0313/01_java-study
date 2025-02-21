package com.jun.section02.example.dto;

public abstract class Character {
    private String name;
    private int hp;
    private int level;
    private int exp;

    public Character(){}

    public Character(String name, int hp, int level, int exp) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.exp = exp;
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
        if(this.hp <= 0){
            this.level--;
            this.hp += 100;
            System.out.println("캐릭터가 죽었습니다. 다시 부활합니다");
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
        if(this.exp >= 100){
            this.level++;
            this.exp -= 100;
            System.out.println("레벨업 되셨습니다. 축하합니다.");
        }
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", level=" + level +
                ", exp=" + exp ;
    }

    public abstract void attack();
    public abstract void defence();

}
