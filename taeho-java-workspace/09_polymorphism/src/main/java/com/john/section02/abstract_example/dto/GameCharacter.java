package com.john.section02.abstract_example.dto;

public abstract class GameCharacter {
    private int id;
    private String name;
    private int hp;
    private int level;
    private int exp;

    public GameCharacter() {
    }

    public GameCharacter(int id, String name, int hp, int level, int exp) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.exp = exp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

        if (this.hp <= 0){
            this.level--;
            this.hp = 100;
            System.out.println("사망으로 레벨이 감소하였습니다.");
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
            System.out.println("레벨업!");
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", level=" + level +
                ", exp=" + exp +
                '}';
    }

    public abstract void attack();

    public abstract void defense();
}
