package com.jun.section03.intetface_implements;

public class Worker extends Person implements Behavior{

    private String company;
    private String position;

    public Worker(){}


    public Worker(String name, int age, String company, String position) {
        super(name, age);
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override // 주소값을 필드값으로 바꾸기 위해 사용
    public String toString() {
        return "Worker{" + super.toString() +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("구내식당에서 밥을 먹어요");
    }

    @Override
    public void work() {
        System.out.println(Behavior.OPENING_TIME + "시부터 " + Behavior.CLOSING_TIME + "시까지 근무해요.");
    }
}
