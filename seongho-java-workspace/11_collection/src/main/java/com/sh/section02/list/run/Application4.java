package com.sh.section02.list.run;

import com.sh.section02.list.comparator.AscendingTitle;
import com.sh.section02.list.comparator.DescendingTitle;
import com.sh.section02.list.dto.Music;

import java.util.*;

public class Application4 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("마술","술집","집사","사장");
        System.out.println(stringList);

        //Colections.sort(List<T>list ; 인자로 전달된 리스트 내의 요소들을 사전순
        Collections.sort(stringList);
        System.out.println(stringList);
        System.out.println("============================================="  );

        List<Integer> integerList = Arrays.asList(7,4,1,4,5);
        System.out.println(integerList );
        Collections.sort(integerList);
        System.out.println(integerList);

        System.out.println("============================================="  );

        List<Music> musiclist =Arrays.asList(new Music("한글","대한민국")
        ,new Music("가나다","마바사")
        ,new Music("아자차","카타파")
        ,new Music("하익수","영국"));

        System.out.println("정렬전 "+musiclist);

        //Collections.sort 메소드 호출시 인자로 전달하는 리스트 내의 모든 요소 클래스에는
        //Comparable 인터페이스 구현되어있어야됨
        //내부적으로 sort메소드 수행시 리스트 내의 요소들간에 compareTo메소드 실행되면서 비교되고 순서가 바뀌게 되어있음
        Collections.sort(musiclist);

        System.out.println("정렬후"+musiclist);
        // 매번 각기 다른 정렬기준을 제시하고자 할 경우
        //Collections.sort(List list, Comparator c) : 인자로 전달된 리스트 내의 요소들을
                                            //인자로 전달된 Comparator 클래스 내의 compare 메소드를 통해 비교하여 정렬

        Collections.sort(musiclist, new AscendingTitle());
        System.out.println(musiclist);

//        Collections.sort(musiclist, new DescendingTitle());
        //List 객체.sort(Comparator c) : 위와 동일
        musiclist.sort(new DescendingTitle());
        System.out.println(musiclist);

        //익명 클래스(Anonymous Class
        musiclist.sort(new Comparator<Music>(){
            @Override
            public int compare(Music o1, Music o2) {
                return o2.getArtist().compareTo(o1.getArtist());
            }
        });
        System.out.println("가수명 내림차순: "+musiclist);
    }
}
