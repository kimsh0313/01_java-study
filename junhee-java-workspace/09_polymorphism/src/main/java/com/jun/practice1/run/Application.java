package com.jun.practice1.run;

import com.jun.practice1.dto.Animal;
import com.jun.practice1.dto.Cat;
import com.jun.practice1.dto.Dog;

public class Application {
    public static void main(String[] args) {




        Animal[] arr = new Animal[5];
        arr[0] = new Dog("도도","푸들", 5);
        arr[1] = new Cat("꼴콩", "페르시안", "집", "흰색");
        arr[2] = new Dog("레레","푸들", 5);
        arr[3] = new Cat("꼴통", "잡종", "길거리", "검은색");
        arr[4] = new Dog("미미","푸들", 5);



        for(int i=0; i<arr.length; i++){
            arr[i].speak();

        }

    }
}
