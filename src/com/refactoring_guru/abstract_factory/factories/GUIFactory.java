package com.refactoring_guru.abstract_factory.factories;

import com.refactoring_guru.abstract_factory.buttons.Button;
import com.refactoring_guru.abstract_factory.checkboxes.CheckBox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
