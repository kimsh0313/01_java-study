package com.younggalee.practice2.run;

import com.younggalee.practice2.dto.GalaxyNote9;
import com.younggalee.practice2.dto.SmartPhone;
import com.younggalee.practice2.dto.V40;

public class Application {
    public static void main(String[] args) {
        SmartPhone[] smPhoneArr = new SmartPhone[2];
        smPhoneArr[0] = new GalaxyNote9();
        smPhoneArr[1] = new V40();

        smPhoneArr[0].printMaker();
        smPhoneArr[0].makeaCall();
        smPhoneArr[0].takeaCall();
        smPhoneArr[0].touch();
        smPhoneArr[0].charge();
        smPhoneArr[0].picture();

        System.out.println();

        smPhoneArr[1].printMaker();
        smPhoneArr[1].makeaCall();
        smPhoneArr[1].takeaCall();
        smPhoneArr[1].touch();
        smPhoneArr[1].charge();
        smPhoneArr[1].picture();
    }
}
