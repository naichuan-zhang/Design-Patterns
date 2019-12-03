package com.company.bridge;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
