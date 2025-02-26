package com.john.practice2.run;

import com.john.practice2.dto.GalaxyNote9;
import com.john.practice2.dto.SmartPhone;
import com.john.practice2.dto.V40;

public class Application {
    public static void main(String[] args) {
        GalaxyNote9 galaxyNote9 = new GalaxyNote9();
        V40 v40 = new V40();
        SmartPhone[] smartPhone = new SmartPhone[2];
        smartPhone[0] = new GalaxyNote9();
        smartPhone[1] = new V40();

        for (int i = 0; i < smartPhone.length; i++) {
            smartPhone[i].printMaker();
            smartPhone[i].makeACall();
            smartPhone[i].takeACall();
            smartPhone[i].touch();
            smartPhone[i].charge();
            smartPhone[i].picture();

            System.out.println();
        }
    }
}
