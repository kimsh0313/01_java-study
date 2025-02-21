package com.minkook.section01.polymorphism;

public class Child2 extends Parent {
    private int n;

    public Child2() {

    }

    public Child2(int n) {
        this.n = n;
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
        System.out.println("나 두번째자식이야" );
    }

    @Override
    public void printParent(){
        System.out.println("나 두번째 자식이야");
    }
}
