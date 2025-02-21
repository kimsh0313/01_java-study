package com.john.section01.run;

import com.john.section01.controller.ElectronManager2;
import com.john.section01.dto.Desktop;
import com.john.section01.dto.NoteBook;
import com.john.section01.dto.Tablet;

/* ElectronManager2 Matching*/
public class Application2 {
    public static void main(String[] args) {

        ElectronManager2 em2 = new ElectronManager2();
        em2.insert(new Desktop("삼성", "데스크탑", 1200000, "Geforce5090"));
        em2.insert(new NoteBook("LG", "Gram", 2000000, 5));
        em2.insert(new Tablet("Apple", "Ipad", 2000000, false));

//        Desktop desktop = em2.select(0); // 부모타입의 값이 들어오므로 에러 발생 => 자식타입으로 변경필요
        Desktop desktop = (Desktop)em2.select(0); // 자식타입으로 Down casting, Dynamic Binding
        System.out.println(desktop);
        NoteBook noteBook = (NoteBook) em2.select(1);
        System.out.println(noteBook);
        Tablet tablet = (Tablet) em2.select(2);
        System.out.println(tablet);
    }
}
