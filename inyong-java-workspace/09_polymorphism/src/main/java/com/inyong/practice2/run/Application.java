package com.inyong.practice2.run;

import com.inyong.practice2.dto.GalaxyNote9;
import com.inyong.practice2.dto.SmartPhone;
import com.inyong.practice2.dto.V40;

public class Application {
    public static void main(String[] args) {
        SmartPhone[] phones = new SmartPhone[2];
        phones[0] = new GalaxyNote9();
        phones[1] = new V40();

        for (SmartPhone phone : phones) {
            phone.printMaker();
            phone.makeCall();
            phone.takeCall();
            phone.touch();
            phone.charge();
            phone.picture();
            System.out.println();
        }
    }
}