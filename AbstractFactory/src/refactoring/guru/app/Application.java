package refactoring.guru.app;

import refactoring.guru.buttons.AButton;
import refactoring.guru.checkboxes.ACheckbox;
import refactoring.guru.factories.GUIFactory;

public class Application {
    private AButton button;
    private ACheckbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
