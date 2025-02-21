package com.jjanggu.section02.example.dto;

public class Wizard extends GameCharacter{

    //마법사 : 공통 +  마력
    private int mp;

    public Wizard(String name, int hp, int lv, int exp, int mp) {
        super(name, hp, lv, exp);
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;

        if(this.mp <= 0) {
            System.out.println("마력이 다 소진되었습니다. 방어하시면 다시 충전됩니다.");
            this.mp = 0;
        }
    }

    @Override
    public String toString() {
        return "Megician{" + super.toString() +
                ", mp=" + mp +
                '}';
    }

    //마법사 : 마법 사용 && 경험치 +10 && 마력 -10 ** 마력이 0보다 작아질 경우 0으로 초기화
    @Override
    public void attack() {
        System.out.println("마법을 쓰면서 공격한다.");
        setExp(getExp() + 10);
        setMp(getMp() - 10);
    }

    //    마법사 : 방어막 방어 && 체력 -5 && 마력 +5
    @Override
    public void defence() {
        System.out.println("방어막을 쳐서 방어한다.");
        setHp(getHp() - 5);
        setMp(getMp() + 5);
    }




}
