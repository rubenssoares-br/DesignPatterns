package refactoring.guru.factory;

import refactoring.guru.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
