package com.company.decorator;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class LargePizza extends Pizza {
    @Override
    public int cost() {
        return 12;
    }
}
