package com.jjanggu.section02.example.run;

import com.jjanggu.section02.example.dto.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== 캐릭터 선택 ===");
        System.out.println("1. 전사");
        System.out.println("2. 마법사");
        System.out.println("3. 궁수");
        System.out.println("4. 암살자");
        System.out.println(">> 번호: ");
        int chNum = sc.nextInt();
        sc.nextLine();

        System.out.println("이름 : ");
        String gcName = sc.nextLine();
        System.out.println("체력 : ");
        int gcHp = sc.nextInt();
        System.out.println("레벨 : ");
        int gcLv = sc.nextInt();
        System.out.println("경험치 : ");
        int gcExp = sc.nextInt();
        sc.nextLine();

        GameCharacter gc = null; // 후에 생성될 캐릭터객체를 기록할 변수

        if(chNum ==1){
            System.out.println("무기명 : ");
            String weapon = sc.nextLine();
            System.out.println("아이템1 : ");
            String item1 = sc.nextLine();
            System.out.println("아이템2 : ");
            String item2 = sc.nextLine();

            gc = new Warrior(gcName, gcHp, gcLv, gcExp, weapon, new String[]{item1, item2}); // 배열 객체를 다른 곳에 넘겨 줄때는 새로 초기화
        }else if(chNum == 2) {
            System.out.println("마력 : ");
            gc = new Wizard (gcName, gcHp, gcLv , gcExp, sc.nextInt());
        }else if(chNum == 3) {
            System.out.println("사격거리(m) : ");
            int range = sc.nextInt();
            System.out.println("화살 개수 : ");
            int arrow = sc.nextInt();

            gc = new Archer(gcName, gcHp, gcLv , gcExp, range, arrow);
        }else if(chNum == 4){
            gc = new Assassin(gcName, gcHp, gcLv , gcExp);
        }else{
            System.out.println("캐릭터 번호를 잘못 선택하셨습니다. 프로그램을 종료합니다.");
            return;
        }

        while(true){

            System.out.println("\n== 게임진행 ==");
            System.out.println("1. 정보보기");
            System.out.println("2. 공격하기");
            System.out.println("3. 방어하기");
            System.out.println("0. 게임종료");
            System.out.println(">> 메뉴선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch(menu) {
                case 1: System.out.println(gc); break;
                case 2: gc.attack(); break;
                case 3: gc.defence(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴를 잘못 입력하셨습니다. 다시입력해주세요");
            }




        }
    }
}
