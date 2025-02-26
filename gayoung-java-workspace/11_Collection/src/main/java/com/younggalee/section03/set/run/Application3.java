package com.younggalee.section03.set.run;

import com.younggalee.section03.set.dto.Student;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();

        stringSet.add("aaaaaa");
        stringSet.add("bbb");
        stringSet.add("cccaaa");
        stringSet.add("addddaaa");
        stringSet.add("aaaaaa"); // 중복허용하지 않으며 순서 없음
        System.out.println(stringSet); // 하지만 정렬을 시켜서 저장됨 (python set이랑 똑같음.)

        /*
            ## java.util.TreeSet ##
            1. 데이터가 정렬된 상태로 저장되는 이진검색트리의 형태로 관리
            2. 이진검색트리는 데이터를 추가하거나 제거할 때 기본 동작 시간이 매우 빠름
            3. jdk1.2 부터 제공
            4. set인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태로 데이터를 유지한다는게 다름.

         */

        Set<Student> stuSet = new TreeSet<>();
        stuSet.add(new Student("공", 1, 2));
        stuSet.add(new Student("공1", 11, 21));
        stuSet.add(new Student("공11", 1111, 211));
        stuSet.add(new Student("공111", 11111, 21111));
        stuSet.add(new Student("공11111", 1111111, 2111111));
        System.out.println(stuSet); // 컴파일 에러는 없었으나 돌리면 Comparable이 구현되어있지 않다고 에러남
        // TreeSet에 저장가능한 요소는 Comparable이 구현되어있는 클래스

    }
}
