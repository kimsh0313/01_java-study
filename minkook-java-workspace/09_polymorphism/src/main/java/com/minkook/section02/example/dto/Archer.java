package com.minkook.section02.example.dto;

public class Archer extends Character {
    private int limitDistance;
    private int arrowAmount;

    public int getLimitDistance() {
        return limitDistance;
    }

    public void setLimitDistance(int limitDistance) {
        this.limitDistance = limitDistance;
    }

    public int getArrowAmount() {
        return arrowAmount;
    }

    public void setArrowAmount(int arrowAmount) {
        this.arrowAmount = arrowAmount;
    }

    public Archer() {

    }

    public Archer(String nicName, int hp, int level, int exp, int limitDistance, int arrowAmount) {
        super(nicName, hp, level, exp);
        this.limitDistance = limitDistance;
        this.arrowAmount = arrowAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "limitDistance=" + limitDistance +
                ", arrowAmount=" + arrowAmount +
                '}';
    }

    @Override
    public void attack() {
        if(arrowAmount > 0){
            System.out.println(limitDistance + "m 거리까지 적을 화살로 쏴서 공격한다.");
            //arrowAmount--;
            System.out.println("잔여활수" +(--arrowAmount));

            super.setExp(super.getExp() + 15);
        }

    }

    @Override
    public void defense() {
        System.out.println("무기없이 방어한다.");
        super.setHp(super.getHp() - 20);

    }
}
