package com.john.section01.run;

import com.john.section01.dto.Desktop;
import com.john.section01.controller.ElectronManager1;
import com.john.section01.dto.NoteBook;
import com.john.section01.dto.Tablet;

/* ElectronManager1 Matching*/
public class Application1 {
    public static void main(String[] args) {

        ElectronManager1 em1 = new ElectronManager1();

        em1.insert(new Desktop("삼성", "데스크탑", 1200000, "Geforce5090"));
        em1.insert(new NoteBook("LG", "Gram",2000000, 5));
        em1.insert(new Tablet("Apple", "Ipad",2000000, false));

        Desktop desktop = em1.selectDesktop();
        System.out.println(desktop);

        NoteBook noteBook = em1.selectNoteBook();
        System.out.println(noteBook);

        Tablet tablet = em1.selectTablet();
        System.out.println(tablet);
    }
}
