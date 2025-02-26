package com.younggalee.section02.list.run;

import java.util.LinkedList;

public class Application5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(); //링크드리스트는 리스트랑 데큐 임플리먼트 한거라서 List로 자료형 선언할 경우, addLast,Firtst (데큐꺼) 사용불가
        list.add("캥거루");
        list.add("캥거루11");
        list.add("캥거루2");
        list.add(1, "ㅇㅇㅇ");

        System.out.println(list);
        System.out.println(list.get(0));

        list.addFirst("ghadsf");
        list.addLast("last");
        System.out.println(list);

        //getFirst(), getLast()
        System.out.println(list.getLast());

        // remove(int index) , removeFirst, removeLast
        list.remove(1);
        System.out.println(list);

    }

    /*
    java.util.LinkedList
    1. 이중 연결리스트 자료구조의 컬렉션
    2. 데이터와 데이터를 체인처럼 연결시켜 관리하는 구조
    3. 요소들 간에 앞 뒤에 node라는 걸로 연결되어 있어서 특정 위치의 요소를 추가하거나 삭제할 때 용이함.
       (추가 삭제 수정부분이 많을 경우 ArrayList가 유리. 속도 빠름. 데이터 옮길 필요없음)
    배열로 관리되는 ArrayList 같은 경우 기존 요소들을 옮겨주는 작업이 필요하나,
    4. 삭제나 삽입이 빈번할 경우 LinkedList가 좋은 성능을 냄
     */


}
