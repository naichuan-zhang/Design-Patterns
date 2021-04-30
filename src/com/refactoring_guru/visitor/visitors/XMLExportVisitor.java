package com.refactoring_guru.visitor.visitors;

import com.refactoring_guru.visitor.shapes.*;

public class XMLExportVisitor implements Visitor {
    public String export(Shape... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        for (Shape shape : args) {
            sb.append(shape.accept(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitDot(Dot dot) {
        return "<dot>" +
                "<id>" + dot.getId() + "</id>" +
                "<x>" + dot.getX() + "</x>" +
                "<y>" + dot.getY() + "</y>" +
                "</dot>";
    }

    @Override
    public String visitCircle(Circle circle) {
        return "<circle>" +
                "<id>" + circle.getId() + "</id>" +
                "<x>" + circle.getX() + "</x>" +
                "<y>" + circle.getY() + "</y>" +
                "<radius>" + circle.getRadius() + "</radius>" +
                "</circle>";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return "<Rectangle>" +
                "<id>" + rectangle.getId() + "</id>" +
                "<x>" + rectangle.getX() + "</x>" +
                "<y>" + rectangle.getY() + "</y>" +
                "<width>" + rectangle.getWidth() + "</width>" +
                "<height>" + rectangle.getHeight() + "</height>" +
                "</Rectangle>";
    }

    @Override
    public String visitCompoundGraphic(CompoundShape cg) {
        return "<compound_graphic>" +
                "<id>" + cg.id + "</id>" +
                _visitCompoundGraphic(cg) +
                "</compound_graphic>";
    }

    private String _visitCompoundGraphic(CompoundShape cg) {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : cg.children) {
            String obj = shape.accept(this);
            // Proper indentation for sub-objects.
            obj = "\t" + obj.replace("\n", "\n\t") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }
}
