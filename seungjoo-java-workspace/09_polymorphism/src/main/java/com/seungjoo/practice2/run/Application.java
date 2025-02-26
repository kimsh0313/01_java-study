package com.seungjoo.practice2.run;

import com.seungjoo.practice2.dto.GalaxyNote9;
import com.seungjoo.practice2.dto.SmartPhone;
import com.seungjoo.practice2.dto.V40;

public class Application {
    public static void main(String[] args) {

        SmartPhone[] phone = new SmartPhone[2];

        phone[0] = new GalaxyNote9();
        phone[1] = new V40();

        for (int i = 0; i < phone.length; i++) {

            phone[i].printMaker();
            phone[i].makeCall();
            phone[i].takeCall();
            phone[i].touch();
            phone[i].charge();
            phone[i].picture();

        }




    }
}
