package com.company.another_decorator;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Header2 extends TicketDecorator {
    public Header2(Component component) {
        super(component);
    }

    @Override
    public void prtTicket() {
        System.out.println("Printing header 2");
        super.callTrailer();
    }
}
