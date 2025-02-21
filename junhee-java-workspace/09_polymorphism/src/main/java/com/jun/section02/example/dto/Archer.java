package com.jun.section02.example.dto;

public class Archer extends Character {

    private int range;
    private int Arrowcount;

    public Archer(){}


    public Archer(String name, int hp, int level, int exp, int range, int arrowcount) {
        super(name, hp, level, exp);
        this.range = range;
        Arrowcount = arrowcount;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getArrowcount() {
        return Arrowcount;
    }

    public void setArrowcount(int arrowcount) {
        Arrowcount = arrowcount;
    }

    @Override
    public String toString() {
        return "Archer{" + super.toString() +
                ", range=" + range +
                ", Arrowcount=" + Arrowcount +
                '}';
    }

    @Override
    public void attack() {
        if(Arrowcount > 0){
            System.out.println(range + "m 거리까지 적을 화살로 쏴서 공격한다");
            // Arrowcount--;
            System.out.println("잔여 활수: " +  --Arrowcount);

            setExp( getExp() + 15 );
        }else {
            System.out.println("잔여 활이 없어서 공격을 할 수 없습니다.");
        }
    }

    @Override
    public void defence() {
        System.out.println("막을 수 없습니다");
        setHp( getHp() - 20);
    }
}
