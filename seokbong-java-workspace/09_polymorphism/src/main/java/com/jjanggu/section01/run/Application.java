package com.jjanggu.section01.run;

import com.jjanggu.section01.controller.ElectronicManager1;
import com.jjanggu.section01.controller.ElectronicManager2;
import com.jjanggu.section01.dto.Desktop;
import com.jjanggu.section01.dto.Electronic;
import com.jjanggu.section01.dto.NoteBook;
import com.jjanggu.section01.dto.Tablet;


public class Application {
    public static void main(String[] args) {
        /*
        ElectronicManager1 es1 = new ElectronicManager1();

        es1.insert( new Desktop("Sanmsung", "데탑", 1200000,"Geforce1070") );
        es1.insert( new NoteBook("LG", "그램", 2000000, 4 ) );
        es1.insert( new Tablet("Apple", "아이패드", 800000 , false) );

        Desktop d = es1.selectDesktop();
        NoteBook n = es1.selectNoteBook();
        Tablet t = es1.selectTablet();

        System.out.println(d);
        System.out.println(n);
        System.out.println(t);

         */

        ElectronicManager2 es2 = new ElectronicManager2();

        es2.insert( new Desktop("Sanmsung", "데탑", 1200000,"Geforce1070") );
        es2.insert( new NoteBook("LG", "그램", 2000000, 4 ) );
        es2.insert( new Tablet("Apple", "아이패드", 800000 , false) );

        /*
        Desktop d = (Desktop)es2.select(0);
        NoteBook n = (NoteBook)es2.select(1);
        Tablet t = (Tablet)es2.select(2);
         */

        Electronic d = es2.select(0);
        Electronic n = es2.select(1);
        Electronic t = es2.select(2);

        System.out.println(d);
        System.out.println(n);
        System.out.println(t);

        /*
            ## 대표적으로 다형성이 적용된 메소드 ##
            Object 클래스의 equals메소드
            public boolean equals(Object o) {

            }

            학생객체.equals(학생객체)
            도서객체.equals(도서객체)
            제품객체.equals(제품객체)
         */

    }
}
