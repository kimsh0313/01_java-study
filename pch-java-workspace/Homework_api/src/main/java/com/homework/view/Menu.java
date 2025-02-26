package com.homework.view;


import com.homework.controller.Calculator;
import com.homework.dto.FoodShop;

import java.util.Calendar;
import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in); // 사용자에게 입력받기 위한 Scanner 객체 (전역으로 쓸 수 있도록 생성)
	Calculator calc = new Calculator();  // 각 기능용 메소드를 호출하기 위한 객체
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n==== 이것저것 프로그램 ====");
			System.out.println("1. 문자열 관련 게임");
			System.out.println("2. 수학 관련 게임");
			System.out.println("3. 날짜 관련 게임");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: stringGameMenu(); break;
			case 2: mathGameMenu(); break;
			case 3: dateGameMenu(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			}
			
		}
	}
	
	public void stringGameMenu() {
		
		while(true) {
			
			System.out.println("\n==== 문자열 관련 게임 ====");
			System.out.println("1. 문자열 안에 문자 몇 개있는지 알아내기");
			System.out.println("2. 공백 기준으로 분리된 문자열이 몇개인지 알아내기");
			System.out.println("3. 각 단어마다 앞 글자 대문자로 바꾸기");
			System.out.println("4. csv데이터를 자바 객체로 변경해서 출력하기");
			System.out.println("0. 뒤로 가기");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 1) {
				
				System.out.println("\n* 대소문자를 가리지 않고 찾아드립니다 *\n");
				
				// 문자열(String타입), 탐색할 문자(char) 형으로 입력받은 후
				System.out.print("문자열을 입력하세요 : ");
				String input = sc.nextLine();
				System.out.print("탐색할 문자를 입력하세요 : ");
				char c = sc.nextLine().charAt(0);
				// Calculator 클래스의 findCharCount 메소드 호출하면서 전달 후 결과받아 출력하기

				System.out.println(calc.findCharCount(input, c));
				
			}else if(menu == 2) {
				
				System.out.println("\n* 반드시 공백 포함해서 문자열을 입력해주세요 *\n");
				
				// 문자열(String타입)으로 입력받은 후
				String s = sc.nextLine();
				// Calculator 클래스의 selectTokenCount 메소드 호출하면서 전달 후 결과받아 출력하기
				int ans = calc.selectTokenCount(s);
				// 이때 공백 포함이 안되어있을 경우 "공백 포함해서 입력하라니깐요." 출력하기
				if(ans == 0) {
					System.out.println("공백 포함해서 입력하라니깐요.");
				} else {
					System.out.println(ans);
				}
				
				
			}else if(menu == 3) {
				
				System.out.println("\n* 여러 영단어(소문자)를 공백과 함께 입력해주세요 *\n");
				
				// 문자열(String타입)으로 입력받은 후
				String input = sc.nextLine();
				// Calculator 클래스의 toSpaceUpper 메소드 호출하면서 전달 후 결과받아 출력하기
				System.out.println(calc.toSpaceUpper(input));
				
			}else if(menu == 4) {
				
				System.out.println("\n* 10개의 맛집 정보를 출력해드립니다 *\n");
				
				// Calculator 클래스의 csvFormat 메소드 호출하여 결과받고
				FoodShop fd[] = calc.csvFormat();
				// 해당 배열안의 모든 FoodShop 객체들을 다 출력하기
				for(int i = 0; i<fd.length; i++){
					System.out.println(fd[i].toString());
				}
				
				
			}else if(menu == 0) {
				System.out.println("\n메인메뉴로 돌아갑니다.");
				return;
			}else {
				System.out.println("\n다시 메뉴를 선택해주세요.");
			}
			
			
		}
		
	}
	
	public void mathGameMenu() {
		
		while(true) {
			System.out.println("\n==== 수학 관련 게임 ====");
			System.out.println("1. 두 수의 합 구하기");
			System.out.println("2. 두 수의 차 구하기");
			System.out.println("0. 뒤로 가기");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 1) {
				
				System.out.println("\n* 정수, 실수 아무거나 입력해도 됩니다 * \n");
				
				// 두 수(String타입)를 입력받은 후
				System.out.print("첫번째 숫자 입력 : ");
				String n1 = sc.nextLine();
				System.out.print("두번째 숫자 입력 : ");
				String n2 = sc.nextLine();
				// Calculator 클래스의 sumString 메소드 호출시 전달하여 결과받아 출력하기 
				System.out.println(calc.sumString(n1, n2));

			}else if(menu == 2) {
				System.out.println("\n* 정수형으로만 입력해주세요 *\n");
				
				// 두 수(String타입)을 입력받은 후
				System.out.print("첫번째 숫자 입력 : ");
				String n1 = sc.nextLine();
				System.out.print("두번째 숫자 입력 : ");
				String n2 = sc.nextLine();
				// Calculator 클래스의 minusString 메소드 호출시 전달하여 결과받아 출력하기
				// 단, 두 수 중에 실수형태로 입력됐을 경우 "정수만 입력하라니깐요." 출력
				int ans = calc.minusString(n1, n2);
				if(ans == -1) System.out.println("정수만 입력하라니깐요.");
				else System.out.println(ans);
				
				
			}else if(menu == 0) {
				System.out.println("\n메인메뉴로 돌아갑니다.");
				return;
			}else {
				System.out.println("\n다시 메뉴를 선택해주세요.");
			}
			
		}
		
	}
	
	public void dateGameMenu() {
		
		while(true) {
			System.out.println("\n==== 날짜 관련 게임 ====");
			System.out.println("1. 현재 날짜 및 시간 알아보기");
			System.out.println("2. 년도, 월, 일 입력받아 특정형식으로 출력하기");
			System.out.println("3. 내가 입력한 년도가 윤년인지 알아보기");
			System.out.println("4. 특정 년도 사이가 총 몇일인지 알아보기");
			System.out.println("0. 뒤로 가기");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 1) {
				
				System.out.println("\n* 현재 시스템 날짜 및 시간 *\n");
				
				// Calculator 클래스의 printNowDateTime 메소드 호출하기
				calc.printNowDateTime();
				
			}else if(menu == 2) {
				
				System.out.println("\n* 년도, 월, 일을 정수형으로 입력해주세요 *\n");
				System.out.print("년도 : ");
				String year = sc.nextLine();
				System.out.print("월 : ");
				String month = sc.nextLine();
				System.out.print("일 : ");
				String date = sc.nextLine();
				// 년도, 월, 일(모두다 String타입)을 입력받은 후
				// Calculator 클래스의 makeCalendar 메소드 호출시 전달하여 결과받기
				Calendar cal = calc.makeCalendar(year, month, date);

				// 위의 결과로 돌려받은 Calendar객체를 Calculator 클래스의 printFormat메소드 호출시 전달하여 실행하기 
				calc.printFormat(cal);
				
			}else if(menu == 3) {
				
				System.out.println("\n* 궁금한 년도를 입력해주세요 *\n");
				
				// 년도(String타입)을 입력받은 후
				String year = sc.nextLine();

				// Calculator클래스의 isLeapYear 메소드 호출시 전달하여 그에 맞는 결과 출력하기
				boolean isthis = calc.isLeapYear(Integer.parseInt(year));

				// 윤년일 경우 "해당 년도는 윤년입니다." 그게아닐 경우 "해당 년도는 평년입니다." 출력하기
				if(isthis){
					System.out.println("해당 년도는 윤년입니다");
				} else {
					System.out.println("해당 년도는 평년입니다");
				}
				
			}else if(menu == 4) {
				
				System.out.println("\n* 특정년도 ~ 특정년도 까지의 총 일수를 구해드립니다 *\n");
				
				// 시작년도, 끝년도(모두 다 String타입)을 입력받은 후
				System.out.print("시작년도를 입력하세요 : ");
				String styear = sc.nextLine();
				System.out.print("끝년도를 입력하세요 : ");
				String enyear = sc.nextLine();

				// 단, 시작년도를 더 큰 숫자로 썻을 경우 "시작년도를 더 작은 숫자로 써야지.." 출력
				if(Integer.parseInt(styear)>Integer.parseInt(enyear)) {
					System.out.println("시작년도를 더 작은 숫자로 써야지..");
					continue;
				}
				// Calculator 클래스의 leapDate 메소드 호출시 전달하여 결과받아 출력하기
				long ans = calc.leapDate(Integer.parseInt(styear), Integer.parseInt(enyear));

				System.out.println(ans);
				
			}else if(menu == 0) {
				
				System.out.println("\n메인메뉴로 돌아갑니다.");
				return;
				
			}else {
				System.out.println("\n다시 메뉴를 선택해주세요.");
			}
		}
		
	}

}
