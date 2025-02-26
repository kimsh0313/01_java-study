package section04.date_calendar_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
    LocalDate|LocalTime|LocalDateTime
    - Date, Calendar를 보완한 클래스
    - 날짜 / 시간 / 날짜,시간 정보를 가질 수 있음
    - 객체 생성 불가
 */
public class Application4 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();

//        System.out.println(date1);
//        System.out.println(date1.getYear());
//        System.out.println(date1.getMonth());
//        System.out.println(date1.getMonthValue());
//        System.out.println(date1.getDayOfMonth());

        LocalDate date2 = LocalDate.of(2025, 1, 21);
        System.out.println(date2);

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        System.out.println(time1.toString().substring(0,8));

        LocalTime time2 = LocalTime.of(13, 30, 20);
        System.out.println(time2);

        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1);
        System.out.println(dateTime1.toString().substring(0,8));

        LocalDateTime dateTime2 = LocalDateTime.of(2024,7,11,13,0,15);
        System.out.println(dateTime2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH(hh)시 mm분 ss초");
        String nowStr = dtf.format(dateTime1);
        System.out.println(nowStr);


    }
}
