package com.kyungbae.section02.example.run;

import com.kyungbae.section02.example.dto.*;
import com.kyungbae.section02.example.dto.Character;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /*
         // 전사
        Character c1 = new Warrior("김첨지", "강한칼", "포션");

        System.out.println(((Warrior)c1).toString());

        c1.attack();

        System.out.println(((Warrior)c1).toString());

        c1.defence();

        System.out.println(((Warrior)c1).toString());


        c1.attack();
        for (int i = 0; i < 10; i++) {
            c1.attack();
        }

        System.out.println(((Warrior)c1).toString());

        c1.defence();
        for (int i = 0; i < 51; i++) {
            c1.defence();
        }

        System.out.println(((Warrior)c1).toString());

         */

        /*
        // 마법사
        Character c2 = new Wizard("김똘똘", 100);

        System.out.println(((Wizard) c2).toString());

        c2.defence();
        for (int i = 0; i < 11; i++) {
            c2.attack();
        }

        System.out.println(((Wizard) c2).toString());

         */

        /*
        // 궁수
        Character a1 = new Archer("김심심", 100, 10);

        System.out.println(((Archer)a1).toString());

        a1.attack();
        a1.defense();

        System.out.println(((Archer)a1).toString());
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("=== 캐릭터 선택 ===");
        System.out.println("1. 전사");
        System.out.println("2. 마법사");
        System.out.println("3. 궁수");
        System.out.println("4. 도적");
        System.out.print(">> 번호 : ");
        int chNum = sc.nextInt();
        sc.nextLine();

        System.out.print("이름 : ");
        String gcName = sc.nextLine();

        Character gc = null;

        if(chNum == 1){
            System.out.print("무기 : ");
            String weapon = sc.nextLine();
            System.out.print("아이템1: ");
            String item1 = sc.nextLine();
            System.out.print("아이템2: ");
            String item2 = sc.nextLine();

            gc = new Warrior(gcName, weapon, new String[]{item1,item2});

        } else if (chNum == 2) {
            System.out.print("mana : ");
            gc = new Wizard(gcName, sc.nextInt());
            sc.nextLine();
        } else if (chNum == 3) {
            System.out.print("사격거리(m) : ");
            int arrowRange = sc.nextInt();
            sc.nextLine();
            System.out.print("활 개수 : ");
            int arrow = sc.nextInt();
            sc.nextLine();
            gc = new Archer(gcName, arrowRange, arrow);
        } else if (chNum == 4) {
            gc = new Theif(gcName);

        } else {
            System.out.println("캐릭터 번호를 잘못 입력하였습니다. 종료합니다.");
            return;
        }

        System.out.println("\n=== 게임 진행===");
        while (true){
            System.out.println("1. 현재정보보기");
            System.out.println("2. 공격하기");
            System.out.println("3. 방어하기");
            System.out.println("0. 게임종료");
            System.out.print(">> 메뉴선택 : ");
            int menu = sc.nextInt();

            switch (menu){
                case 1 :
                    System.out.println(gc); break;
                case 2 :
                    gc.attack(); break;
                case 3 :
                    gc.defense(); break;
                case 0 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default :
                    System.out.println("메뉴를 잘못 입력하셨습니다. 다시 입력해주세요.");
            }

        }



    } // main end


} // class end
