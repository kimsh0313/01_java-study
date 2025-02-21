package com.ino.section02.example.run;

import com.ino.section02.example.dto.*;

import java.util.Scanner;

public class GameManager {
    GameCharacter gc;
    Scanner sc = new Scanner(System.in);

    public void init() {
        System.out.println("select Character");
        System.out.println("1. Warrior\n2. Magician\n3. Archor\n4. Assassin");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("체력 : ");
        int hp = sc.nextInt();
        System.out.println("레벨 : ");
        int lv = sc.nextInt();
        System.out.println("경험치 : ");
        int exp = sc.nextInt();
        sc.nextLine();
        switch (num) {
            case 1:
                System.out.print("무기명 : ");
                String wp = sc.nextLine();
                System.out.print("item1: ");
                String item1 = sc.nextLine();
                System.out.print("item2: ");
                String item2 = sc.nextLine();
                gc = new Warrior(name, hp, lv, exp, wp); break;
            case 2: gc = new Magician(); break;
            case 3: gc = new Archor(); break;
            case 4: gc = new Assassin(); break;
        }
        start(gc);
    }

    public void start(GameCharacter gc) {
        boolean flag = true;
        while(flag) {
            System.out.println("select option\n1. get status\n2. Attack\n3. Defense\n 0. Exit game");
            int option = sc.nextInt();
            switch (option) {
                case 0 : flag = false; break;
                case 1 :
                    System.out.println(gc.toString()); break;
                case 2 : gc.attack(); break;
                case 3 : gc.defense(); break;
            }
        }
    }
}
