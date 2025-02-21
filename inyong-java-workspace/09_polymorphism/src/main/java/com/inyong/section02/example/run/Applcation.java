package com.inyong.section02.example.run;

import com.inyong.section02.example.dto.Assassin;
import com.inyong.section02.example.dto.Warrior;

import java.util.Scanner;

public class Applcation {
    /*
        ## 캐릭터 요구사항 ##
        * 전사 캐릭터
        1. 전사 캐릭터는 이름, 체력, 레벨, 경험치, 무기, 아이템들을 속성값으로 가질 수 있다.
        2. 전사 캐릭터는 공격을 할 때 무기를 휘두르며 공격하고 경험치가 10 증가된다.
        3. 전사 캐릭터는 방어를 할 때 방패를 이용하여 방어하고 체력이 2 감소된다.

        * 마법사 캐릭터
        1. 마법사 캐릭터는 이름, 체력, 레벨, 경험치, 마력을 속성값으로 가질 수 있다.
        2. 마법사 캐릭터는 공격을 할 때 마법을 쓰면서 공격하고 경험치가 10 증가되고 마력이 10 감소된다.
        3. 만일 마력이 0보다 작아질 경우 0으로 초기화가 되어야된다.
        4. 마법사 캐릭터는 방어를 할 때 방어막을 쳐서 방어하고 체력이 5 감소하고 마력이 5 증가한다.

        * 궁수 캐릭터
        1. 궁수 캐릭터는 이름, 체력, 레벨, 경험치, 화살을 쏠 수 있는 거리, 잔여 화살량을 속성값으로 가질 수 있다.
        2. 궁수 캐릭터는 공격을 할 때 잔여화살이 있을 경우 화살을 쏘아 공격하고 잔여화살량은 1 감소되고 경험치는 15 증가된다.
        3. 궁수 캐릭터는 방어를 할 때 따로 방어할 장비가 없어 막을수 없으며 체력이 20 감소한다.

        * 암살자 캐릭터
        1. 암살자 캐릭터는 이름, 체력, 레벨, 경험치를 속성값으로 가질 수 있다.
        2. 암살자 캐릭터는 공격을 할 때 맨손으로 공격하고 경험치는 5 증가된다.
        3. 암살자 캐릭터는 방어를 할 때 따로 방어장비는 없고 은둔해서 피한다.

        * 모든 캐릭터 공통
        1. 체력이 0 이하가 될 경우 레벨이 1 감소되며 체력은 다시 100으로 초기화가 된다.
        2. 경험치가 100 이상이 될 경우 레벨이 1 증가되며 경험치는 기존 경험치에 -100으로 변경된다.

        ## 게임 요구사항 ##
        1. 게임 시작시 최초에 어떤 캐릭터를 사용할 건지 선택 할 수 있다.
        2. 선택된 캐릭터에 맞는 초기 정보를 입력받을 수 있다.
        3. 만들어진 캐릭터를 가지고 본격적인 게임이 진행된다.
        4. 진행되는 게임에서는 반복적으로 현재 캐릭터의 정보를 조회할 수 있고 현재 캐릭터를 가지고 공격 및 방어할 수 있다.
        5. 사용자가 게임을 종료하겠다는 의사를 밝힐 수 있다.

     */
    private static final int hp = 100;
    private static final int exp = 0;
    private static final int level = 1;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Assassin assassin = new Assassin("이가영", hp, exp, level);
        assassin.level100Up(assassin.getLevel());

        while (true) {
            System.out.println("게임진행");
            System.out.println("1. 정보보기");
            System.out.println("2. 공격하기");
            System.out.println("3. 방어하기");
            System.out.println("0. 게임종료");
            System.out.println(">> 메뉴선택");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println(assassin.toString());
                    break;
                case 2:
                    assassin.attack();
                    break;
                case 3:
                    assassin.defense();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
            }


        }


    }
}
