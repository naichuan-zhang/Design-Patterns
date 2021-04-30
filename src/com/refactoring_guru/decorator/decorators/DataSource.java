package com.refactoring_guru.decorator.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
