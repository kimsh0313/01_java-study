package com.ibe6.section02.dto.run;

public abstract class GameCharacter {
    public String name;
    public int hp;
    public int level;
    public int exp;

    public GameCharacter(){}

    public GameCharacter(String name, int hp, int level, int exp) {
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
        if(this.hp < 0){
            this.level--;
            this.hp = 100;
            System.out.println("모든 체력이 다 소모되어 레벨이 감소하였습니다. 체력은 다시 100이 되었습니다.");
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getEXp() {
        return exp;
    }

    public void setEXp(int exp) {
        this.exp = exp;
        if(this.exp >= 100){
            this.level++;
            this.exp -= 100;
            System.out.println("레벨업이 되셨습니다. 축하합니다.");
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
    public abstract void defence();


}
