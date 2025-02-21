package com.john.section01.polymorphism;

public class Child1 extends Parent {
    private int z;

    public Child1() {
        System.out.println("Child1 constructor Called");
    }

    public Child1(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void printChild1() {
        System.out.println("I'm your First child");
    }

    @Override
    public void print() {
        System.out.println("I'm your First child Too");
    }
}
