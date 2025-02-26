package com.younggalee.section03.set.dto;


import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int score;
    private int age;

    public Student(){}


    public Student(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }

    //Alt + Insert : equals and hashcode >> 모든 필드값이 일치하면 true로 선택

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score, age);
    }

    @Override
    public int compareTo(Student o) {
        //이름, 나이, 점수 순으로 비교가능  >> 나이
        // 앞의 학생 나이가 더 크면 순서를 변경해야됨. >> 양수를 반환하도록 하면됨.
        return this.age > o.age ? 1 : -1;
    }
}
