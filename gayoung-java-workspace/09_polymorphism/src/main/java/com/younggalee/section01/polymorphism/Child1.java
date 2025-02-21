package com.younggalee.section01.polymorphism;

public class Child1 extends Parent {
    private int z;

    public Child1(){}

    public Child1(int x, int y,int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void printChild1(){
        System.out.println("나 첫번째 자식이야");
    }

    @Override  // 오버라이딩 안쓰면 기능 문제는 없지만 틀렸을 대 컴파일러가 체크를 안해줌
    public void print(){
        System.out.println("나 첫번째 자식이야");
    }
}
