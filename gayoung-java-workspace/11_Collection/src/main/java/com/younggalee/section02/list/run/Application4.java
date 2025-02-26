package com.younggalee.section02.list.run;

import com.younggalee.section02.list.comparator.AscendingTitle;
import com.younggalee.section02.list.comparator.DescendingTitle;
import com.younggalee.section02.list.dto.Music;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        // 컬랙션 사용하면 정렬 작업 수월히 가능
        List<String> stringList = Arrays.asList("banana", "apple", "orange", "mango", "grape");
        System.out.println(stringList);

        // Collections 클래스에서 제공하는 sort(List<T> list)메소드 호출시 오름차순정렬이됨 (Collection은 인터페이스였음)
        Collections.sort(stringList); // 원본데이터 정렬
        System.out.println(stringList);

        System.out.println("=====================");

        List<Integer> integerList = Arrays.asList(7, 30, 12, 1, 23, 11);
        Collections.sort(integerList);
        System.out.println(integerList);

        System.out.println("==========================");
        List<Music> musicList = Arrays.asList(new Music("술이 달다", "에픽하이"), new Music("저밤", "양다일"), new Music("dlwguwlek", "wjdzl"), new Music("RJsoqhsek", "rlaskdud"));
        System.out.println(musicList);

        //sort 메소드 호출시 인자로 전달하는 리스트내의 모든 요소 클래스들에는 Comparable 인터페이스 구현이 되어있어야됨
        // 내부적으로 sort메소드 수행시 리스트 내의 요소들 간에 compareTo 메소드 실행되면서 비교되고 순서가 바뀌게 되어있음

        Collections.sort(musicList);
        System.out.println(musicList);
        
        // Collections.sort(List list, Comparator c) : 인자로 전달된 리스트 내의 요소들을 두번째 인자로 전달된 Comparator클래스 내의 compare 메소드를 통해 비교하여 정렬
//        Collections.sort(musicList, new AscendingTitle());
        System.out.println(musicList);
//        musicList.sort(new DescendingTitle()); // 내림차순
        System.out.println(musicList);

        //가수명으로 내림차순정리
        musicList.sort(new Comparator<Music>(){

            @Override
            public int compare(Music o1, Music o2) {
                return o2.getArtist().compareTo(o1.getArtist());
            }
        }); // 만들고 동시에 생성 (익명 클래스 방식 Annonymous class)
        // 인터페이스라 생성불가능해서 이를 구현하고 있는 하위클래스를 만들어서 진행
    }

}
