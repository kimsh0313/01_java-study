package com.pch.practice1.run;

import com.pch.practice1.dto.Animal;
import com.pch.practice1.dto.Cat;
import com.pch.practice1.dto.Dog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application {
    public static void main(String[] args) throws IOException {
        Animal[] animals = new Animal[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < animals.length; i++) {
            if(((int) (Math.random() * 10)) % 2 == 0) {
                System.out.println("개 정보 입력. 이름 종 무게");
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String kind = st.nextToken();
                int weight = Integer.parseInt(st.nextToken());
                animals[i] = new Dog(name, kind, weight);
            } else {
                System.out.println("고양이 정보 입력. 이름 종 지역 색");
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String kind = st.nextToken();
                String location = st.nextToken();
                String color = st.nextToken();
                animals[i] = new Cat(name, kind, location, color);
            }
        }

        for (int i = 0; i < animals.length; i++) {
            animals[i].speak();
        }
    }
}
