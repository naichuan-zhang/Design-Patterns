package com.company.prototype;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape cloneShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + cloneShape.getType());
    }
}
