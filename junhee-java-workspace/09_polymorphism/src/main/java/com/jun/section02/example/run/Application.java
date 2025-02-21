package com.jun.section02.example.run;

import com.jun.section02.example.dto.*;
import com.jun.section02.example.dto.Character;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /*
            ## 게임 요구사항 ##
    1. 게임 시작시 최초에 어떤 캐릭터를 사용할 건지 선택 할 수 있다.
    2. 선택된 캐릭터에 맞는 초기 정보를 입력받을 수 있다.
    3. 만들어진 캐릭터를 가지고 본격적인 게임이 진행된다.
    4. 진행되는 게임에서는 반복적으로 현재 캐릭터의 정보를 조회할 수 있고 현재 캐릭터를 가지고 공격 및 방어할 수 있다.
    5. 사용자가 게임을 종료하겠다는 의사를 밝힐 수 있다.
         */


        Scanner sc = new Scanner(System.in);

        System.out.println("=== 캐릭터 선택==");
        System.out.println("1. 전사");
        System.out.println("2. 마법사");
        System.out.println("3. 궁수");
        System.out.println("4. 암살자");
        System.out.print(">> 번호: ");
        int chNum = sc.nextInt();
        sc.nextLine();

        System.out.print("이름: ");
        String gcName = sc.nextLine();
        System.out.print("체력: ");
        int gcHp = sc.nextInt();
        System.out.print("레벨: ");
        int gcLevel = sc.nextInt();
        System.out.print("경험치: ");
        int gcExp = sc.nextInt();
        sc.nextLine();

        Character gc = null; // 후에 생성될 캐릭터 객체를 기록할 변수

        if(chNum == 1){
            System.out.print("무기명: ");
            String weapon = sc.nextLine();
            System.out.print("아이템1: ");
            String item1 = sc.nextLine();
            System.out.println("아이템2: ");
            String item2 = sc.nextLine();

            gc = new Warrior(gcName, gcHp, gcLevel, gcExp, weapon, new String[]{item1, item2});

        }else if (chNum == 2){
            System.out.println("마력: ");
            gc= new Mage(gcName, gcHp, gcLevel, gcExp, sc.nextInt());
        }else if (chNum == 3){
            System.out.println("사격거리(m): ");
            int range = sc.nextInt();
            System.out.println("활 개수: ");
            int Arrowcount = sc.nextInt();

            gc = new Archer(gcName, gcHp, gcLevel, gcExp, range, Arrowcount);
        } else if (chNum == 4) {
            gc = new Assassin(gcName, gcHp, gcLevel, gcExp);
        }else {
            System.out.println("캐릭터 번호를 잘못 선택하셨습니다. 프로그램을 종료합니다.");
            return;


        }
        while (true){
            System.out.println("\n== 게임진행 ==");
            System.out.println("1. 정보보기");
            System.out.println("2. 공격하기");
            System.out.println("3. 방어하기");
            System.out.println("0. 게임종료");
            System.out.print(">> 메뉴선택: ");
            int menu = sc. nextInt();

            switch (menu){
                case 1: System.out.println(gc); break;
                case 2: gc.attack(); break;
                case 3: gc.defence(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("메뉴를 잘못 입력하셨습니다. 다시입력해주세요.");


            }

        }




    }
}
