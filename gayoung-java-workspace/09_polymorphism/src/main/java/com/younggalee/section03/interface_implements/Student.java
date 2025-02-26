package com.younggalee.section03.interface_implements;

public class Student extends Person implements /*구현한다*/ Behavior{
    private String school;
    private int grade;

    public Student () {}

    public Student(String name, int age, String school, int grade) {
        super(age, name);
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
        return "Student{" + super.toString() + ", school='" + school + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("학교에서 급식을 먹어요.");
    }

    @Override
    public void work() {
        System.out.println("학교에서 수업을 들어요.");
    }

    //인터페이스에 정의되어있는 static 메소드는 오버라이딩 불가 born()

    // 인터페이스에 정의되어있는 default 메소드는 선택적으로 오버라이딩 가능
    @Override
    public void die(){
        System.out.println("공부안하면 죽음");
    }

}
