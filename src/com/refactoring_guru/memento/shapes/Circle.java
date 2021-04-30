package com.refactoring_guru.memento.shapes;

import java.awt.*;

public class Circle extends BaseShape {
    private int radius;

    public Circle(int x, int y, Color color, int radius) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
}
