package com.younggalee.section04.map.run;

import java.sql.Array;
import java.util.*;

public class Application1 {
    /*
        ## Map 컬렉션 ##
        1. Collection 인터페이스와는 다른 저장 방식을 가짐
        2. 키(key)와 값(Value)을 하나의 쌍으로 저장하는 방식
        3. 구성요소
          1) key    : 값(value)을 식별해주는 식별자의 역할 (Set 형태로 관리 >> 순서유지x 중복허용x)
          2) value  : 데이터, 중복 허용됨
          3) Entry   : key와 value를 함께 칭함
     */

    public static void main(String[] args) {
        /*
        사용빈도 : ArrayList >> hashMap >>

        java.util.HashMap
        1. Map을 구현한 하위 클래스들 중 가장 많이 사용되는 클래스
        2. jdk1.2부터 제공
        3. 해시 알고리즘을 사용하여 내부적으로 검색 속도가 매우 빠름
         */

        // 학생한명 정보 담기
        Map<String, Object> stu = new HashMap<>();
        // put(K, V) : 전달된 키-값을 map에 저장
        stu.put("name", "홍길동");
        stu.put ("height", 120.1);
        System.out.println(stu.get("name"));
        System.out.println(stu.get("height"));
        double height = (Double) stu.get("height"); // 반환값은 V타입 (Object)로 반환될 것임. 따라서 다운캐스팅 필요
        System.out.println(height);

        Map<String, Object> stu2 = Map.of("name", "이가영", "age", 10, "height", 132.5); // Map.of는 key-value세트로 작성해야함
        // 불변임. 수정 불가 only 조회만 가능
        System.out.println(stu2);
//        stu2.remove("name");
//        stu2.replace()

        // Map 내의 모든 key-value 순회 가능
//      불가  List list = new ArrayList(stu2);  // ArrayList는 Collection만 매개변수 넣을 수 있음

        // 방법 1. keySet() : Map 내의 Key들만 따로 담기는 Set 반환
        Set<String> keySet = stu2.keySet();
//        System.out.println(keeey);
//        System.out.println(stu2.values());
//        System.out.println(stu2.entrySet());
        Iterator<String> itKey = keySet.iterator();
        // iterator() 메서드는 java.util.Collection 인터페이스에 정의된 인스턴스 메서드
        // keySet의 set 인스턴스를 통해 호출 MY (인터페이스라 객체를 통해서만 호출할 수 있음)
        while (itKey.hasNext()){
            String key = itKey.next();
            Object value = stu2.get(key);
            System.out.println(key + value);
        }

        // 방법2. entrySet() : Map내에 key-value 세트가 entry 타입으로 담겨있는 Set 반환
        Set<Map.Entry<String, Object>> entrySet = stu2.entrySet(); // 키-밸류 세트의 집합
        Iterator<Map.Entry<String, Object>> itEntry = entrySet.iterator();

        while(itEntry.hasNext()){
            Map.Entry<String, Object> entry = itEntry.next();

            String key = entry.getKey();
            Object value = entry.getValue();

//            System.out.println(key, value);
        }
    }
}
