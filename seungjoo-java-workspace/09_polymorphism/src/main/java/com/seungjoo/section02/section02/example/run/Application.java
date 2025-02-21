package com.seungjoo.section02.section02.example.run;

import com.seungjoo.section02.section02.example.dto.*;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("===캐릭터 선택");
        System.out.println("1.전사");
        System.out.println("2.마법사");
        System.out.println("3.궁수");
        System.out.println("4.암살자");
        System.out.println(">> 번호");

        int chNum = sc.nextInt();

        System.out.println("이름: ");
        String gcName = sc.nextLine();
        System.out.println("체력");
        int gcHp = sc.nextInt();
        sc.nextLine();

        System.out.println("레벨");
        int gcLevel = sc.nextInt();
        sc.nextLine();
        System.out.println("경험치");
        int gcExp = sc.nextInt();

        GameCharacter gc = null;


        if (chNum == 1) {
            System.out.println("무기명:");
            String weapon = sc.nextLine();
            System.out.println("아이템");
            String item1 = sc.nextLine();
            System.out.println("두번쨰 아이템");
            String item2 = sc.nextLine();
            gc = new Warrior(gcName, gcHp, gcLevel, gcExp, weapon, new String[]{
                item1,item2
            });
        } else if (chNum == 2) {
            System.out.println("마력:");
            gc = new Wizard(gcName, gcHp, gcLevel, gcExp, sc.nextInt());
        }else if (chNum == 3) {
            System.out.println("사격거리");
            int distance = sc.nextInt();
            System.out.println("활 개수");
            int count = sc.nextInt();

            gc = new Archer(gcName, gcHp, gcLevel, gcExp, distance, count);
        }else if (chNum == 4) {
            gc = new Assassin(gcName, gcHp, gcLevel, gcExp);

        }else{
            System.out.println("캐릭터 번호를 잘못 선택하셨습니다. 프로그램을 종료합니다.");
            return;
        }

        while(true){
            System.out.println("\n === 게임 진행===");
            System.out.println("1.정보 보기");
            System.out.println("2.공격하기");
            System.out.println("3.방어하기");
            System.out.println("0 게임 종료");
            int menu = sc.nextInt();

            switch(menu){
                case 1:
                    System.out.println(gc); break;
                case 2: gc.attack(); break;
                case 3: gc.defence(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                    default:
                        System.out.println("메뉴를 잘못 입력하셨습니다. 다시 입력해주세요.");

            }
        }








    }
}
