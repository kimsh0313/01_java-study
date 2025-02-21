package com.ibe6.section01.dto;

public class NoteBook extends Electronic{

    private int usbPort;

    public NoteBook(){}

    public NoteBook(int usbPort) {
        this.usbPort = usbPort;
    }

    public NoteBook(String brand, String name, int price, int usbPort) {
        super(brand, name, price);
        this.usbPort = usbPort;
    }

    public int getUsbPort() {
        return usbPort;
    }

    public void setUsPort(int usbPort) {
        this.usbPort = usbPort;
    }

    @Override
    public String toString() {
        return "NoteBook{" + super.toString() +
                ", usbPort=" + usbPort +
                '}';
    }
}
