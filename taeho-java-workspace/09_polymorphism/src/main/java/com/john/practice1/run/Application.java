package com.john.practice1.run;

import com.john.practice1.dto.Animal;
import com.john.practice1.dto.Cat;
import com.john.practice1.dto.Dog;

public class Application {
    public static void main(String[] args) {
        // 종
        String[] kinds = {"Cat", "Dog"};
        // 이름
        String[] names = {"Jack", "Tom", "Kim", "방울이", "야옹이", "멍멍이"};
        // 몸무게
        int[] weights = {5, 3, 4, 7, 10, 11};
        // 지역
        String[] locations = {"한국", "미국", "일본", "캐나다", "독일", "프랑스"};
        // 생상
        String[] colors = {"빨","노","주","보","파","하","검","흰","얼룩","삼색","초"};

        Animal[] animals = new Animal[5];

        for (int i = 0; i < animals.length; i++) {
            // 종 선별
            int kindsRandom = (int) (Math.random() * kinds.length);
            String kind = kinds[kindsRandom];
            // 이름 선별
            int namesRandom = (int) (Math.random() * names.length);
            String name = names[namesRandom];
            // 종에 따른 구분
            if (kindsRandom == 0){
                // 고양이
                int locationsRandom = (int) (Math.random() * locations.length);
                String location = locations[locationsRandom];

                int colorsRandom = (int) (Math.random() * colors.length);
                String color = colors[colorsRandom];
                animals[i] = new Cat(name, kind, location, color);
            }else {
                // 강아지
                int weightsRandom = (int) (Math.random() * weights.length);
                int weight = weights[weightsRandom];
                animals[i] = new Dog(name, kind, weight);
            }
        }

        for (Animal animal : animals) {
            animal.speak();
            System.out.println();
        }
    }
}

