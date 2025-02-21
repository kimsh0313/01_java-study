package com.jjanggu.practice1.run;

import com.jjanggu.practice1.dto.Animal;
import com.jjanggu.practice1.dto.Cat;
import com.jjanggu.practice1.dto.Dog;

public class Application {
    public static void main(String[] args) {



        Animal[] arr = new Animal[5];

        /*
        for(int i = 0; i < arr.length ; i++) {
            int ranNum = (int)(Math.random() * 2 +1);
            if (ranNum == 1) {
                arr[i] = new Dog();
                arr[i].speak();
            } else {
                arr[i] = new Cat();
                arr[i].speak();
            }
        }

         */


        arr[0] = new Dog("까미", "요크셔테리어", 3);
        arr[1] = new Cat("나비", "러시안블루", "집", "회색");
        arr[2] = new Dog("뽀미", "말티즈" , 3);
        arr[3] = new Cat("냥이", "먼치킨", "집", "하얀색");
        arr[4] = new Dog("포키", "슈나우저", 6);


        for(int i = 0 ; i < arr.length; i++){
            arr[i].speak();
        }



    }

}
