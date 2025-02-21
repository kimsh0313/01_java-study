package practice1.run;

import practice1.dto.Animal;
import practice1.dto.Cat;
import practice1.dto.Dog;

public class Application {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat("이서연", "사람", "수원", "살구");
        animals[1] = new Dog("꼬막", "쉽독", 30);
        animals[2] = new Dog("요미", "푸들", 15);
        animals[3] = new Dog("구름", "말티푸", 12);
        animals[4] = new Cat("또뭐가있지", "음", "뭐더라", "뭐였ㅈ");

        for (Animal animal : animals) {
            animal.speak();
        }
    }

}
