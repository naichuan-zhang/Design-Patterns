package com.company.another_decorator;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Header1 extends TicketDecorator {

    public Header1(Component component) {
        super(component);
    }

    @Override
    public void prtTicket() {
        System.out.println("Printing header 1");
        super.callTrailer();
    }
}
