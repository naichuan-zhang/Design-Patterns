package com.company.proxy;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class ProxyTes {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.img");

        image.display();
        System.out.println();
        image.display();
    }
}
