package com.refactoring_guru.factory_method;

import com.refactoring_guru.factory_method.factory.Dialog;
import com.refactoring_guru.factory_method.factory.HtmlDialog;
import com.refactoring_guru.factory_method.factory.WindowsDialog;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
