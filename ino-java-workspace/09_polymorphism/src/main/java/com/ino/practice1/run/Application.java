package com.ino.practice1.run;

import com.ino.practice1.dto.Animal;
import com.ino.practice1.dto.Cat;
import com.ino.practice1.dto.Dog;

public class Application {
    public static void main(String[] args) {
        Animal[] arr = new Animal[5];
        arr[0] = new Dog("ino", "zzz", 30);
        arr[1] = new Cat("k11", "zz", "paju", "green");
        arr[2] = new Cat("k-9", "dd", "seoul", "blue");
        arr[3] = new Cat("linux", "xx", "goyang", "red");
        arr[4] = new Dog("kad", "zzz", 30);

        for (int i = 0; i < arr.length; i++) {
            arr[i].speak();
        }
    }
}
