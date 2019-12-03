package com.company.builder;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
