package section04.data_calendar_time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        /**
         * ## java.lang.Calendar
         * 1. 날짜 및 시간에 대한 값 기록 가능
         * 2. 국가별, 시간대별 구체화됨
         */

        //Calendar today  = Calendar.getInstance();
//        System.out.println(today);
//        System.out.println(today instanceof GregorianCalendar);//t


        Calendar today = new GregorianCalendar();
        int year = today.get(Calendar.YEAR); //인덱스인데 상수로 정의되어있음
        int month = today.get(Calendar.MONTH);
        int date = today.get(Calendar.DATE);
        int day = today.get(Calendar.DAY_OF_MONTH);
        int hour = today.get(Calendar.HOUR_OF_DAY);
        int hour12 = today.get(Calendar.HOUR);
        int minute = today.get(Calendar.MINUTE);
        int second = today.get(Calendar.SECOND);


        Calendar c1 = new GregorianCalendar(2023,Calendar.DECEMBER,12,12,12,12);






    }
}
