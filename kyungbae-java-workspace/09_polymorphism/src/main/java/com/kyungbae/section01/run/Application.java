package com.kyungbae.section01.run;

import com.kyungbae.section01.controller.ElectronicManager1;
import com.kyungbae.section01.controller.ElectronicManager2;
import com.kyungbae.section01.dto.Desktop;
import com.kyungbae.section01.dto.Electronic;
import com.kyungbae.section01.dto.Notebook;
import com.kyungbae.section01.dto.Tablet;

public class Application {

    public static void main(String[] args) {
        /*
        // 다형성 전
        ElectronicManager1 es1 = new ElectronicManager1();

        es1.insert( new Desktop("Samsung", "컴퓨터", 1200000, "RTX3070") );
        es1.insert( new Notebook("LG","gram", 2000000, 4));
        es1.insert( new Tablet("apple", "ipad", 8000000, false));

        Desktop d = es1.selectDestop();
        Notebook n = es1.selecNotebook();
        Tablet t = es1.selectTablet();

        System.out.println(d);
        System.out.println(n);
        System.out.println(t);
         */

        ElectronicManager2 es2 = new ElectronicManager2();

        es2.insert( new Desktop("Samsung", "컴퓨터", 1200000, "RTX3070") );
        es2.insert( new Notebook("LG","gram", 2000000, 4));
        es2.insert( new Tablet("apple", "ipad", 8000000, false));

        /*
        // DownCasting
        Desktop d = (Desktop) es2.select(0);
        Notebook n = (Notebook) es2.select(1);
        Tablet t = (Tablet) es2.select(2);

         */

        Electronic d = es2.select(0);
        Electronic n = es2.select(1);
        Electronic t = es2.select(2);

        System.out.println(d);
        System.out.println(n);
        System.out.println(t);

        d.equals(t);
    }

}
