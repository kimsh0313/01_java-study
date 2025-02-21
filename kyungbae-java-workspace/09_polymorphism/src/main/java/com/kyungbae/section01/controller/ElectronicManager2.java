package com.kyungbae.section01.controller;

import com.kyungbae.section01.dto.Electronic;

public class ElectronicManager2 { // 다형성 적용 후

    // 부모타입 배열로 모든 자식 인스턴스 가지도록
    private Electronic[] elec = new Electronic[3];
    private  int count = 0;

    // 제품 추가용 메소드
    public void insert(Electronic any){
        elec[count++] = any;
    }

    // 제품 조회용 메소드
    public Electronic select(int index){
        return elec[index];
    }


}
