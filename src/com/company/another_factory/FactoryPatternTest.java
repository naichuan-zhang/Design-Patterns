package com.company.another_factory;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class FactoryPatternTest {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.Manufacture().show();

        FactoryB factoryB = new FactoryB();
        factoryB.Manufacture().show();
    }
}
