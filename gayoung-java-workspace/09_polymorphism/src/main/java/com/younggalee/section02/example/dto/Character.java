package com.younggalee.section02.example.dto;

public abstract class Character {
    // 1. 이름 체력 레벨 경험치 - 모든 캐릭터 공통
    private String name;
    private int hp;
    private int exp;
    private int level;

    public Character() { }

    public Character(String name, int hp, int exp, int level) {
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.level = level;
    }

    //부모클래스에서만 getter / setter 생성하고 이외에는 하지 않음
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

        //캐릭터 공통기능
        if(this.hp <= 0){
            this.level--;
            this.hp = 100;
            System.out.println("모든 체력이 소모되어 레벨이 감소하였습니다. 체력을 100으로 채웁니다.");
        }
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {

        this.exp = exp;
        if(this.exp >= 100){
            this.level++;
            this.exp -= 100;
            System.out.println("레벨업 되었습니다. 축하합니다.");
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // 2. 모든 캐릭터의 공통 메소드 찾기
    public abstract void attack();
    public abstract void defense();



    @Override
    public String toString() {
        return "Character{" +
                "name=" + this.name +
                ", hp=" + hp +
                ", exp=" + exp +
                ", level=" + level +
                '}';
    }
}
