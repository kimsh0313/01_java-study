package com.sh.section02.list.run;

import java.util.Arrays;
import java.util.List;

public class Application2  {
    public static void main(String[] args) {
        //현재 존재하는 배열을 List로 이관(변환)하고 싶을 경우

        //Arrays.asdList(배열): 인자로 전달된 배열의 요소들을 List에 담아서 반환
        String[] seasonArr ={"봄","여름","가을","겨울"};
        List<String> seasonList = Arrays.asList(seasonArr);

        System.out.println(seasonList);
//        /*
//        Arrays.asList 유의사항
//        fixed-size list 반환함 ( 일이 변경이 불가능한 리스트)
//        새로운 요소 추가 및 요소 삭제 불가능
//        단 , 기존의 요소를 새로운 요소로 변경은 가능
//
//         */
//        //seasonList.add("사");
//        // set(int index, E e ) : 인자로 전달된 인덱스 위치의 요소를 새로이 전달된 요소로 변경
//        seasonList.set(0,"Spring");
//        System.out.println(seasonList);
//        System.out.println("======================================================");
//
//        // Arrays.asList(요소,요소,요소..):인자로 전달 된 요소들을 List에 담아서 반환
//        List<String> carList = Arrays.asList("asdf","asdfds","sdf");
//        System.out.println(carList);
//
//        System.out.println("=======================");
//
        //List.of(요소,요소,요소...)해당 요소들이 담겨있는 List반환
        List<String> hobbyList=List.of("asd","asda","adff");
        System.out.println(hobbyList);
        /*
        //List.of유의사항
            unmodifiable list 반환함 (수정 자체가 불가능한 리스트
            새로운 요소 추가 , 변경 ,삭제 모두 안 됨
         */
        //hobbyList.add("dyfl");
        //hobbyList.remove(1);
        hobbyList.set(0,"dyfl");


    }
}
