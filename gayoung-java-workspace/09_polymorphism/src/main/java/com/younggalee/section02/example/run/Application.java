package com.younggalee.section02.example.run;

import com.younggalee.section02.example.dto.*;
import com.younggalee.section02.example.dto.Character;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====캐릭터 선택=====");
        System.out.println("1: 전사\n 2 : 마법사 \n 3: 궁수\n 4.암살자");
        int chNum = sc.nextInt();
        System.out.println();

        System.out.print("이름: ");
        String gname = sc.next(); // 🎯 여기서 이름 먼저 입력

        System.out.println("체력 / 레벨 / 경험치 : ");
        String[] ginfo = sc.nextLine().split(" "); // 🎯 이후에 체력/레벨/경험치 입력
        System.out.print(ginfo[0]);



//        System.out.print("이름: ");
//        String gname = sc.nextLine();
//        System.out.println();
//
//
//        System.out.println("체력 / 레벨 / 경험치 : ");
//        String[] ginfo = sc.nextLine().split(" ");

        Character gc = null; // 후에 생성될 캐릭터 객체를 기록할 변수

        if (chNum == 1) {
            System.out.print("무기명 : ");
            String weapon = sc.nextLine();

            System.out.print("아이템1 : ");
            String item1 = sc.nextLine();
            System.out.print("아이템2 : ");
            String item2 = sc.nextLine();

            gc = new Warrior(gname, Integer.parseInt(ginfo[0]), Integer.parseInt(ginfo[1]), Integer.parseInt(ginfo[2]), weapon, new String[]{item1, item2});
        } else if (chNum == 2) {
            System.out.print("마력 : ");
            gc = new Wizard(gname, Integer.parseInt(ginfo[0]), Integer.parseInt(ginfo[1]), Integer.parseInt(ginfo[2]), sc.nextInt());
        } else if (chNum == 3) {
            System.out.print("사격거리 : ");
            int distance = sc.nextInt();
            System.out.print("활 개수 : ");
            int arrow = sc.nextInt();
            gc = new Archer(gname, Integer.parseInt(ginfo[0]), Integer.parseInt(ginfo[1]), Integer.parseInt(ginfo[2]), distance, arrow);
        } else if (chNum == 4) {
            gc = new assassin(gname, Integer.parseInt(ginfo[0]), Integer.parseInt(ginfo[1]), Integer.parseInt(ginfo[2]));
        } else{
            System.out.println("캐릭터 번호를 잘못 입력하셨습니다. 프로그램을 종료합니다.");
            return; //*****************************
        }

        while (true){
            System.out.println("====게임진행=====");
            System.out.print("1: 정보보기\n 2 : 공격하기 \n 3: 방어하기 \n 0.게임종료\n");
            int menu = sc.nextInt();

            switch(menu){
                case 1:
                    System.out.println(gc);
                    break;
                case 2:
                    gc.attack();
                    break;
                case 3:
                    gc.defense();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default :
                    System.out.println("메뉴를 잘못 입력하셨습니다. 다시입력해주세요");
            }
        }


    }
}
