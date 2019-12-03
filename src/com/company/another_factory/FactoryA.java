package com.company.another_factory;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class FactoryA extends Factory {
    @Override
    public Product Manufacture() {
        return new ProductA();
    }
}
