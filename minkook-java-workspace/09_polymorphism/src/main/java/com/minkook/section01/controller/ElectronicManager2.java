package com.minkook.section01.controller;

import com.minkook.section01.dto.Electronic;

public class ElectronicManager2 { //다형성적용후
    private Electronic [] elec = new Electronic[3];
    private int count = 0;

    public void insert(Electronic any){
        elec[count++] = any;
    }

    public Electronic select(int idx){
        return elec[idx++];
    }

    /*
        다형성장점3: 확장성이 좋은 코드를 작성할 수 있음(후에 새로운 전자제품 클래스가 추가되어도 메소드를 추가할때 메소드를 추가 구현할 필요가 없음)
        다형성장점4: 결합도를 낮춰 유지보수성을 증가시킬 수 있음(부모타입 만을 매개변수 및 반환타입으로 둬서)
        
        ## 대표적으로 다형성이 적용된 메소드 ##
        Object 클래스의 equals 메소드
     */

}
