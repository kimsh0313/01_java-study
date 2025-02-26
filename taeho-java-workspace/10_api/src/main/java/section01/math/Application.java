package section01.math;

/*
    ##API (Java Application Programming Interface)
    1. 자바 시스템을 제어하기 위해 제공되는 명령어들의 집합
    2. JDK 설치시 제공
 */

/* Math lib */
public class Application {
    public static void main(String[] args) {
        System.out.println(Math.PI);

        int num = -10;
        System.out.println("abs() : " + Math.abs(num));

        double num2 = 4.688;
        System.out.println("ceil() : " + Math.ceil(num2));

        System.out.println("round() : " + Math.round(num2));

        System.out.println("floor() : " + Math.floor(num2));

        System.out.println("rint() : " + Math.rint(num2));

        System.out.println("sqrt() : " + Math.sqrt(num2));
    }
}
