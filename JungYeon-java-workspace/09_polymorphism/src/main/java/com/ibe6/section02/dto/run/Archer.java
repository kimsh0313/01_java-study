package com.ibe6.section02.dto.run;

public class Archer extends GameCharacter {

    private int distance;
    private int count;

    public Archer(){}


    public Archer(String name, int hp, int level, int exp, int distance, int count) {
        super(name, hp, level, exp);
        this.distance = distance;
        this.count = count;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        return "Archer{" + super.toString() +
                ", distance=" + distance +
                ", count=" + count +
                '}';
    }

    @Override
    public void attack() {
        if(count > 0){
            System.out.println(distance + "m 거리까지 적을 화살로 쏴서 공격한다.");
//            count--;
            System.out.println("잔여 활수: " + --count);

            setEXp( getEXp() + 15 );
        }else{
            System.out.println("잔여 활이 없어서 공격을 할 수 없습니다.");
        }

    }

    @Override
    public void defence() {
        System.out.println("막을 수 없습니다...");
        setHp( getHp() - 20 );
    }

}

