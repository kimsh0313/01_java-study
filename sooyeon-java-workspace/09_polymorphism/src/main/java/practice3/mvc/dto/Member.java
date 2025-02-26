package practice3.mvc.dto;

public class Member {
    private String name;
    private int age;
    private char gender;
    private int couponCount = 0;

    public Member() {
    }

    public Member(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public boolean isRentalAvailableAge(int minimumAge) {
        return age >= minimumAge;
    }

    public void updateCouponCount(int newCount) {
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
