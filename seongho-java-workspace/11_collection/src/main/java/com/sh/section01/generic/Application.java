package com.sh.section01.generic;

public class Application {
    public static void main(String[] args) {
        Container<String> strContainer = new Container<>();
        strContainer.setItem("안녕하세");
        System.out.println(strContainer);

        //Container<int> intContainer =new Container<>();
        Container<Integer> intContainer =new Container<>();
        intContainer.setItem(10);
        System.out.println(intContainer);

        Container<String[]> strsContainer = new Container<>();
        strsContainer.setItem(new String[]{"s","sa"});

        Container whatContainer = new Container();
        whatContainer.setItem("dd");
        System.out.println(whatContainer);
        whatContainer.setItem(2);
        System.out.println(whatContainer);
        //타입 미지정시 Object로 설정됨

    }
}
