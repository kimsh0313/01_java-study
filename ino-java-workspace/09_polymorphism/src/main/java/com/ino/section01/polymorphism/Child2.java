package com.ino.section01.polymorphism;

public class Child2 extends Parent {
    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Child2() {}

    public Child2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void  printChild2() {
        System.out.println("i'm second child");
    }
}
