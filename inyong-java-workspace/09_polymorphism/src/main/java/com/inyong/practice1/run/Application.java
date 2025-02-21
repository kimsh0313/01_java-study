package com.inyong.practice1.run;

import com.inyong.practice1.dto.Animal;
import com.inyong.practice1.dto.Cat;
import com.inyong.practice1.dto.Dog;

import java.util.Random;

public class Application {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            if (random.nextBoolean()) {
                animals[i] = new Dog("강아지" + i, "믹스견", random.nextInt(10) + 1);
            } else {
                animals[i] = new Cat("고양이" + i, "코숏", "집", "회색");
            }
        }

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}