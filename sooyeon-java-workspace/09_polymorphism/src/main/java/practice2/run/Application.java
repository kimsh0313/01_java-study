package practice2.run;

import practice2.dto.GalaxyNote9;
import practice2.dto.SmartPhone;
import practice2.dto.V40;

public class Application {
    /**
     * 점선이 인터페이스
     */

    public static void main(String[] args) {
        SmartPhone[] phones = new SmartPhone[2];
        phones[0] = new GalaxyNote9();
        phones[1] = new V40();


        for(SmartPhone phone : phones){
            phone.printMaker();
            phone.makeaCall();
            phone.takeaCall();
            phone.touch();
            phone.charge();
            phone.picture();

            System.out.println();
        }
    }

}
