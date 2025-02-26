package section04.data_calendar_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application3 {
    public static void main(String[] args) {
        /**
         * ## java.text.SimpleDateFormat
         * YYYY
         * MM
         * DD
         * E
         * h/H
         * m
         * s
         */

        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 E HH(hh):mm");
        String date = sdf.format(today);
        System.out.println(date);

        Calendar today2 = Calendar.getInstance();
        String date2 = sdf.format(new Date());
        String date3 = sdf.format(today2.getTimeInMillis());
        System.out.println(date2);
    }
}