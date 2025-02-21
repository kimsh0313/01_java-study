package com.seungjoo.section01.polymorphism.polymorphism.controller;


import com.seungjoo.section01.polymorphism.polymorphism.dto.Desktop;
import com.seungjoo.section01.polymorphism.polymorphism.dto.NoteBook;
import com.seungjoo.section01.polymorphism.polymorphism.dto.Tablet;

//전자제품들을 관리해주는 클래스
public class ElectronicManager1 { //다형성 적용전
    private Desktop desk;
    private NoteBook note;
    private Tablet tab;

    //오버로딩임 밑의 메서드들

    //제품 추가용 메소드
    public void insert(Desktop d){
        desk = d;
    }
    public void insert(NoteBook n){
        note =n;
    }
    public void insert(Tablet t){
        tab = t;
    }

    //제품 조회용 메소드
    public Desktop selectDesktop(){
        return desk;   //이런 경우엔 오버로딩이 안되서 메서드 이름을 다르게 해야함
    }
    public NoteBook selectNoteBook(){
        return note;
    }
    public Tablet selectTablet(){
        return tab;
    }


    //자식타입에 의존하도록 작성했기 때문에 후에 자식 클래스명 같은게 변경될 경우 여기 와서도 다 변경해야함
    //결합도 높음


}
