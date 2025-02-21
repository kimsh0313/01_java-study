package com.ibe6.practice2.run;

import com.ibe6.practice2.dto.GalaxyNote9;
import com.ibe6.practice2.dto.SmartPhone;
import com.ibe6.practice2.dto.V40;

public class Application {
    public static void main(String[] args) {
        SmartPhone[] phones = new SmartPhone[2];
        phones[0] = new GalaxyNote9();
        phones[1] = new V40();

        //for문을 이용하여 SmartPhone 객체배열에 있는 GalaxyNote9과 V40 에 접근하여
        // 오버라이딩한 메소드 모두 출력
        // (printMaker, makeaCall, takeaCall, touch, charge, picture)

        for(int i=0; i< phones.length; i++){
            SmartPhone sp = phones[i];
            sp.printMaker();
            sp.makeaCall();
            sp.takeaCall();
            sp.touch();
            sp.charge();
            sp.picture();
            System.out.println("\n");
        } // 하나씩 출력하면 되는데 한꺼번에 해야된다고 착각함!

    }
}
