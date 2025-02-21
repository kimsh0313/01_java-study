package section01.run;

import section01.controller.ElectronicManager1;
import section01.controller.ElectronicManager2;
import section01.dto.Desktop;
import section01.dto.Electronic;
import section01.dto.NoteBook;
import section01.dto.Tablet;

public class Application {
    public static void main(String[] args) {
        /**
         * 자식클래스명 변경, 또는 추가 시 유지보수 어려움
         */
        /*
        ElectronicManager1 es1 = new ElectronicManager1();
        es1.insert(new Desktop("삼성", "테탑", 120000, "GF"));
        es1.insert(new NoteBook("LG", "그램", 200000, 4));
        es1.insert(new Tablet("Apple", "아이패드", 800000, false));

        Desktop desktop = es1.selectDesktop();
        NoteBook noteBook = es1.selectNoteBook();
        Tablet tablet = es1.selectTablet();

        System.out.println(desktop);
        System.out.println(noteBook);
        System.out.println(tablet);

         */


        ElectronicManager2 manager2 = new ElectronicManager2();
        manager2.insert(new Desktop("삼성", "테탑", 120000, "GF"));
        manager2.insert(new NoteBook("LG", "그램", 200000, 4));
        manager2.insert(new Tablet("Apple", "아이패드", 800000, false));

        Desktop desktop = (Desktop) manager2.select(0);
        NoteBook noteBook = (NoteBook) manager2.select(1);
        Tablet tablet = (Tablet) manager2.select(2);

        for(Electronic e : manager2.getElectronics()) {
            System.out.println(e);
        }

        /**
         * ## 다형성이 적용된 메서드
         * 1. equals : 매개변수가 Obeject 상위 클래스이기 때문에 자식 모든 클래스가 들어갈 수 있다.
         *
         */


    }
}
