package com.kyungbae.practice1.run;

import com.kyungbae.practice1.dto.Animal;
import com.kyungbae.practice1.dto.Cat;
import com.kyungbae.practice1.dto.Dog;

public class Application {

    public static void main(String[] args) {

        Animal[] ani = new Animal[5];

        ani[0] = new Dog("누렁이", "진돗개", 8);
        ani[1] = new Cat("야옹이", "고양이", "뒷산", "노란색");
        ani[2] = new Cat("냥냥이", "삼색이", "뒷산", "여러색");
        ani[3] = new Dog("흰둥이", "포메", 5);
        ani[4] = new Dog("백구", "삽살개", 11);

        for(Animal a : ani){
            a.speak();
        }
    }
}
