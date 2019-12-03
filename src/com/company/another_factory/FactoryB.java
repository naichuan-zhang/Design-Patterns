package com.company.another_factory;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class FactoryB extends Factory {
    @Override
    public Product Manufacture() {
        return new ProductB();
    }
}
