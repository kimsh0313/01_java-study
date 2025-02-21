package section01.controller;

import section01.dto.Desktop;
import section01.dto.NoteBook;
import section01.dto.Tablet;

//전자제품 중앙관리- 다형성 적용 전
public class ElectronicManager1 {
    private Desktop desk;
    private NoteBook note;
    private Tablet tab;


    public void insert(Desktop desktop) {
         desk = desktop;
    }

    public void insert(NoteBook noteBook) {
        note = noteBook;
    }

    public void insert(Tablet table) {
        tab = table;
    }

    public Desktop selectDesktop(){
        return desk;
    }

    public NoteBook selectNoteBook(){
        return note;
    }

    public Tablet selectTablet(){
        return tab;
    }

}
