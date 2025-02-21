package com.seungjoo.section01.polymorphism.polymorphism.run;

import com.seungjoo.section01.polymorphism.polymorphism.controller.ElectronicManager2;
import com.seungjoo.section01.polymorphism.polymorphism.dto.Desktop;
import com.seungjoo.section01.polymorphism.polymorphism.dto.Electronic;
import com.seungjoo.section01.polymorphism.polymorphism.dto.NoteBook;
import com.seungjoo.section01.polymorphism.polymorphism.dto.Tablet;

public class Application1 {
    public static void main(String[] args) {
/*
        ElectronicManager1 es1 = new ElectronicManager1();
        es1.insert(new Desktop("Samsung", "데탑", 120000, "Geforce1070"));
        es1.insert(new NoteBook("LG","그램", 2000000, 4));
        es1.insert(new Tablet("Apple", "아이패드", 800000, false));

        Desktop d = es1.selectDesktop();
        NoteBook n = es1.selectNoteBook();
        Tablet t = es1.selectTablet();

        System.out.println(d);
        System.out.println(n);
        System.out.println(t);
*/

        ElectronicManager2 es2 = new ElectronicManager2();
        es2.insert(new Desktop("Samsung", "데탑", 120000, "Geforce1070"));
        es2.insert(new NoteBook("LG","그램", 2000000, 4));
        es2.insert(new Tablet("Apple", "아이패드", 800000, false));



//
//        Desktop d = (Desktop) es2.select(0);
//        NoteBook n = (NoteBook) es2.select(1);
//        Tablet t = (Tablet) es2.select(2);
//   //강제 형변환


        Electronic d = es2.select(0);
        Electronic n = es2.select(1);
        Electronic t = es2.select(2);

        System.out.println(d);
        System.out.println(n);
        System.out.println(t);

















































    }
}
