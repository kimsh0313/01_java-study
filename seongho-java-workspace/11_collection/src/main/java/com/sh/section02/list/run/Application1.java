package com.sh.section02.list.run;

import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /*
        ##java.util.ArrayList
        1. 가장 많이 사용되는 컬렉션
        2. JKD 1.2부터 제공
        3. 선형 자료구조로 내부적으로 배열을 이용하여 요소를 관리
            ㄴ따라서 인덱스를 이용하여 배열 요소에 빠르게 접근 가능
        4. 배열 단점을 보완하기 위해 만들어짐
            ㄴ크기변경,요소 추가,삭제,정렬 등이 메소드로 구현되어 있음

        public class ArrayList<E> implements List<E> {
            Object[] elementData;
        }
         */
        ArrayList alist = new ArrayList();
        //List list = new List();
        List list = new ArrayList(); //다형성 적용


        // add(E e) : 인자로 전달된 요소를 리스트 마지막 위치에 추가
        list.add(10);//AutoBoxing (int>Integer
        list.add(10.12);
        list.add("adsf");
        list.add(10);

        //toString() :리스트 내의 요소들을 "[]",","를 이용하여 하나의 문자열로 합쳐 반환되도록 오버라이딩
        System.out.println(list/*.toString()*/);
        //순서 유지 중복허용

        // add(int index, Ee) : 리스트 내의 인자로 전달된 인덱스 위치에 인자로 전달된 요소를 추가
        //list.add(1, new Music("apt","rose"));
        //System.out.println(list);

        //get( int index) : 리스트 내에 인자로 전달된 인덱스 위치에 요소를 e 타입으로 반환
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        //장점. 크기에 제약 x , 다양한 타입 저장 o ,복잡한 로직x
        //단, 특정 타입의 데이터만 보관되도록 제한을 두는게 좋음 (즉 , 타입 지정해서 써라!


        System.out.println("========================================");

        //정수 데이터 저장용 리스트 생성 (Integer 타입만 저장되도록)
        List<Integer> numList = new ArrayList<>();
        //numList.add("ad");
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(5);
        numList.add(5);
        System.out.println(numList);

        //size() : 리스트 내의 요소 개수 반환
        System.out.println(numList.size());
        System.out.println("마지막 인뎃스 수"+ (numList.size()-1)) ;

        for (int i = 0; i<numList.size(); i++){
            System.out.println(i +"번째 인덱스"+numList.get(i));

        }

        System.out.println("+=================================================");

        List<String> seasonList = new ArrayList<>();
        //seasonList.add(4);
        seasonList.add("봄");
        seasonList.add("여름");
        seasonList.add("가을");
        seasonList.add("겨울");

        System.out.println(seasonList);

        //변수 = seasonList.get(0) >seasonList.get(1)...seasonList.get(마지막)
        for (String s : seasonList){
            System.out.println(s);
        }

    }
}
