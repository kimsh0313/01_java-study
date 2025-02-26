package com.inyong.section03.interface_implements;

public class Student extends Person implements Behavior, Behavior2{
    private String school;
    private int grade;

    public Student() {

    }

    public Student(String name, int age, String school, int grade) {
        super(name, age);
        this.school = school;
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{ " + super.toString() +
                " school= '" + school + '\'' +
                ", grade= " + grade +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("급식 펀치");

    }

    @Override
    public void work() {
        System.out.println("으 수업듣기 싫다");
    }

    // 인터페이스에 정의 되어있는 static 메소드는 오버라이딩 불가


    // default 메소드는 선택적으로 오버라이딩 가능
    @Override
    public void die() {
        System.out.println("공부를 안하면 취업을 못해요");
        Behavior.super.die();
    }
}
