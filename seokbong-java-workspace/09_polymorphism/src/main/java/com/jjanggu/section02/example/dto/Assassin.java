package com.jjanggu.section02.example.dto;

public class Assassin extends GameCharacter{


    public Assassin (){}

    // 암살자 : 공통
    public Assassin(String name, int hp, int lv, int exp) {
        super(name, hp, lv, exp);
    }

    @Override
    public String toString() {
        return "Assassin{" + super.toString() + "}";
    }

    //암살자 : 맨손 공격 && 경험치 +5
    @Override
    public void attack() {
        System.out.println("주먹으로 암살공격한다.");
        setExp( getExp() + 5 );
    }

    //암살자 : 방어장비x && 은둔 회피
    @Override
    public void defence() {
        System.out.println("은둔해서 피한다");
    }





}
