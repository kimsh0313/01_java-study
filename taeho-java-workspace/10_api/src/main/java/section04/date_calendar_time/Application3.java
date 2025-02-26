package section04.date_calendar_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
    SimpleDateFormat
    1. 날짜 및 시간 정보를 내가 원하는 형식의 문자열로 변환시켜주는 클래스
    2. 작성가능 포맷 ( y: 년, M: 월, d: 일, E: 요일, h/H: 시간, m: 분, s: 초)
 */
public class Application3 {
    public static void main(String[] args) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // 반영하고자하는 포맷
//        sdf.format(new Date()); // Date객체만 전달 가능

        Date today = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E HH(hh):mm:ss");
        String dateStr = sdf.format(today);
        System.out.println(dateStr);
        
        // Calendar 객체를 바로 전달 시 에러 발생
        Calendar calendar = Calendar.getInstance();
        // Calendar 객체를 Date객체로 변환
        String dateStr2 = sdf.format(new Date(calendar.getTimeInMillis()));
        System.out.println(dateStr2);

        // 밀리초 값을 전달
        String dateStr3 = sdf.format(calendar.getTimeInMillis());
        System.out.println(dateStr3);

    }
}
