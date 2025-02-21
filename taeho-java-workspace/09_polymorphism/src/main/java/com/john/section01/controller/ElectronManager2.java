package com.john.section01.controller;

import com.john.section01.dto.Electronic;

/*
    다형성의 장점
        - 확장성이 좋은 코드를 작성, 낮은 결합도
 */

public class ElectronManager2 {
    // 부모타입의 배열로 모든 자식 인스턴스를 가질 수 있도록 선언
    private Electronic[] electronics = new Electronic[3];
    private int count = 0;

    public void insert(Electronic electronic) {
        electronics[count] = electronic;
        count++;
    }

    // 부모타입을 return
    public Electronic select(int idx) {
        return electronics[idx];
    }
}
