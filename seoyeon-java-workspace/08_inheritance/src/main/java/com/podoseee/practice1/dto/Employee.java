package com.podoseee.practice1.dto;

public class Employee extends Person {
    private int salary;
    private String dept;

    public Employee() {}

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age,height,weight);
        super.name = name;

        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + super.getName() +
                ", age='" + super.getAge() + '\'' +
                ", height='" + super.getHeight() + '\'' +
                ", weight=" + super.getWeight() + '\'' +
                ", salary=" + salary + '\'' +
                ", dept=" + dept +
                '}';
    }
}
