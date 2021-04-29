package com.refactoring_guru.abstract_factory.factories;

import com.refactoring_guru.abstract_factory.buttons.Button;
import com.refactoring_guru.abstract_factory.buttons.MacOSButton;
import com.refactoring_guru.abstract_factory.checkboxes.CheckBox;
import com.refactoring_guru.abstract_factory.checkboxes.MacOSCheckBox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
