package com.company.prototype;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
