package com.kyungbae.practice2.run;

import com.kyungbae.practice2.dto.GalaxyNote9;
import com.kyungbae.practice2.dto.SmartPhone;
import com.kyungbae.practice2.dto.V40;

public class Application {
    public static void main(String[] args) {

        SmartPhone[] phones = new SmartPhone[2];
        phones[0] = new GalaxyNote9();
        phones[1] = new V40();

        for (SmartPhone arr : phones){
            arr.printMarker();
            arr.makecall();
            arr.takeaCall();
            arr.touch();
            arr.charge();
            arr.picture();
            System.out.println();
        }





    }
}
