package com.seungjoo.practice2.dto;

import java.io.Serializable;

public abstract class SmartPhone implements CellPhone, TouchDisplay {

    public SmartPhone() {
    }

    public abstract void printMaker();

}