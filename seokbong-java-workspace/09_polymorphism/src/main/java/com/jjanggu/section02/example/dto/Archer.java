package com.jjanggu.section02.example.dto;

public class Archer extends GameCharacter {


    // 궁수 : 공통 + 화살 쏠 수 있는 거리, 잔여 화살량
    private int range;
    private int arrow;

    public Archer (){}



    public Archer(String name, int hp, int lv, int exp, int range, int arrow) {
        super(name, hp, lv, exp);
        this.range = range;
        this.arrow = arrow;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    @Override
    public String toString() {
        return "Archer{" + super.toString() +
                ", range=" + range +
                ", arrow=" + arrow +
                '}';
    }

    // 궁수 : if(잔여화살){화살 사용(잔여화살-1) && 경험치 +15}
    @Override
    public void attack() {
        if(arrow > 0){
            System.out.println(range + "m 거리까지 적을 화살로 쏴서 공격한다.");
//            arrow--;
            System.out.println("잔여 화살수 : " + --arrow);

            setExp( getExp() + 15 );
        }else {
            System.out.println("잔여 화살이 없어서 공격을 할 수 없습니다.");
        }

    }

    //    궁수 : 방어장비x && 체력 -20
    @Override
    public void defence() {
        System.out.println("방어할 장비가 없어 막을 수 없습니다.");
        setHp(getHp() - 20);
    }

}