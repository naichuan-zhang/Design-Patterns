package com.refactoring_guru.abstract_factory;

import com.refactoring_guru.abstract_factory.buttons.Button;
import com.refactoring_guru.abstract_factory.checkboxes.CheckBox;
import com.refactoring_guru.abstract_factory.factories.GUIFactory;

/**
 * Factory user don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
