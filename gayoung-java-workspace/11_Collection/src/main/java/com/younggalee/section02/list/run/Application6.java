package com.younggalee.section02.list.run;

import java.util.Stack;

public class Application6 {
    public static void main(String[] args) {
        /*
            ## java.util.Stack ##
            1. vector클래스를 상속받아 구현
            2. 선형 메모리 공간에 데이터를 저장하며
               후입선출(LIFO) 방식의 자료구조
         */
        Stack<Integer> intStack = new Stack<>();
        // push(E item) : 인자로 전달된 요소를 추가
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);  // 3
        intStack.push(5);  // 2
        intStack.push(6); // 제일 마지막에 추가(상단에 위치)   1
        System.out.println(intStack);
        System.out.println(intStack.size());
        // search(Object o) : 인자로 전달된 요소를 찾아 해당 순번을 반환
        System.out.println(intStack.search(5));
        // peek() : 해당 스택의 가장 마지막에 있는(상단) 요소 반환
        // pop() : 해당 스택의 가장 마지막에 있는(상단) 요소 반환 후 제거
        System.out.println(intStack.peek());
        System.out.println(intStack);
        System.out.println(intStack.pop());
        System.out.println(intStack);


    }
}
