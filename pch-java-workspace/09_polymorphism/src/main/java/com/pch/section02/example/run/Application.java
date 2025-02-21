package com.pch.section02.example.run;

import com.pch.section02.example.dto.CommonCharacter;
import com.pch.section02.example.dto.Warrior;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("운빨 개씹좆버러지망겜에 오신 모험가님을 환영합니다.");
        System.out.print("플레이하실 캐릭터의 이름을 입력하십시오 : ");
        String name = sc.nextLine();
        System.out.println("플레이하실 캐릭터를 선택하십시오");
        System.out.println("1. 전사  2. 마법사  3. 궁수  4. 암살자");

        int choice = sc.nextInt();
        CommonCharacter character = null;
        while(true){
            if(choice == 1){
                character = new Warrior(name, 150, "참귀도", new String[]{""});
                break;
            } else if(choice == 2){
                break;
            } else if(choice == 3){
                break;
            } else if(choice == 4){
                break;
            } else {
                System.out.println("넌 숫자도 제대로 못쓰니? 다시 입력하세요~");
            }
        }

    }
}
