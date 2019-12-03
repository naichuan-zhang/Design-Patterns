package com.company.decorator;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class DecoratorTest {

    public static void main(String[] args) {
        int price;

        Pizza hamOlivePizza = new withHam(new withOlive(new LargePizza()));
        price = hamOlivePizza.cost();
        System.out.println(price);

        Pizza dblHamPizza = new withHam(new withHam(new SmallPizza()));
        price = dblHamPizza.cost();
        System.out.println(price);
    }
}
