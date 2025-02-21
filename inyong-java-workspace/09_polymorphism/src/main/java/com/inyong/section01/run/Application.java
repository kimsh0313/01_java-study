package com.inyong.section01.run;

import com.inyong.section01.controller.ElectronicManager2;
import com.inyong.section01.controller.ElectronicManger1;
import com.inyong.section01.dto.Desktop;
import com.inyong.section01.dto.Electronic;
import com.inyong.section01.dto.NoteBook;
import com.inyong.section01.dto.Tablet;

public class Application {
    public static void main(String[] args) {

//        ElectronicManger1 es1= new ElectronicManger1();
//
//        es1.insert(new Desktop("samsung", "데탑", 1200000, "Ge-Force 1070"));
//        es1.insert(new NoteBook("LG", "그램", 2000000 , 4));
//        es1.insert(new Tablet("Apple","아이패드", 80000, false));
//
//        Desktop d = es1.selectDesktop();
//        NoteBook n = es1.selectNoteBook();
//        Tablet t = es1.selectTablet();
//        System.out.println(d);
//        System.out.println(n);
//        System.out.println(t);
//

        ElectronicManager2 ec2 = new ElectronicManager2();

        ec2.insert(new Desktop("samsung", "데탑", 1200000, "Ge-Force 1070"));
        ec2.insert(new NoteBook("LG", "그램", 2000000, 4));
        ec2.insert(new Tablet("Apple", "아이패드", 80000, false));

//        Desktop d = (Desktop) ec2.select(0);
//        NoteBook n = (NoteBook)ec2.select(1);
//        Tablet t = (Tablet)ec2.select(2);

        Electronic d = ec2.select(0);
        Electronic n = ec2.select(1);
        Electronic t = ec2.select(2);

        System.out.println(d);
        System.out.println(n);
        System.out.println(t);

        /*
        대표적으로 다형성이 적용된 메소드
        Object 클래스의 equals 메소드
        public boolean equals(Object o){

        }

        학생개체.equals(학생객체)
        도서객체.equals(도서객체)
        ...



         */
    }
}
