package com.ino.practice1.dto;

public class Dog extends Animal {
    public final static String PLACE = "애견카페";
    private int weight;
    public Dog(){}

    public Dog(String name, String kind, int weight) {
        super(name, kind);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void speak() {
        System.out.println("bow-wow");
    }
}
