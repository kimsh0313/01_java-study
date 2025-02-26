package com.seungjoo.section03.interface_implements;

public interface Behavior {

    public static final int OPENING_TIME = 9;
    public static final int CLOSING_TIME = 18;


    /*public abstract*/ void eat();
    /*public abstract */void work();

    public static void born(){
        System.out.println("태어남");
    }

    //단, default 메소드는 정의 가능(8버전부터)
    public default void die(){

            System.out.println("죽습니다.");

    }


}
