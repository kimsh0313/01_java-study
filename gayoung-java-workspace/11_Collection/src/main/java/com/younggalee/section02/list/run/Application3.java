package com.younggalee.section02.list.run;

import com.younggalee.section02.list.dto.Music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        // 주로 List에 DTO객체들을 담게 됨
        List<Music> list = new ArrayList<>();
        System.out.println(list);

        list.add(new Music("굿바이", "박효신"));
        System.out.println(list.get(0).getTitle());

        // add(int index, E e) >> add(int index, Music e)
        list.add(1, new Music("노래", "가수"));
        list.add(1, new Music("노래2", "가수2"));
        list.add(1, new Music("노래3", "가수3"));

        System.out.println(list);

        //**************
        // remove(int index) : 리스트 내의 특정 인덱스 위치의 요소를 제거
        // remove(Object o) : 리스트 내의 전달된 객체와 동일한 객체를 찾아 제거시켜줌

//        list.remove(1);
        System.out.println(list);

        System.out.println("=====================");

        // set(int index, E e) >> set(int index, Music e)
        list.set(0, new Music("술이 달다", "에픽하이"));
        System.out.println(list);

        //size()
        System.out.println(list.size());

        // get(int index) : E타입 반환 >> Music타입 반환
        System.out.println(list.get(0));

        Music m = list.get(1); // 만일 타입 설정을 안했다면 Object 타입으로 반환 >> Music으로 다운캐스팅 해야함 .
        System.out.println(m);
        System.out.println(m.getTitle());
        m.setTitle("수정됨");
        System.out.println(m);

        System.out.println("===================");
        for (Music mu : list){
            System.out.println(mu);
        }


        System.out.println("===================");
        //subList(int fromindex, int toindex) : 리스트의 fromIndex부터 toIndex이전까지의 요소들을 새로운 List에 담아 반환
        List<Music> subList = list.subList(0,2); // List<Music> 반환타입
        System.out.println(subList);

        // addAll(Collection c) : 기존 리스트에 인자로 전달된 컬랙션(Collection 하위도 가능, List계열, Set계열)의 데이터들을 통채로 추가시켜줌
        list.addAll(subList);
        System.out.println(list);

        // clear() : 리스트 내의 요소를 싹 비워줌
        list.clear();
        System.out.println(list);

        // isEmpty() : 리스트가 비어있을 경우 true 반환 ******자주쓰임
        System.out.println(list.isEmpty());

        List nonTypeList = Arrays.asList(new Music("노래1", "가수1")
                ,new Music("노래2", "가수2"), "끝");

//        Music m1 = nonTypeList.get(0); >> get()은 Object 출력임 따라서 부모객체는 자식객체로 선언될 수 없으니 다운캐스팅해야하는 경우가 발생됨
        Music m1 = (Music)nonTypeList.get(0);
//        (Music)nonTypeList.get(1).setTitle("제목수정"); //  순서 안됨
        ((Music)nonTypeList.get(1)).setTitle("제목수정");
        Music m2 = (Music)nonTypeList.get(2); // "끝" 부적절한 형변환이 진행될 수 있음

        /*
        컬렉션 사용시 타입지정 권장
        1. 명시된 타입의 객체만 저장될 수 있도록 제한을 둘 수 있어 데이터의 안정성 확보
        2. 컬렉션에 저장된 객체에 접근시 매번 형변환하는 절차를 없앨 수 있음
         */

    }


}
