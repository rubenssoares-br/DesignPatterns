package refactoring.guru.factories;

import refactoring.guru.buttons.AButton;
import refactoring.guru.buttons.AWindowsAButton;
import refactoring.guru.checkboxes.ACheckbox;
import refactoring.guru.checkboxes.AWindowsCheckBox;

public class AWindowsFactory implements GUIFactory{
    @Override
    public AButton createButton() {
        return new AWindowsAButton();
    }

    @Override
    public ACheckbox createCheckbox() {
        return new AWindowsCheckBox();
    }
}
