package com.john.practice1.dto;

public class Dog extends Animal {
    public static String PLACE = "애견카페";
    private int weight;

    public Dog() {
    }

    public Dog(String name, String kinds, int weight) {
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
    public void speak() {
        String superResult = super.toString();
        String childResult = superResult + "몸무게는 " + this.weight + "kg 입니다.";
        System.out.println(childResult);
    }
}
