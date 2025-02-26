package com.seungjoo.section03.interface_implements;

public abstract class Person { //추상 클래스로 설정을 하면 new Person()이 안됨.
                                //생성자를 냅두는 이유는 자식측에서 알게모르게 부모 생성자를 사용하기 때문에 필요
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", age=" + age
                ;
    }
}
