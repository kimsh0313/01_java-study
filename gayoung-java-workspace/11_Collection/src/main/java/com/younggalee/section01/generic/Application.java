package com.younggalee.section01.generic;

public class Application {
    public static void main(String[] args) {
        // 컨테이너 객체 생성시 String 보관을 원한다면
        Container<String> strContainer = new Container<>();
        strContainer.setItem("안녕하세요");
        System.out.println(strContainer);

        // int 보관 : 기본자료불가. 따라서 Wrapper로 감싸서 가능 Int >> Integer
        Container<Integer> intContainer = new Container<>();
        intContainer.setItem(5); // Auto boxing 진행됨
        System.out.println(intContainer);

        Container<String[]> strsContainer = new Container<>();
        strsContainer.setItem(new String[]{"안녕","잘가"});
        System.out.println(strsContainer);

        // 타입 미지정시 Object로 설정되서 사용 편한 듯 보이지만 컴파일시 에러를 잡을 수 없어(런타입에서 발생가능함) 안정성이 떨어짐
        Container whatContainer = new Container();
        whatContainer.setItem("안녕");
        System.out.println(whatContainer);
        whatContainer.setItem(10);
        System.out.println(whatContainer);

    }
}
