package com.company.factory;

import java.io.IOException;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class TestTrace {
    public static void main(String[] args) throws IOException {
        Trace log = TraceFactory.getTrace();
        log.debug("Entering log");
    }
}
