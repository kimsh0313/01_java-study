package com.kyungbae.section02.abstract_extends;

public abstract class Sports {

    private int people;

    public Sports(){}

    public Sports(int people) {
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public abstract void rule();

}
