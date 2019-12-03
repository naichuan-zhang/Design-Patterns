package com.company.another_decorator;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Footer1 extends TicketDecorator {
    public Footer1(Component component) {
        super(component);
    }

    @Override
    public void prtTicket() {
        System.out.println("Printing footer 1");
        super.callTrailer();
    }
}
