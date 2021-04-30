package com.refactoring_guru.memento.commands;

public interface Command {
    String getName();
    void execute();
}
