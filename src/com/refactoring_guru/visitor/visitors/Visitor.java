package com.refactoring_guru.visitor.visitors;

import com.refactoring_guru.visitor.shapes.Circle;
import com.refactoring_guru.visitor.shapes.CompoundShape;
import com.refactoring_guru.visitor.shapes.Dot;
import com.refactoring_guru.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);
    String visitCircle(Circle circle);
    String visitRectangle(Rectangle rectangle);
    String visitCompoundGraphic(CompoundShape cg);
}
