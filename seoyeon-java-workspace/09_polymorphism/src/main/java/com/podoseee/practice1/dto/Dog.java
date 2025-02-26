package com.podoseee.practice1.dto;

public class Dog extends Animal{
    private final String PLACE = "애견카페";
    private int weight;

    public Dog(){}
    public Dog(String name, String kinds, int weight){
        super(name, kinds);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "몸무게는 " + weight +"kg 입니다";
    }

    @Override
    public void speak() {}
}
