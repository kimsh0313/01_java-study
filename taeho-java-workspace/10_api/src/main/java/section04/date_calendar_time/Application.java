package section04.date_calendar_time;

import java.util.Date;

/*
    Date
    - 날짜 및 시간에 대한 값을 기록할 수 있는 클래스
    - 다국적으로 쓰이기엔 적합하지 않음
 */
public class Application {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());


        Date date2 = new Date(1740115572720L);
        System.out.println(date2);
    }
}
