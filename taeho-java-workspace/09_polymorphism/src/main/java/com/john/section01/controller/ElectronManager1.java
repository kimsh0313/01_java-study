package com.john.section01.controller;

import com.john.section01.dto.Desktop;
import com.john.section01.dto.NoteBook;
import com.john.section01.dto.Tablet;

public class ElectronManager1 {
    private Desktop deskTop;
    private NoteBook noteBook;
    private Tablet tablet;

    /*
        각 인스턴스를 전달받기 위해 매번 메서드 추가필요

    public void insert(Desktop d){
        deskTop = d;
    }
    public void insert(NoteBook nb){
        noteBook = nb;
    }
    public void insert(Tablet t){
        tablet = t;
    }
     */
    
    /* 
        각 인스턴스를 반환하기 위해 매번 메서드 추가필요
        높은 결합도: 자식 클래스명 등이 변경될 경우, 각 클래스명에 맞게 작성한 메서드 들도 전부 변경 필요

    public Desktop selectDesktop(){
        return deskTop;
    }

    public NoteBook selectNoteBook(){
        return noteBook;
    }

    public Tablet selectTablet(){
        return tablet;
    }
    
     */

    public void insert(Desktop d){
        deskTop = d;
    }
    public void insert(NoteBook nb){
        noteBook = nb;
    }
    public void insert(Tablet t){
        tablet = t;
    }

    public Desktop selectDesktop(){
        return deskTop;
    }

    public NoteBook selectNoteBook(){
        return noteBook;
    }

    public Tablet selectTablet(){
        return tablet;
    }
}
