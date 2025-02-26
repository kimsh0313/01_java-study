package com.younggalee.practice7.controller;

import com.younggalee.practice7.dto.Product;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class ProductManeger_ArrayList {
//    private Product[] pd = new Product[10];
    private List<Product> pro = new ArrayList<>(); // 크기지정필요 없음

    public int count = 0;
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){

        while(true){
            System.out.println("===== 제품 관리 메뉴 =====\n" +
                    "1. 제품 정보 추가 \n" +
                    "2. 제품 전체 조회 \n" +
                    "3. 제품 정보 수정\n" +
                    "0. 프로그램 종료\n");

            int menu = sc.nextInt();
            sc.nextLine();

            if(menu == 1) {
                productInput();
            } else if (menu == 2) {
                productPrint();
            } else if (menu == 3) {
                productUpdate();
            } else if (menu == 0) {
                break;
            } else {
                System.out.println("다시입력하세요");
                break;
            }
        }
    }

    public void productInput(){
        System.out.print("제품 번호: ");
        int pId = sc.nextInt();
        sc.nextLine();

        System.out.print("제품명: ");
        String pName = sc.nextLine();
        sc.nextLine();

        System.out.print("제품 가격: ");
        int price = sc.nextInt();

        System.out.print("제품 세금: ");
        double tax = sc.nextDouble();
        pro.add( new Product(pId, pName, price, tax));
        ++count;
    }

    public void productPrint(){
//        for (int i=0; i<count; i++){
//            System.out.println(pd[i].getInformation());
//        }
        for (int i=0; i<pro.size(); i++){
            System.out.println(pro.get(i).getInformation());
        }
    }

    public void productUpdate(){
        System.out.println("수정하고자 하는 제품명을 입력하세요");
        String modiProductName = sc.nextLine();

        for (int i=0; i<count; i++){
            if(pro.get(i).getPName().equals(modiProductName)){
                System.out.println("변경할 제품명을 입력하세요");
                pro.get(i).setPName(sc.nextLine());
            }
        }

    }
}
