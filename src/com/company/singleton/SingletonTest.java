package com.company.singleton;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
