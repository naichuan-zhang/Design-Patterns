package com.company.builder;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
