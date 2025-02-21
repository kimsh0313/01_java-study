package com.minkook.section02.abstract_extends;

public abstract class Sports {
    private int people;

    public Sports(){

    }

    public Sports(int people){
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public abstract void rule();
    /*
        ## 추상메소드 ##
        1. abstract method
        2. 형태를 갖추지 못한 메소드(본문이 정의되어 있지 않은 메소드)
            즉 본문이 필요없는 메소드를 추상메소드로 정의하면 된다.
        3. 본문을 작성하는 {}을 없애고 abstract 예약어를 붙여 정의
        4. 추상메소드를 포함하고 있는 클래스느 반드시 추상클래스로 정의해야함
     */
}
