package com.homework.view;


import com.homework.controller.Calculator;
import com.homework.dto.FoodShop;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in); // 사용자에게 입력받기 위한 Scanner 객체 (전역으로 쓸 수 있도록 생성)
    Calculator calc = new Calculator();  // 각 기능용 메소드를 호출하기 위한 객체

    public void mainMenu() {

        while (true) {

            System.out.println("\n==== 이것저것 프로그램 ====");
            System.out.println("1. 문자열 관련 게임");
            System.out.println("2. 수학 관련 게임");
            System.out.println("3. 날짜 관련 게임");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    stringGameMenu();
                    break;
                case 2:
                    mathGameMenu();
                    break;
                case 3:
                    dateGameMenu();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }

        }
    }

    public void stringGameMenu() {

        while (true) {

            System.out.println("\n==== 문자열 관련 게임 ====");
            System.out.println("1. 문자열 안에 문자 몇 개있는지 알아내기");
            System.out.println("2. 공백 기준으로 분리된 문자열이 몇개인지 알아내기");
            System.out.println("3. 각 단어마다 앞 글자 대문자로 바꾸기");
            System.out.println("4. csv데이터를 자바 객체로 변경해서 출력하기");
            System.out.println("0. 뒤로 가기");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {

                System.out.println("\n* 대소문자를 가리지 않고 찾아드립니다 *\n");
                System.out.println("문자열 : ");
                String str = sc.nextLine();
                System.out.println("문자 : ");
                char chr = sc.next().charAt(0);

                System.out.println(calc.findCharCount(str, chr));

            } else if (menu == 2) {

                System.out.println("\n* 반드시 공백 포함해서 문자열을 입력해주세요 *\n");
                System.out.println("문자열 : ");
                String str = sc.nextLine();

                int wordCount = calc.selectTokenCount(str);
                if (wordCount == 1 || wordCount == 0) {
                    System.out.println("공백을 포함한 단어를 입력하세요.");
                    return;
                }
                System.out.println(wordCount);

            } else if (menu == 3) {

                System.out.println("\n* 여러 영단어(소문자)를 공백과 함께 입력해주세요 *\n");
                System.out.println("문자열 : ");
                String str = sc.nextLine();

                System.out.println(calc.toSpaceUpper(str));

            } else if (menu == 4) {

                System.out.println("\n* 10개의 맛집 정보를 출력해드립니다 *\n");
                for (FoodShop foodShop : calc.csvFormat()) {
                    System.out.println(foodShop);
                }

            } else if (menu == 0) {
                System.out.println("\n메인메뉴로 돌아갑니다.");
                return;
            } else {
                System.out.println("\n다시 메뉴를 선택해주세요.");
            }
        }
    }

    public void mathGameMenu() {

        while (true) {
            System.out.println("\n==== 수학 관련 게임 ====");
            System.out.println("1. 두 수의 합 구하기");
            System.out.println("2. 두 수의 차 구하기");
            System.out.println("0. 뒤로 가기");

            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {

                System.out.println("\n* 정수, 실수 아무거나 입력해도 됩니다 * \n");
                System.out.println("숫자1 : ");
                String num1 = sc.nextLine();
                System.out.println("숫자2 : ");
                String num2 = sc.nextLine();

                System.out.println(calc.sumString(num1, num2));

            } else if (menu == 2) {

                System.out.println("\n* 정수형으로만 입력해주세요 *\n");
                System.out.println("숫자1 : ");
                String num1 = sc.nextLine();
                System.out.println("숫자2 : ");
                String num2 = sc.nextLine();

                int minusResult = calc.minusString(num1, num2);
                if (minusResult == -1) {
                    System.out.println("정수만입력하라니깐");
                    return;
                }
                System.out.println(minusResult);

            } else if (menu == 0) {
                System.out.println("\n메인메뉴로 돌아갑니다.");
                return;
            } else {
                System.out.println("\n다시 메뉴를 선택해주세요.");
            }
        }

    }

    public void dateGameMenu() {

        while (true) {
            System.out.println("\n==== 날짜 관련 게임 ====");
            System.out.println("1. 현재 날짜 및 시간 알아보기");
            System.out.println("2. 년도, 월, 일 입력받아 특정형식으로 출력하기");
            System.out.println("3. 내가 입력한 년도가 윤년인지 알아보기");
            System.out.println("4. 특정 년도 사이가 총 몇일인지 알아보기");
            System.out.println("0. 뒤로 가기");

            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {

                System.out.println("\n* 현재 시스템 날짜 및 시간 *\n");
                calc.printNowDateTime();

            } else if (menu == 2) {

                System.out.println("\n* 년도, 월, 일을 정수형으로 입력해주세요 *\n");
                System.out.println("년도 : ");
                String year = sc.nextLine();
                System.out.println("월 : ");
                String month = sc.nextLine();
                System.out.println("일 : ");
                String day = sc.nextLine();

                calc.printFormat(calc.makeCalendar(year, month, day));

            } else if (menu == 3) {

                System.out.println("\n* 궁금한 년도를 입력해주세요 *\n");
                int year = Integer.parseInt(sc.nextLine());
                if (calc.isLeapYear(year)) {
                    System.out.println("해당 년도는 윤년입니다.");
                } else {
                    System.out.println("해당 년도는 평년입니다.");
                }

            } else if (menu == 4) {

                System.out.println("\n* 특정년도 ~ 특정년도 까지의 총 일수를 구해드립니다 *\n");
                System.out.println("시작년도 : ");
                int startYear = Integer.parseInt(sc.nextLine());
                System.out.println("종료년도 : ");
                int endYear = Integer.parseInt(sc.nextLine());

                System.out.println(calc.leapDate(startYear, endYear));

            } else if (menu == 0) {

                System.out.println("\n메인메뉴로 돌아갑니다.");
                return;

            } else {
                System.out.println("\n다시 메뉴를 선택해주세요.");
            }
        }

    }

}