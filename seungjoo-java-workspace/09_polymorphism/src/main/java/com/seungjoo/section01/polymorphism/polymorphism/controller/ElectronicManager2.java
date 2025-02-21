package com.seungjoo.section01.polymorphism.polymorphism.controller;

import com.seungjoo.section01.polymorphism.polymorphism.dto.Electronic;

public class ElectronicManager2 {

    private Electronic[] elec = new Electronic[3]; //부모타입 배열로 모든 자식 인스턴스 가지도록
    private int count = 0;


    //제품 추가용 메소드
    public void insert(Electronic any){
        elec[count++] = any;
    }


    //제품 조회용 메소드
    public Electronic select(int index){
        return elec[index];
    }

}
