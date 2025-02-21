package com.ino.section02.abstract_extends;

public abstract class Sports {
    private int people;

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public abstract void rule();
}
