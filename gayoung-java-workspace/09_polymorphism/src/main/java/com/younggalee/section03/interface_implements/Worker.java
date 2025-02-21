package com.younggalee.section03.interface_implements;

public class Worker extends Person implements Behavior{
    private String company;
    private String position;

    public Worker() {}


    public Worker(int age, String name, String company, String position) {
        super(age, name);
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

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }



    @Override
    public void eat() {
        System.out.println("구내식당에서 밥먹음");
    }


    @Override
    public void work() {
        System.out.println(Behavior.OPENING_TIME + "시부터 " + Behavior.CLOSING_TIME + "시까지 근무해요.");
    }


}
