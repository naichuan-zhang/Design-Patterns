package com.company.prototype;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
