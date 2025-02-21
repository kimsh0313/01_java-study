package com.ino.section03.interface_implements;

public interface Behavior {

    public abstract void eat();
    public abstract void work();

    public static void born() {
        System.out.println("we born");
    }

    public default void die() {
        System.out.println("we whenever die");
    }
}
