package com.seungjoo.practice1.run;

import com.seungjoo.practice1.dto.Animal;
import com.seungjoo.practice1.dto.Cat;
import com.seungjoo.practice1.dto.Dog;

public class Application {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog("이승주", "푸들", 10);
        animals[1] = new Dog("이승", "비숑", 20);
        animals[2] = new Dog("이", "왈츠", 5);
        animals[3] = new Cat("주", "고양이", "서울","흰색");
        animals[4] = new Dog("승주", "찹쌀", 8);

        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Dog) {
                ((Dog)animals[i]).speak();
            }else if(animals[i] instanceof Cat) {
                ((Cat)animals[i]).speak();
            }

        }




    }
}
