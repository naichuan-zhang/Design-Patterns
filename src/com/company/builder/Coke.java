package com.company.builder;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
