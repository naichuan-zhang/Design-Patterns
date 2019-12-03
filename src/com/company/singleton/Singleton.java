package com.company.singleton;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world!");
    }
}
