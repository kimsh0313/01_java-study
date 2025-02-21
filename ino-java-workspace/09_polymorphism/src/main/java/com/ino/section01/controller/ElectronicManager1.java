package com.ino.section01.controller;

import com.ino.section01.dto.Desktop;
import com.ino.section01.dto.NoteBook;
import com.ino.section01.dto.Tablet;

public class ElectronicManager1 {

    private Desktop desktop;
    private NoteBook noteBook;
    private Tablet tablet;

    public void insert(Desktop d){
        desktop = d;
    }

    public void insert(NoteBook n) {
        noteBook = n;
    }

    public void insert(Tablet t) {
        tablet = t;
    }

    public Desktop selectDesktop() {
        return desktop;
    }

    public NoteBook selectNoteBook() {
        return noteBook;
    }

    public Tablet selectTablet() {
        return tablet;
    }
}
