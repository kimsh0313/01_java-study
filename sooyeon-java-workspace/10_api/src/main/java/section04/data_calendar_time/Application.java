package section04.data_calendar_time;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /**
         * ## java.util.Date
         * 1. 날짜 및 시간에 대한 값을 기록할 수 있는 클래스
         * 2. JDK 1.0부터 날짜 취급을 위해 사용되던 클래스, 다국적으로 쓰이기에 적합하지 않음
         *
         */


        Date today = new Date();

        System.out.println(today);

        System.out.println(today.getTime());

        //Date date = new Date(2022-1900,12-1,25,13,30,5); long타입을 넘기면 생성이됨


    }
}
