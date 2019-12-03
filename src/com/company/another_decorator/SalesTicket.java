package com.company.another_decorator;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class SalesTicket extends Component {
    @Override
    public void prtTicket() {
        // place sales ticket printing code here ...
        System.out.println("sales ticket printed ...");
    }
}
