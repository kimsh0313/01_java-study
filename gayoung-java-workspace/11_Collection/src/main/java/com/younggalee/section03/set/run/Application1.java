package com.younggalee.section03.set.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        ##  Set 컬렉션 ##
        1. 집합 형태로 데이터를 관리
        2. 순서를 유지하지 않은 채로 저장 (index같은 개념 X)
        3. 중복된 요소를 허용하지 않음 (null도 하나만 저장됨)

        ## java.util.HashSet ##
        1. Set을 구현한 하위클래스들 중에서 가장 많이 사용되는 클래스
        2. jdk 1.2부터 제공
        3. 해시 알고리즘을 사용하기 때문에 내부적으로 검색 속도가 빠름
        4. 중복된 요소를 판별할때 해당 요소의 hashCode로 범위를 추리고 equals로 요소간에 동등비교를 수행함.

         */

        Set set = new HashSet();

        // add(E e)
        set.add("안녕");
        set.add(10);
        set.add(10.2);
        set.add("안녕");
        System.out.println(set);  // 순서유지 안됨. + 중복허용X : [10.2, 안녕, 10]
        System.out.println("=======================");

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(5);
        integerSet.add(5);

        System.out.println(integerSet);
        System.out.println(integerSet.size());

        Set<Integer> lotto = new HashSet<>();
        while(lotto.size() < 6) {
            lotto.add((int)(Math.random() * 45 + 1));
        }
        System.out.println(lotto);

        //Set.of(E e1, E e2, ...) : 인자로 전달된 요소들이 담겨있는 Set 반환 (수정불가한 set)
        Set<String> stringSet = Set.of("java", "mysql","jdbc","asdf"); // duplicate element: jdbc 중복 입력 불가 (IllegalArgumentException 에러발생)
        System.out.println(stringSet);

        //stringSet.add("asd"); //추가불가 리스트와 마찬가지로 Set.of는 조회용으로만 사용가능

        // 특정 값 하나만을 반환받을 순 없고 모든 요소 순회는 가능 (get불가능)
        // 방법1. 향상된 for문
        for(String str : stringSet){
            System.out.println(str);
        }
        System.out.println("=================");
        //방법2. set을 배열로 변경하여 순회 (그럼 인덱스 접근 가능하게 됨) but 여전히 배열이 가지고 있는 크기 제한 문제 있음
        Object[] stringArr = stringSet.toArray();
        for (int i=0; i<stringArr.length; i++){
            System.out.println(stringArr[i]);
        }
        System.out.println("=================");
        //방법3. set을 List로 변경
        //List<String> stringList = new ArrayList<>();  // 기본생성자 사용
        //stringList.addAll(stringSet);

        List<String> stringList = new ArrayList<>(stringSet); // 매개변수 생성자 사용

        for(int i=0; i<stringList.size(); i++){
            System.out.println(stringList.get(i));
        }

        // 따라서 요소관리할때는 list사용이 가장 편함
        // set은 중복제거용으로 활용 > 리스트로 변환하여 사용

        System.out.println("==========================");
        //방법4. 반복자(Iterator) 사용 ******************************
        // 컬렉션(리스트, 셋 계열)과 함께 사용되는 인터페이스 요소 가져오고, 제거가 쉬움 list,set >> collection >> iterable (구현관계)
        Iterator<String> iterator = stringSet.iterator();
        // iterator() 컬렉션 내의 요소들을 iterator공간에 담아 반환
        // Iterator객체.next() : Iterator 공간내의 요소 꺼내 반환
        // Iterator객체.hasNext() : Iterator 공간내에 요소가 있을 경우 true반환

        System.out.println(iterator.next());
        System.out.println(stringSet);
        System.out.println(iterator.next());

        /*
            ## Iterator ##
            1. 컬렉션에 저장된 요소들을 순회하고 접근하기 위한 인터페이스
            2. 간단한 메소드만으로 컬렉션의 요소를 쉽게 가져올 수 있음
            3. 단, 처음부터 끝까지 단방향만 가능하고, 일회성으로 사용됨
         */






    }
}
