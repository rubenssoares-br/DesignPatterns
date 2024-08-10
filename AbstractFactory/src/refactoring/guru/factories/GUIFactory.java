package refactoring.guru.factories;

import refactoring.guru.buttons.AButton;
import refactoring.guru.buttons.Button;
import refactoring.guru.checkboxes.ACheckbox;

public interface GUIFactory {
    AButton createButton();
    ACheckbox createCheckbox();
}
