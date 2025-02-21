package com.kyungbae.section01.dto;

public class Notebook extends Electronic {

    private int usbPort;

    public Notebook(){}

    public Notebook(String brand, String name, int price, int usbPort) {
        super(brand, name, price);
        this.usbPort = usbPort;
    }

    public int getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(int usbPort) {
        this.usbPort = usbPort;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "usbPort=" + usbPort +
                "} " + super.toString();
    }
}
