package com.younggalee.section01.run;

import com.younggalee.section01.controller.ElectronicManager1;
import com.younggalee.section01.controller.ElectronicManager2;
import com.younggalee.section01.dto.Desktop;
import com.younggalee.section01.dto.Electronic;
import com.younggalee.section01.dto.NoteBook;
import com.younggalee.section01.dto.Tablet;

public class Application {
    public static void main(String[] args) {

        /*
        다형성 적용 전

        ElectronicManager1 es1 = new ElectronicManager1();

        es1.insert( new Desktop("삼성", "데탑" , 120 , "지포스") ); // : 데스트탑 객체 생성하여 호출
        es1.insert( new NoteBook("엘지", "그램" , 120000 , 4) ); // : 데스트탑 객체 생성하여 호출
        es1.insert( new Tablet("애플", "패드" , 111100 , false) ); // : 데스트탑 객체 생성하여 호출

        Desktop d = es1.selectDesktop();
        NoteBook n = es1.selectNoteBook();
        Tablet t = es1.selectTablet();

        */

        // 다형성 적용 후
        ElectronicManager2 es2 = new ElectronicManager2();

        es2.insert( new Desktop("삼성", "데탑" , 120 , "지포스") ); // : 데스트탑 객체 생성하여 호출
        es2.insert( new NoteBook("엘지", "그램" , 120000 , 4) ); // : 데스트탑 객체 생성하여 호출
        es2.insert( new Tablet("애플", "패드" , 111100 , false) ); // : 데스트탑 객체 생성하여 호출
        //호출과 동시에 Elec~ 부모타입으로 매개변수 생성됨

//        Desktop d = (Desktop)es2.select(0);
//        NoteBook n = (NoteBook)es2.select(1);
//        Tablet t = (Tablet)es2.select(2);

        Electronic d = es2.select(0);
        Electronic n = es2.select(1);
        Electronic t = es2.select(2);

        System.out.println(d);
        System.out.println(n);
        System.out.println(t);

        /*
        ## 대표적으로 다형성이 적용된 메소드 ##
        ex ) Object 클래스의 equals메소드
        public boolean equals(Object o){}

        학생객체.equals(학생객체)
        도서객체.equals(학생객체)
        제품객체.equals(제품객체)
         */


    }
}
