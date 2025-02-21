package com.ino.section01.controller;

import com.ino.section01.dto.Electronic;

public class ElectornicManager2 {

    private Electronic[] electronics = new Electronic[3];
    private int cnt = 0;
    public void insert(Electronic e){
        electronics[cnt++] = e;
    }

    public Electronic select (int idx) {
        return electronics[idx];
    }
}
