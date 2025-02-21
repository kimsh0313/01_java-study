package com.podoseee.section03.interface_implements;

public class Student extends Person/*, Behavior*/ implements Behavior{
        private String school;
        private int grade;

        public Student(){}

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
        return "Student{" + super.toString() +
                ", school='" + school + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public void eat(){
        System.out.println("학교에서 급식을 먹어요.");
    }

    @Override
    public void work(){
        System.out.println("학교에서 수업을 들어요.");
    }

    // 인터페이스에 정의되어있는 static 메소드는 오버라이딩 불가
    /*
    @Override
    public void born(){}
     */

    // 인터페이스에 정의되어있는 default 메소드는 선택적으로 오버라이딩 가능
    @Override
    public void die(){
        System.out.println("공부를 안하면 엄마가 죽일기세로 쳐다봐요.");
    }

}
