package section02.example.run;

import section02.example.dto.*;
import section02.example.dto.Character;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====캐릭터선택====");
        System.out.println("1. 전사");
        System.out.println("2. 마법사");
        System.out.println("3. 궁사");
        System.out.println("4. 암살자");
        int chNum = sc.nextInt();
        sc.nextLine();

        System.out.println("이름 : ");
        String name = sc.next();
        System.out.println("체력 : ");
        int hp = sc.nextInt();
        System.out.println("레벨");
        int level = sc.nextInt();
        System.out.println("경험치 : ");
        int exp = sc.nextInt();

        Character character = null;

        if (chNum == 1) {
            System.out.println("무기명 : ");
            String weapon = sc.nextLine();
            System.out.println("아아템1 : ");
            String item1 = sc.nextLine();
            System.out.println("아아템2 : ");
            String item2 = sc.nextLine();
            character = new Warrior(name, hp, level, exp, weapon, new String[]{item1, item2});

        }else if (chNum == 2) {
            System.out.println("마력");
            character = new Wizard(name, hp, level, exp, sc.nextInt());

        }else if (chNum == 3) {
            System.out.println("사격거리 m  : ");
            int distance = sc.nextInt();
            System.out.println("활 개수 :  " );
            int count = sc.nextInt();
            character = new Archer(name, hp, level, exp, distance, count);

        }else if (chNum == 4) {
            character = new Assassin(name, hp, level, exp);
        }

        if (character == null) {
            System.out.println("게임 오류");
            return;
        }

        while (true){
            System.out.println("게임 진행");
            System.out.println("1. 정보보기");
            System.out.println("2. 공격하기");
            System.out.println("3. 방어하기");
            System.out.println("0. 종료하기");
            int menuNum = sc.nextInt();

            switch (menuNum) {
                case 0 : return;
                case 1 :
                    System.out.println(character);
                    break;
                case 2: character.attack(); break;
                case 3: character.defense(); break;
                default :
                    System.out.println("존재하지 않는 기능입니다."); break;
            }
        }


    }
}
