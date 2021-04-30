package com.refactoring_guru.visitor.shapes;

import com.refactoring_guru.visitor.visitors.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
