package com.younggalee.section02.list.run;

import com.younggalee.section02.list.dto.Music;

import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /*
            ## java.util.ArrayList ##
            1. 가장 많이 사용되는 컬렉션
            2. JDK 1.2부터 제공
            3. 선형 자료구조로 내부적으로 배열을 이용하여 요소를 관리
               따라서 인덱스를 이용하여 배열 요소에 빠르게 접근 가능
            4. 배열의 단점을 보완하기 위해 만들어짐
               크기 변경, 요소 추가, 삭제, 정렬 등이 이미 메소드로 구현되어 제공되고 있음.

            my) T는 객체 타입, E는 데이터 타입

            public class ArrayList<E> implements List<E>{
                Object[] elementData;
                public boolean add(E e){
                    elementData[xx] = d;
                }
                public E get(int index){
                    return elementData[index]
                    }
            }
         */
        ArrayList alist = new ArrayList();  //List는 추상메소드라서 new 생성 불가능.

        // type으로 사용은 가능. 다형성 적용하여 상위인스턴스로 하위 인스턴스들 관리 가능
        List list = new ArrayList(); // 타입지정 안하면 object로
        // add(E e) : 인자로 전달된 요소를 리스트 마지막 위치에 추가
        list.add(10); // AutoBoxing (int >>Integer)
        // double 가능, String 가능
        list.add(10.23);
        list.add("안녕");

        // toString() : 메소드 오버라이딩 되어있음
        System.out.println(list.toString()); // [10, 10.23, 안녕]

        // add(int index, E e) : 리스트 내의 인자로 전달된 인덱스 위치에 인자로 전달된 요소를 추가
        list.add(1, new Music("APT", "ROSE"));
        System.out.println(list);  // [10, Music{title='APT', artist='ROSE'}, 10.23, 안녕]

        // get(int index) : 리스트 내의 인자로 전달된 인덱스 위치의 요소를 E 타입으로 반환시켜주는 메소드
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        // 장점. 크기에 제약이 없고, 다양한 타입 데이터 저장 가능. 그러면서 복잡한 로직 구현 필요 없음
        // 단, 특정 타입의 데이터만 보관되도록 저한을 두는게 좋음 (즉, 타입 지정해서 써라.)


        System.out.println("=================================");
        List<Integer> numList = new ArrayList<>();  // 컬랙션 내의 E 타입이 모두 Integer로 변경될 것임
        numList.add(10); // 오직 정수만 가능해짐. (문자열 불가능)

        // size() : 리스트 내의 요소 개수 반환
        System.out.println(numList.size());

        for(int i=0; i<numList.size(); i++){
            System.out.println(i + "번째 인덱트의 값 : " + numList.get(i));
        }

        System.out.println("=============");
        List<String> seasonList = new ArrayList<>();

        seasonList.add("봄");
        seasonList.add("여름");
        seasonList.add("가을");
        seasonList.add("겨울");
        System.out.println(seasonList);

        //향상된 for문도 가능
        for(String season : seasonList){ // 변수  = seasonList.get(0)  >> (1)
            System.out.println(season);
        }


    }
}
