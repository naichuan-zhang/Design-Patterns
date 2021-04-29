package com.refactoring_guru.factory_method.factory;

import com.refactoring_guru.factory_method.buttons.Button;
import com.refactoring_guru.factory_method.buttons.HtmlButton;

/**
 * HTML dialog will produce HTML button
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
