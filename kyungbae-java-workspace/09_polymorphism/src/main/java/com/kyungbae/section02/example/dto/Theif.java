package com.kyungbae.section02.example.dto;

public class Theif extends Character {

    public Theif(){}

    public Theif(String name) {
        super(name);
    }

    @Override
    public void attack(){
        System.out.println("맨손 공격");
        System.out.println("exp + 5");
        setExp(getExp()+5);
        expCount();
    }
    @Override
    public void defense(){
        System.out.println("회피");

    }

    @Override
    public String toString() {
        return "Theif{} " + super.toString();
    }
}
