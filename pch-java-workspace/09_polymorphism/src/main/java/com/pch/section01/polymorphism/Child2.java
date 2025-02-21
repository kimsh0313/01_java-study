package com.pch.section01.polymorphism;

public class Child2 extends Parent{
    private int n;

    public Child2(int x, int y, int n) {
        super(x, y);
        this.n = n;
    }

    public Child2() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
