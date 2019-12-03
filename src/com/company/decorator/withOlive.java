package com.company.decorator;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class withOlive extends PizzaDecorator {
    withOlive(Pizza p) {
        super(p);
    }

    @Override
    public int cost() {
        return super.cost() + 3;
    }
}
