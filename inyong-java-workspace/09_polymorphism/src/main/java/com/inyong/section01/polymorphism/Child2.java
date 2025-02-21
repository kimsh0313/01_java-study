package com.inyong.section01.polymorphism;

public class Child2 extends Parent {
    private int n;

    public Child2() {
    }

    public Child2(int x, int y, int n) {
        super(x, y);
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void printChild2(){
        System.out.println("이자식");
    }

    @Override
    public void print(){
        System.out.println("나는 짱아야");
    }
}
