package section03.interface_implements;

public class Worker extends Person implements Behavior {
    private String company;
    private String position;

    public Worker() {
    }

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

    @Override
    public void eat() {
        System.out.println("구내식당에서먹어요");
    }

    @Override
    public void work() {
        System.out.printf("%d부텨 %d까지 근무해요\n", Behavior.OPENING_TIME, Behavior.CLOSING_TIME);
    }

    //오버라이딩 안해도 인터페이스에 정의한것이 출력됨
    @Override
    public void die() {
        Behavior.super.die();
    }

    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                "company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

}
