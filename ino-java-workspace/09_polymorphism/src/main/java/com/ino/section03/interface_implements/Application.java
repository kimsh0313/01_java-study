package com.ino.section03.interface_implements;

public class Application {
    public static void main(String[] args) {
        Behavior[] arr = new Behavior[2];
        arr[0] = new Student("ino", 15, "SSG academy", 2);
        arr[1] = new Worker("ino2", 36, "SSG", "chajang");

        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
            Behavior.born();
        }
    }
}
