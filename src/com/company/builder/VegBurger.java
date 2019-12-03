package com.company.builder;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
