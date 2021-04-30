package com.refactoring_guru.state;

import com.refactoring_guru.state.ui.Player;
import com.refactoring_guru.state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
