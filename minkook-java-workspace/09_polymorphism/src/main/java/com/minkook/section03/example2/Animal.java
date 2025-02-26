package com.minkook.section03.example2;

public abstract class Animal {
    private String name;
    private String kinds;

    public Animal() {
    }

    public Animal(String anme, String kinds) {
        this.name = anme;
        this.kinds = kinds;
    }

    public String getName() {
        return name;
    }

    public void setName(String anme) {
        this.name = anme;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", kinds='" + kinds + '\'';
    }

    public abstract String vark();
}
