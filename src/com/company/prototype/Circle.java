package com.company.prototype;

import javax.crypto.Cipher;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
