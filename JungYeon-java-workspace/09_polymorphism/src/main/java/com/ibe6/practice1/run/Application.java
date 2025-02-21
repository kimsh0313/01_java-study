package com.ibe6.practice1.run;

import com.ibe6.practice1.dto.Animal;
import com.ibe6.practice1.dto.Cat;
import com.ibe6.practice1.dto.Dog;


public class Application {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("똘이", "치와와", 3);
        animals[1] = new Cat("나비", "코숏", "학원 앞", "노란색");
        animals[2] = new Dog("다롱", "말티즈", 4);
        animals[3] = new Dog("하늘", "말티즈", 4);
        animals[4] = new Cat("먼지", "알수없음", "친구 집", "회색");
        // Animal 타입의 객체배열 크기 5로 생성
        // 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
        // (이때, 매개변수 생성자를 이용하여 생성)


        for(int i=0; i<animals.length; i++){
            Animal am = animals[i];
            am.speak(); // 동적바인딩 알기위해!
        }
        // 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
        // 객체의 speak() 메소드 호출



    }
}
