package com.kyungbae.section02.string;

import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) {

        String str = "Java,MySQL,MyBatis,Front,Sprint";

        // 문자열 분리 시키는 방법
        // 방법1. 분리된 문자열을 String[]로 담아 관리하고자 할 경우 => split() 메소드 사용
        //        문자열.split("구분자") : String[]

        String[] stArr = str.split(",");
        System.out.println(stArr.length); // 5

        for (String arr : stArr){
            System.out.println(arr);
        }

        System.out.println("=============================");
        // 방법2. 분리된 문자열들을 토큰으로 관리하고자 할 경우 => java.util.StringTokenizer 사용
        //        StringTokenizer 변수 = new StringTokenizer ("문자열", "구분자")
        //        단, StringTokenizer 객체 내에 담긴 분리된 문자열은 한번 꺼내쓰면 끝 (일회성)
        StringTokenizer stn = new StringTokenizer(str, ","); // 구분자로 나눈 문자열들을 토큰에 담기
        System.out.println(stn.countTokens());  // 토큰의 개수 확인 = 5


        /*
//        for (int i = 0; i < stn.countTokens(); i++) { // countTokens가 변경함에 따라 수가 점점 줄어든다
//            System.out.println(stn.nextToken());
//        }
          i = 0 i< stn.countTokens() = 5; i++
          i = 1 i< stn.countTokens() = 4; i++
          i = 2 i< stn.countTokens() = 3; i++
          i = 3 i< stn.countTokens() = 2; i++ // 종료
         */

        // 방법1. 최초의 countTokens() 를 임의의 int 변수에 넣어서 사용
//        int count = stn.countTokens();
//        for (int i = 0; i < count; i++) {
//            System.out.println(stn.nextToken());
//        }

        // 방법2. hasMoreTokens() 사용, 남아있는 token이 있을때마다 작동
//        while (stn.hasMoreTokens()){
//            System.out.println(stn.nextToken()); //
//        }

        // 방법3. hasMoreElements() 사용, 남아있는 elements가 있을때마다 작동
        while (stn.hasMoreElements()){
            System.out.println(stn.nextElement());
        }


        System.out.println(stn.countTokens()); // 0 => 토큰 모두 사용
//        System.out.println(stn.nextToken()); // errer NoSuchElementException => 남은 요소가 없음 (토큰 모두 사용)




    }
}
