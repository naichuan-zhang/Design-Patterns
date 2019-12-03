package com.company.builder;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
