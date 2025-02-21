package com.minkook.practice1.run;

import com.minkook.practice1.dto.Animal;
import com.minkook.practice1.dto.Cat;
import com.minkook.practice1.dto.Dog;

public class Application {
    public static void main(String [] args){
        Animal [] animals = new Animal[5];
        animals[0] = new Dog("해피1","강아지",80);
        animals[1] = new Dog("해피2","강아지",90);
        animals[2] = new Dog("해피3","강아지",100);
        animals[3] = new Cat("냥냥1","고양이","일산2동","검은색");
        animals[4] = new Cat("냥냥2","고양이","장항동","회색");

        for(int i = 0; i< animals.length; i++){
            animals[i].speak();
        }
    }
}
