package com.company.another_decorator;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public abstract class TicketDecorator extends Component {
    private Component trailer;

    public TicketDecorator(Component component) {
        this.trailer = component;
    }

    public void callTrailer() {
        if (trailer != null)
            trailer.prtTicket();
    }
}
