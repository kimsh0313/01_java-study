package com.minkook.section01.run;

import com.minkook.section01.controller.ElectronicManager1;
import com.minkook.section01.controller.ElectronicManager2;
import com.minkook.section01.dto.Desktop;
import com.minkook.section01.dto.Electronic;
import com.minkook.section01.dto.NoteBook;
import com.minkook.section01.dto.Tablet;

public class Application {
    public static void main(String [] args){
        /*ElectronicManager1 es1 = new ElectronicManager1();
        es1.insert(new Desktop("Samsung","데탑",1200000,"Geforce1070"));
        es1.insert(new NoteBook("LG","그램",2000000,4));
        es1.insert(new Tablet("Apple","아이패드",800000,false));

        Desktop d = es1.selectDesktop();
        NoteBook n = es1.selectNoteBook();
        Tablet t = es1.selectTablet();

        System.out.println(d);
        System.out.println(n);
        System.out.println(t);*/

        ElectronicManager2 es2 = new ElectronicManager2();
        es2.insert(new Desktop("Samsung","데탑",1200000,"Geforce1070"));
        es2.insert(new NoteBook("LG","그램",2000000,4));
        es2.insert(new Tablet("Apple","아이패드",800000,false));

        Electronic d = es2.select(0);
        Electronic n = es2.select(1);
        Electronic t = es2.select(2);

        System.out.println(d);
        System.out.println(n);
        System.out.println(t);

    }
}
