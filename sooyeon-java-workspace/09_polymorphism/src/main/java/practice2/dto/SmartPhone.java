package practice2.dto;

//얘는 왜 추상클래스지
public abstract class SmartPhone implements CellPhone, TouchDisplay {
    public SmartPhone() {
    }

    public abstract void printMaker();

}
