package com.minkook.practice1.dto;

public abstract class Animal {
    private String name;
    private String kinds;

    protected Animal(){

    }

    protected Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }

    @Override
    public String toString() {
        return "저의이름은" + name + "이고" + kinds + "입니다.";
    }
    

    public abstract void speak();
}
