package com.refactoring_guru.abstract_factory.checkboxes;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */
public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckBox.");
    }
}
