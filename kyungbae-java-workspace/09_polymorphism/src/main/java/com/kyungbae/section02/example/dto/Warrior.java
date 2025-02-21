package com.kyungbae.section02.example.dto;

public class Warrior extends Character {

    private String arms;
    private String[] item;

    public Warrior(){}

    public Warrior(String name, String arms, String[] item) {
        super(name);
        this.arms = arms;
        this.item = item;
    }

    public String getArms() {
        return arms;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public String[] getItem() {
        return item;
    }

    public void setItem(String[] item) {
        this.item = item;
    }

    @Override
    public void attack(){
        System.out.printf("%s를 사용하여 공격하였습니다\n", arms);
        System.out.println("exp + 15");
        setExp(getExp()+10);
        expCount();
    }

    @Override
    public void defense(){
        System.out.println("방패를 사용하여 방어");
        System.out.println("heath - 2");
        setHealth(getHealth()-2);
        healthCount();
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "arms='" + arms + '\'' +
                ", item='" + item + '\'' +
                "} " + super.toString();
    }
}
