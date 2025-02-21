package com.podoseee.section01.controller;

import com.podoseee.section01.dto.Desktop;
import com.podoseee.section01.dto.NoteBook;
import com.podoseee.section01.dto.Tablet;

// 전자제품들을 관리해주는 클래스
public class ElectronicManager1 { // 다형성 적용전

    private Desktop desk;
    private NoteBook note;
    private Tablet tab;
    
    // 제품 추가용 메소드
    public void insert(Desktop d){
        desk = d;
    }

    public void insert(NoteBook n) {
        note = n;
    }

    public void insert(Tablet t) {
        tab = t;
    }
    // 각 인스턴스들을 전달받기 위한 메소드를 매번 추가해줘야됨

    // 제품 조회용 메소드
    public Desktop selectDesktop(){
        return desk;
    }
    public NoteBook selectNoteBook(){
        return note;
    }
    public Tablet selectTablet(){
        return tab;
    }
    // 각 인스턴스들을 반환하기 위한 메소드를 매번 추가해줘야됨
    // 각 자식 타입을 매개변수나 반환타입에 작성하였으므로
    // 후에 자식 클래스명 같은게 변경될 경우 여기 와서도 다 변경해야됨
    // => 각 자식타입에 의존하도록 작성했기 때문 (결합도 높음)
}
