package com.inyong.section02.encapsulation.problem3.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
        객체 지향 언어 자바, 객체는 무엇인가
        1. heap 메모리 영역에 만들어지는 모든 것들

        객체지향 프로그래밍
        현실세계에서의 모든 사건(event)는 객체간의 상호작용에 의해 발생됨
        이를 프로그래밍에 적용해서 가상세계로 구현하는 방법론
        ex) 인터넷 쇼핑몰 (객체 : 상품, 고객 / 상호작용 : 구매, 환불 등)
         */

        /*
        ## 추상화 ##
        1. 현실세계를 프로그램의 목적에 맞게 단순화하는 기법
        2. 공통된 부분을 추출하고 목적에 맞지 않는 것들을 제거해나가는 과정
        3. 유연성을 확보해서 재사용성이 높아질 수 있도록 작업할 수 있음.

        ## 객체와 객체간 상호작용 ##
        1. 객체간에는 메세지를 통해 서로 상호작용함
        2. 객체(송신자) --메시지--> 객체(수신자)
        3. 수신자의 입장에서 수신된 메시지를 어떻게 처리할 건지 결정하고,
        어떤 명령어들을 순서대로 처리 할 것인지를 기술하는 것을 "메소드"라고 함.

        ex ) 프로그램 개요 : 카레이서가 자동차를 운전할 수 있는 프로그램
        1. 카레이서는 자동차의 시동걸기, 엑셀레이터 밟기, 브레이크 밟기, 시동끄기를 할 수 있다.
        2. 자동차는 시동걸기, 앞으로 가기, 멈추기, 시동끄기를 할 수 있다.
        3. 자동차는 처음에 멈춘 상태로 대기하고 있는다.
        4. 카레이서는 먼저 자동차에 시동을 건다. 이미 걸려있는 경우 다시 시동을 걸 수 없다.
        5. 카레이서가 엑셀레이터를 밟으면 시동이 걸린상태일 경우 자동차는 시속이 10km/h 증가하며 앞으로 나간다.
        6. 자동차가 달리는 중인 경우, 브레이크를 밟으면 자동차의 시속은 0으로 떨어지며 멈춘다.
        7. 브레이크를 밟을때, 자동차가 달리는 중이 아니라면 이미 멈춰있는 상태라고 안내한다.\
        8. 카레이서가 시동을 끄면 더 이상 자동차는 움직이지 않는다.
        9. 자동차가 달리는 중이라면 시동을 끌 수 없다.

        ## 프로그램 설계 ##
        1. 필요한 객체 도출
         - 카레이서
         - 자동차
         - 플레이어(사용자)

        2. (객체간) 상호작용 (행동,기능) 도출
           1) 카레이서에게 수신되는 메시지(사용자 >> 카레이서)
              - 시동을 걸어라
              - 엑셀을 밟아라
              - 브레이크 밟아라
              - 시동을 꺼라
           2) 자동차에게 수신되는 메시지 (카레이서 >> 자동차)
              - 시동을 걸어라
              - 앞으로 가라
              - 멈춰라
              - 시동을 꺼라

        3. 커뮤니케이션 다이어그램 (동적)
            사용자 => 카레이서 => 자동차

        4. 클래스 설계하기

        1) 자동차 클래스
        속성 : 시동, 시속
        메소드 : 시동을 걸어라, 앞으로 가라, 뭠춰라, 시동을 꺼라
        2) 카레이서 클래스
        속성 : 자동차
        메소드 : 시동을 걸어라, 엑셀을 밟아라, 브레이크를 밟아라, 시동을꺼라


         */

        Scanner sc = new Scanner(System.in);

        CarRacer racer= new CarRacer();

        while(true){
            System.out.println("\n카 레이싱 프로그램");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("7. 묻고 더블로가");
            System.out.println("0. 종료");

            int menu = sc.nextInt();

            switch (menu){
                case 1: racer.startUp(); break;
                case 2: racer.stepAccelerator(); break;
                case 3: racer.stepBreak(); break;
                case 4: racer.turnOff(); break;
                case 7: racer.fullAccelerator(); break;
                case 0:
                    System.out.println("안녕히 가세요라"); break;
                default:
                    System.out.println("없는 번호 입니다.");
            }

        }
    }
}
