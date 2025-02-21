package practice3.mvc.dto;

public class Member {
    private String name;
    private int age;
    private char gender;
    private int couponCount;

    public Member() {
    }

    public Member(String name, int age, char gender, int couponCount) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;
    }

    public boolean isRentalAvailableAge(int minimumAge){
        return age >= minimumAge;
    }

    public void updateCouponCount(int newCount){
        couponCount += newCount;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", couponCount=" + couponCount +
                '}';
    }

}
