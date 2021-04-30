package com.refactoring_guru.memento.editor;

import com.refactoring_guru.memento.commands.Command;
import com.refactoring_guru.memento.history.History;
import com.refactoring_guru.memento.history.Memento;
import com.refactoring_guru.memento.shapes.CompoundShape;
import com.refactoring_guru.memento.shapes.Shape;

import javax.swing.*;
import java.io.*;
import java.util.Base64;

public class Editor extends JComponent {
    private Canvas canvas;
    private CompoundShape allShapes = new CompoundShape();
    private History history;

    public Editor() {
        canvas = new Canvas(this);
        history = new History();
    }

    public void loadShapes(Shape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    public CompoundShape getShapes() {
        return allShapes;
    }

    public void execute(Command command) {
        history.push(command, new Memento(this));
        command.execute();
    }

    public void undo() {
        if (history.undo()) {
            canvas.repaint();
        }
    }

    public void redo() {
        if (history.redo()) {
            canvas.repaint();
        }
    }

    public String backup() {
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bout);
            oos.writeObject(this.allShapes);
            oos.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException e) {
            return "";
        }
    }

    public void restore(String state) {
        try {
            byte[] data = Base64.getDecoder().decode(state);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            this.allShapes = (CompoundShape) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
