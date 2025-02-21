package com.younggalee.practice1.run;

import com.younggalee.practice1.dto.Animal;
import com.younggalee.practice1.dto.Cat;
import com.younggalee.practice1.dto.Dog;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Animal[] arr = new Animal[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5 ; i++){

            if ((int)(Math.random() * 2 + 1) == 1) {
                System.out.println("강아지 객체를 생성합니다.");
                System.out.print("이름 : ");
                String name = sc.nextLine();
                System.out.print("종류 : ");
                String kinds = sc.nextLine();
                System.out.print("몸무게 : ");
                int weight = sc.nextInt();
                arr[i] = new Dog(name,kinds,weight);

            } else {
                System.out.println("고양이 객체를 생성합니다.");
                System.out.print("이름 : ");
                String name = sc.nextLine();
                System.out.print("\n종류 : ");
                String kinds = sc.nextLine();
                System.out.print("\n서식지 : ");
                String location = sc.nextLine();
                System.out.print("\n색상 : ");
                String color = sc.nextLine();
                arr[i] = new Cat(name, kinds, location, color);
            }
            arr[i].speak();
        }

    }
}
