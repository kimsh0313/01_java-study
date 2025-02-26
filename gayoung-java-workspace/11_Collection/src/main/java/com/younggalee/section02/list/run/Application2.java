package com.younggalee.section02.list.run;

import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /// 피곤해??

        //현재 존재하는 배열을 List로 이관(변환)하고 싶을 경우

        // Arrays.asList(배열) : 인자로 전달된 배열의 요소들을 List에 담아 반환
        String[] seasonArr = {"봄", "여름", "가을", "겨울"};
        System.out.println(seasonArr);
        List<String> seasonList = Arrays.asList(seasonArr);
        System.out.println(seasonList);

        /*
        Arrays.asList 유의사항
        fixed-size List를 반환함 (길이 변경이 불가능한 리스트)
        새로운 요소 추가 및 요소 삭제 불가능
        단, 기존의 요소를 새로운 요소로 변경은 가능
         */

//        seasonList.add("사계절"); // UnsupportedOperationException 발생

        // set(int index, E e) : 인자로 전달된 인덱스 위치의 요소를 새로이 전달된 요소로 변경
        seasonList.set(0, "String"); // 길이 변경없는 set등은 가능
        System.out.println(seasonList);

        System.out.println("===================================");
        //arrays.asList(요소, 요소, 요소, ...) : 인자로 전달된 요소들을 List에 담아서 반환
        List<String> carList = Arrays.asList("제네시스", "벤츠", "BMW");
        System.out.println(carList);

        System.out.println("=====================");
        // List.of(요소, 요소, ...) : 해당 요소들이 담겨있는 List를 반환
        List<String> hobbyList = List.of("운동", "게임", "영화", "산책");
        System.out.println(hobbyList);

        /*
        List.of 유의사항
        unmodifiable list 반환함 (수정자체가 불가능한 리스트)
        따라서 새로운 요소 추가, 삭제, 변경 모두 안됨
         */
//        hobbyList.set(0, "요리"); // set,add,remove 다 안됨 (only 조회용)

    }
}
