package com.company.another_decorator;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Client {
    public static void main(String[] args) {
        Factory factory;
        factory = new Factory();
        Component component = factory.getComponent();
        component.prtTicket();
    }
}
