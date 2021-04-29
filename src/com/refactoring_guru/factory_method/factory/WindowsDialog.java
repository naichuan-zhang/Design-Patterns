package com.refactoring_guru.factory_method.factory;

import com.refactoring_guru.factory_method.buttons.Button;
import com.refactoring_guru.factory_method.buttons.WindowsButton;

/**
 * Windows dialog will produce windows buttons.
 **/
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
