package com.younggalee.section02.abstract_extends;

public abstract class Sports {
    private int people;

    public Sports(){}

    public Sports(int people){
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public  abstract void rule();
        /*
        추상 메소드
        1. 형태를 갖추지 못한 메소드(본문이 정의되어 있지 않은 메소드)
        즉, 본문이 필요 없는 메소드를 추사엠소드로 정의하면 됨
        2. 본문을 작성하는 {}을 없애고 abstract 에
         */

    }

