package com.minkook.section01.controller;

import com.minkook.section01.dto.Desktop;
import com.minkook.section01.dto.NoteBook;
import com.minkook.section01.dto.Tablet;

//전자제품들을 관리해주는 클래스
public class ElectronicManager1 { //다형성 적용전
    private Desktop desk;
    private NoteBook note;
    private Tablet tab;

    public void insert(Desktop d){
        desk = d;
    }

    public void insert(NoteBook n){
        note = n;
    }

    public void insert(Tablet t){
        tab = t;
    }

    public Desktop selectDesktop() {
        return desk;
    }

    public NoteBook selectNoteBook() {
        return note;
    }

    public Tablet selectTablet() {
        return tab;
    }

    //각 인스턴스를 반환하기 위한 메소드를 매번 추가해줘야함

    //각 자식 타입을 매개변수나 반환타입에 작성하엿으므로
    //후에 자식 클래스명 같은게 변경 될 경우 여기와서도 다 변경해야함
}
