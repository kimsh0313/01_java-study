package com.sh.section03.run;

import com.sh.section03.dto.Student;

import java.util.Set;
import java.util.TreeSet;

public class Application03 {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();

        stringSet.add("하하하");
        stringSet.add("호호호");
        stringSet.add("후후후");
        stringSet.add("흐흐흐");
        stringSet.add("하하하");

        System.out.println(stringSet);

        /*
        java.util.TreeSet
        데이터가 정렬된 상태로 저장되는 이진검색트리의 형태로 관리
        이진검색트리는 데이터를 추가하거나 제거할때 기본 동작 시간이 매우 빠름
        Set인터페이스가 가지는 특징을 그대로 가지지만 추가적으로 정렬된 상태로 데이터를 유지하는게 다름
         */

        //TreeSet에 저장가능한 요소는 Comparable이 구현되어있는 클래스
        Set<Student> stuSet = new TreeSet<>();
        stuSet.add(new Student("공유",50,100));
        stuSet.add(new Student("김성호",26,1000));
        stuSet.add(new Student("공격",24,90));

        System.out.println(stuSet);
    }
}
