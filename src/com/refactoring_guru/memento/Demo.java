package com.refactoring_guru.memento;

import com.refactoring_guru.memento.editor.Editor;
import com.refactoring_guru.memento.shapes.Circle;
import com.refactoring_guru.memento.shapes.CompoundShape;
import com.refactoring_guru.memento.shapes.Dot;
import com.refactoring_guru.memento.shapes.Rectangle;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, Color.BLUE, 10),
                new CompoundShape(
                        new Circle(110, 110, Color.RED, 50),
                        new Dot(160, 160, Color.RED)
                ),
                new CompoundShape(
                        new Rectangle(250, 250, Color.GREEN, 100, 100),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
