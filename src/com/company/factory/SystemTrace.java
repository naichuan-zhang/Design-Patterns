package com.company.factory;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class SystemTrace implements Trace {

    private boolean debug;

    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if (debug) {
            System.out.println("DEBUG: " + message);
        }
    }

    @Override
    public void error(String message) {
        System.out.println("ERROR: " + message);
    }
}
