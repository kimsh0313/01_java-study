package section04.data_calendar_time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application4 {
    public static void main(String[] args) {
        /**
         * ## java.time.LocalDate
         *              LocalTime
         *              LocalDateTime
         *
         * - Date를 보완한 클래스
         * - 날짜,시간, 둘다의 정보를 가질 수 있음
         * - 객체생성불가
         *
         */

        /// 날짜만
        LocalDate date3 = LocalDate.now();
        /// 시간만
        LocalTime time1 = LocalTime.now();
        /// 날짜+시간
        LocalDateTime dateTime1 = LocalDateTime.now();


//        LocalDate date = new LocalDate(); //인스턴스 생성 불가

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        System.out.println(date1.getYear());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getDayOfYear());

        LocalDate date2 = LocalDate.of(2029, 12, 25);


        System.out.println(date3); //2025-02-21
        System.out.println(time1); //16:08:40.545975900
        System.out.println(dateTime1); //2025-02-21T16:08:40.545975900
        System.out.println(dateTime1.toString().replace("T", " "));///2025-02-21 16:09:32.639419300


        /// Formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E(e)요일 HH(hh)시 mm분 ss초"); //2025년 02월 21일 금요일 16시 13분
        System.out.println(dateTime1.format(formatter));


    }
}
