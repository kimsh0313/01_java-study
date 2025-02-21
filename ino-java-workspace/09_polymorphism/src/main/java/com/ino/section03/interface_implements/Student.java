package com.ino.section03.interface_implements;

public class Student extends Person implements Behavior {

    private String school;
    private int grade;

    public Student(){}

    public Student(String name, int age, String school, int grade) {
        super(name, age);
        this.school = school;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "school='" + school + '\'' +
                ", grade=" + grade +
                '}';
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
    public void eat() {
        System.out.println("급식");
    }

    @Override
    public void die() {
        Behavior.super.die();
    }

    @Override
    public void work() {
        System.out.println("공부");
    }
}
