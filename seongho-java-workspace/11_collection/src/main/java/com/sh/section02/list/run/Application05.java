package com.sh.section02.list.run;

import java.util.LinkedList;

public class Application05 {
    public static void main(String[] args) {
        /*
        java.util.LinkedList
        이중 연결 리스트 자료구조의 컬렉션\
        데이터와 데이터를 체인처럼 연결시켜 관리하는 구조
        요소들 간에 앞 뒤에 Node라는 걸로 연결되어 있어 특정 위치의 요소를  추가하거나 삭제할 때
        배열로 관리되는 ArrayList 같은 경우 기존의 요소들을 옮겨주는 작업이 내부적으로 진행 LinkedList 는 해당 요소 앞 뒤 링크만 연결하면 됨
        삭제나 삽입이 빈번한경우 LinkedList가 좋은 성능을 냄

         */
        LinkedList<String> list = new LinkedList<>();

        list.add("캥거루");
        list.add("김말똥");
        list.add("강개순");
        list.add(1,"김성호");
        System.out.println(list);

        for (int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.addFirst("홍길동");
        System.out.println(list);
        list.addLast("강개똥");
        System.out.println(list);


        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();
    }
}
