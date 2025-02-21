package com.inyong.section01.polymorphism;

public class Parent {
    private int x;
    private int y
;

    public Parent() {
    }

    public Parent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void printParent(){
        System.out.println("내가 니 애비다");
    }

    public void print(){
        System.out.println("내가 니 애미다");
    }
}
