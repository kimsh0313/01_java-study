package com.seungjoo.section02.section02.abstract_extends;

public class Child1 extends Parent {
    private int z;

    public Child1() {}

    public int getZ() {
        return z;
    }

    public Child1(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    public void printChild1(){
        System.out.println("나 첫번째 자식이야");
    }

    @Override
    public void print() {
        System.out.println("나 첫번째 자식이야");
    }

}
