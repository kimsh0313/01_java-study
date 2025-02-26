package com.sh.section02.list.run;

import com.sh.section02.list.dto.Music;

import java.util.ArrayList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        //주로 List에 DTO객체들을 담게됨

        List<Music> list = new ArrayList<>();
        System.out.println(list );

        list.add(new Music("good bye","박효신"));
        list.add(new Music("이 밤","양다일"));
        list.add(new Music("잊혀지다","정키"));

        System.out.println(list);

        list.add(1, new Music("진심이담긴노래","케이시"));
        System.out.println(list);

        //remove(int index) : 리스트 내에 특정 인덱스 위치의 요소를 제거
        //remove(Object o) : 리스트 내에 전달된 객체와 동일한 객체를 찾아 제거시켜줌
        list.remove(1);
        System.out.println(list);

        //set(int index, E e) > set(int index, Music e)
        list.set(0, new Music("asdf","adf"));
        System.out.println("변경후 list"+list);
        //size()
        System.out.println(list.size());
        //get(int index) : E 타입 반환 > Music 타입 반환
        System.out.println("0번 인덱스"+list.get(0));

        Music m = list.get(1);//만일 타입 설정을 안 했다면 Object타입으로 반환> Music으로 다운캐스팅 해야됨
        System.out.println("1번 인덱스 " + m);
        System.out.println("2번 인덱스 제목만" + list.get(2).getTitle());

        //2번 인덱스의 Music객체의 제목을 "저 밤으로 수정
        list.get(1).setTitle("저 밤");
        System.out.println("수정 후 1번 "+ list.get(1));

        System.out.println("==========================");
        for (int i=1; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("==========================");
//        for (Music m : list){
//            System.out.println(m);
//        }
        System.out.println("==========================");


        //subList(int fromIndex,int toIndex) : 리스트의 fromIndex부터 toIndex이전까지의 요소들을 새로운 list에 담아 반환
        List<Music> subList = list.subList(0,2);
        System.out.println("추출한 리스트 "+subList);

        //addALL(Collertion c ) : 기존 리스트에 인자로 전달된 컬렉션(Collection 하위, List계열:Set계열)의 데이터들을 통채로 추가시켜줌
        list.addAll(subList);
        System.out.println("추가 "    + list);

        list.clear();
        System.out.println("초기화 "+list);

        //isEmpty() :리스트가 비어있는지: 비어있으면 true
        System.out.println("비었나 " +list.isEmpty());

      //  (Music)conType.get(i).setTitle("저밤");




    }
}
