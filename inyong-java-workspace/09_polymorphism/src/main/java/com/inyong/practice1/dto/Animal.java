package com.inyong.practice1.dto;

public abstract class Animal {
    protected String name;
    protected String kinds;

    protected Animal() {}

    protected Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', kinds='" + kinds + "'}";
    }

    public abstract void speak();
}
