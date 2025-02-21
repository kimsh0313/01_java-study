package com.kyungbae.section02.example.dto;

public abstract class Character {

    private String name;
    private int health = 100;
    private int level = 1;
    private int exp = 0;

    public Character(){}

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public abstract void attack();

    public abstract void defense();

    public void healthCount(){
        if (health <= 0) {
            level -= 1;
            health = 100;
            System.out.println("level 다운");
        }
    }

    public void expCount(){
        if (exp >= 100) {
            exp -= 100;
            level += 1;
            System.out.println("level Up!");
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", level=" + level +
                ", exp=" + exp +
                '}';
    }
}
