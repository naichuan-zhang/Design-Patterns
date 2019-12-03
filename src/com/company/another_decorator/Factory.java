package com.company.another_decorator;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Factory {
    public Component getComponent() {
        return new Header1(new Header2(new Footer1(new SalesTicket())));
    }
}
