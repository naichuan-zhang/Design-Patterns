package com.company.bridge;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class BridgeTest {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
