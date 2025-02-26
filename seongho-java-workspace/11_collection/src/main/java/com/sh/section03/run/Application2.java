package com.sh.section03.run;

import com.sh.section03.dto.Student;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        System.out.println("초기 " + set);

        set.add(new Student("김말똥",25,30));
        set.add(new Student("공유", 45,90));
        set.add(new Student("공유", 45,90));
        set.add(new Student("홍길동", 24,40));
        //add메소드 내에서

        System.out.println("추가 후 "+ set);

        //contains(Object o) : Set내에 전달된 요소가 포함되어있을 경우 true 반환
        System.out.println(set.contains(new Student("홍길동",24,40)));

        for (Student s : set){
            System.out.println(s);
        }

        System.out.println("++++++++++++");
        Object[] stuArr = set.toArray();
        for (int i = 0 ; i<stuArr.length;i++){
            System.out.println(stuArr[i]    );
        }
        System.out.println("+++++++++++++++++");
        List<Student> list = new ArrayList<>(set);
        for (int i = 0 ; i<list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
