package com.company.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class FileTrace implements Trace {
    private PrintWriter pw;
    private boolean debug;

    public FileTrace() throws IOException {
        pw = new PrintWriter(new FileWriter("F:\\IntellijProjects\\Reviews\\src\\com\\company\\factory\\trace.log"));
    }

    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if (debug) {
            pw.println("DEBUG: " + message);
            pw.flush();
        }
    }

    @Override
    public void error(String message) {
        pw.println("ERROR: " + message);
        pw.flush();
    }
}
