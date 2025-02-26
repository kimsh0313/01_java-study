package com.sh.section04.map.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application {
    /*
    Map 컬렉션
    Collection 인터페이스와는 다른 저장 방식을 가짐
    키(key)와 값(value)을 하나의 쌍으로 저장하는 방식
    구성요소
        ㄴKey    :값(Value)을 식별해주는 식별자 역할 (Set 형태로 관리 > 순서유지X,중복허용X
        ㄴValue  :데이터, 중복 허용됨
        ㄴEntry  :Key와 Value를 함께 칭함

     */
    public static void main(String[] args) {
        /*
        java.util.HashMap
        1.Map을 구현한 하위 클래스들 중 가장 많이 사용되는 클래스
        2.해시 알고리즘을 사용하여 내부적으로 검색 속도가 빠름
         */
        //학생 한 명 정보 받기
        Map<String, Object> stu = new HashMap<>();
        // put(K key, V value) :인자로 전달 된 Key-value값을 map에 저장
        stu.put("name","홍길동");
        stu.put("age",10);
        stu.put("height",140.3);
        stu.put("kor",100);
        stu.put("eng",80);
        stu.put("kor",80);
        System.out.println(stu);//순서 유지 X ,키가 중복될 경우 value는 덮어씌워짐

        //get (Object key): 전달된 key 정보의 value를 V타입으로 반환
        System.out.println(stu.get("name"));

        double height = (double)stu.get("height");//Object로 반환되니까 강제 다운캐스팅
        System.out.println(height);

        System.out.println("++++++++==============");

        //Map.of(K k1 V v1, K k2, V v2 ....) :인자로 전달된 key-value들이 담겨있는 Map 반환 (unmodifiable map)읽기전용 수정x
        Map<String,Object> stu2 = Map.of("name","홍길순","age",10,"height",121.1);
        System.out.println(stu2);

        //Map 내의 모든 key-value 순회 가능
        //방법1.keySet() : Map내의 key들만 따로 담기는 Set반환
        Set<String> keySet = stu2.keySet();
        Iterator<String> itkey = keySet.iterator();
        while (itkey.hasNext()){
           String key = itkey.next();       //반복자로부터 키 정보 뽑기
            Object value= stu2.get(key);    //맵에서 밸류 정보 뽑기
            System.out.println(key+value);


        }
        System.out.println("================");
        // entrySet() : Map 내에 key-value 세트가 Entry 타입으로 담겨있는 Set반환
        Set<Map.Entry<String, Object>> entrySet = stu2.entrySet();

        Iterator<Map.Entry<String,Object>> itEntry = entrySet.iterator();

        while (itEntry.hasNext()){
            Map.Entry<String, Object> entry= itEntry.next();
            String key = entry.getKey();
            Object value = entry.getValue();

            System.out.println(key+" "+value);
        }

    }
}
