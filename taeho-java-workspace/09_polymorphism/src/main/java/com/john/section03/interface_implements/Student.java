package com.john.section03.interface_implements;

public class Student extends Person implements Behavior {
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
        return "Student{" +
                "school='" + school + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("밥탐");
    }

    @Override
    public void work() {
        System.out.println("수업 진행");
    }
    
    /* 인터페이스에 정의된 static method는 오버라이딩 불가
    @Override
    public void born(){}

     */

    // 인터페이스에 정의된 default method는 선택적으로 오버라이딩 가능
    @Override
    public void die(){
        System.out.println("사.언.죽");
    }
}



