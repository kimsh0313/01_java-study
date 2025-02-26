package section04.date_calendar_time;


import java.util.Calendar;
import java.util.GregorianCalendar;

/*
    Calender
    1. 날짜 , 시간에 대한 값 기록
    2. 추상클래스 => 객체생성불가
        => 국가별 , 시간대별로 구체화시켜둔 하위 클래스들로 생성해서 사용(다형성)
    
 */
public class Application2 {
    public static void main(String[] args) {
//        Calendar today = Calendar.getInstance();
//        System.out.println(today instanceof GregorianCalendar);

        Calendar today2 = new GregorianCalendar();
        System.out.println(today2);

        int year = today2.get(Calendar.YEAR);
        int month = today2.get(Calendar.MONTH) + 1;
        int date = today2.get(Calendar.DATE);
        int day = today2.get(Calendar.DAY_OF_MONTH);
        int hour = today2.get(Calendar.HOUR_OF_DAY);
        int minute = today2.get(Calendar.MINUTE);
        int second = today2.get(Calendar.SECOND);
        int millisecond = today2.get(Calendar.MILLISECOND);
        int ampm = today2.get(Calendar.AM_PM);

        System.out.printf("%d년 %d월 %d일 %s %d(%d)시 %d분 %d초 \n", year, month, date, ampm, hour, hour, minute, second);

        Calendar call = new GregorianCalendar();
        call.set(Calendar.YEAR, 2023);
        call.set(Calendar.MONTH, 1);
        call.set(Calendar.DATE, 21);

        Calendar cal2 = new GregorianCalendar(2024, Calendar.JANUARY, 19);
        Calendar cal3 = new GregorianCalendar(2024,Calendar.FEBRUARY, 11, 15, 30, 20);
        System.out.println(cal2);

        System.out.println(cal3);
    }
}

