package com.ino.section01.polymorphism;

public class Parent {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Parent() {}

    public Parent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printParent() {
        System.out.println("i'm parent.");
    }

    public String getInformation() {
        return "x = " + x + ", y = " + y;
    }
}
