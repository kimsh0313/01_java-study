package com.ino.section01.run;

import com.ino.section01.controller.ElectornicManager2;
import com.ino.section01.controller.ElectronicManager1;
import com.ino.section01.dto.Desktop;
import com.ino.section01.dto.NoteBook;
import com.ino.section01.dto.Tablet;

public class Application {
    public static void main(String[] args) {
        ElectronicManager1 em = new ElectronicManager1();

//        em.insert( new Desktop("Samsung", "dt", 1200000, "Geforce1080"));
//        em.insert( new NoteBook("Samsung", "nb", 1200000, 8080));
//        em.insert( new Tablet("Samsung", "Note-8", 9600000, true));
//
//        Desktop d = em.selectDesktop();
//        NoteBook n = em.selectNoteBook();
//        Tablet t = em.selectTablet();

        ElectornicManager2 em2 = new ElectornicManager2();

        em2.insert(new Desktop("Samsung", "dt", 1200000, "Geforce1080"));
        em2.insert( new NoteBook("Samsung", "nb", 1200000, 8080));
        em2.insert( new Tablet("Samsung", "Note-8", 9600000, true));

        Desktop d = (Desktop) em2.select(0);
        NoteBook n = (NoteBook) em2.select(1);
        Tablet t = (Tablet) em2.select(2);

        System.out.println(d.toString());
        System.out.println(n.toString());
        System.out.println(t.toString());
    }
}
