package com.company.factory;

public interface Trace {
    void setDebug(boolean debug);
    void debug(String message);
    void error(String message);
}
