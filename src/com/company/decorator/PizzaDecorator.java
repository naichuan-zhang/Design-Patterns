package com.company.decorator;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class PizzaDecorator extends Pizza {
    Pizza p;

    PizzaDecorator(Pizza p) {
        this.p = p;
    }

    @Override
    public int cost() {
        return p.cost();
    }
}
