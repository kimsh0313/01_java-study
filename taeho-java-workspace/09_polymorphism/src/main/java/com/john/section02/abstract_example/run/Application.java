package com.john.section02.abstract_example.run;

import com.john.section02.abstract_example.dto.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======Select Character==========");
        System.out.println("1. 전사");
        System.out.println("2. 마법사");
        System.out.println("3. 궁수");
        System.out.println("4. 암살자");
        System.out.print("선택 >> ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("체력: ");
        int hp = sc.nextInt();
        System.out.print("레벨: ");
        int level = sc.nextInt();
        System.out.print("경험치: ");
        int exp = sc.nextInt();
        sc.nextLine();

        GameCharacter gameCharacter = null;

        if (choice == 1) {
            System.out.print("장착할 무기를 입력하세요: ");
            String weapon = sc.nextLine();
            System.out.print("초기 아이템 1: ");
            String items = sc.nextLine();
            System.out.print("초기 아이템 2: ");
            String items2 = sc.nextLine();

            gameCharacter = new Warrior(choice, name, hp, level, exp, weapon, new String[]{items, items2});
        } else if (choice == 2) {
            System.out.print("캐릭터의 초기 마력: ");
            int mana = sc.nextInt();
            gameCharacter = new Mage(choice, name, hp, level, exp, mana);
        } else if (choice == 3) {
            System.out.print("궁수의 사정거리: ");
            int distance = sc.nextInt();
            System.out.print("화살 개수: ");
            int bolt = sc.nextInt();
            gameCharacter = new Archer(choice, name, hp, level, exp, distance, bolt);
        } else if (choice == 4) {
            gameCharacter = new Assassin(choice, name, hp, level, exp);
        } else {
            System.out.println("코나미 커맨드 입력 확인");
            return;
        }

        while (true) {
            System.out.println("\n=== 게임 진행 ===");
            System.out.println("1. 캐릭터 정보");
            System.out.println("2. 공격");
            System.out.println("3. 방어");
            System.out.println("0. 종료");
            System.out.print("선택 >> ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println(gameCharacter);
                    break;
                case 2:
                    gameCharacter.attack();
                    break;
                case 3:
                    gameCharacter.defense();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못된 입력값");
            }
        }
    }
}
