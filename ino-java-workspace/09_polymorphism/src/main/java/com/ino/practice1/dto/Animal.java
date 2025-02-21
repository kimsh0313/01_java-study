package com.ino.practice1.dto;

public abstract class Animal {
    private String name;
    private String kind;

    protected Animal(){}

    protected  Animal(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public abstract void speak();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }
}
