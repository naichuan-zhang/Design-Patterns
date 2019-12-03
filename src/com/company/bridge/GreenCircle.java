package com.company.bridge;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle[ color: green, radius: " +
                radius + ", x: " + x + ", y: " + y);
    }
}
