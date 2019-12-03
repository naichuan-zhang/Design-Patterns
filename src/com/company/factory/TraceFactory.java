package com.company.factory;

import java.io.File;
import java.io.IOException;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class TraceFactory {
    public static Trace getTrace() {
        try {
            return new FileTrace();
        } catch (IOException e) {
            Trace t = new SystemTrace();
            t.error("could not instantiate FileTrace: " + e.getMessage());
            return t;
        }
    }
}
