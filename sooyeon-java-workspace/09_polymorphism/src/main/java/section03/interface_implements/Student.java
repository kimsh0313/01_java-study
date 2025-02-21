package section03.interface_implements;

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
    public void eat() {
        System.out.println("급식먹어요");
    }

    @Override
    public void work() {
        System.out.println("공부해요");
    }

    @Override
    public void die(){
        System.out.println("공부를 안하면 엄마가 죽일기세로 텨다봐요\n");
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "school='" + school + '\'' +
                ", grade=" + grade +
                '}';
    }

}
