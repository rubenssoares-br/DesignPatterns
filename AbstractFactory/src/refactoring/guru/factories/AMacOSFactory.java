package refactoring.guru.factories;

import refactoring.guru.buttons.AButton;
import refactoring.guru.buttons.AMacOSAButton;
import refactoring.guru.buttons.Button;
import refactoring.guru.checkboxes.ACheckbox;
import refactoring.guru.checkboxes.AMacOSACheckbox;

public class AMacOSFactory implements GUIFactory{
    @Override
    public AButton createButton() {
        return new AMacOSAButton();
    }

    @Override
    public ACheckbox createCheckbox() {
        return new AMacOSACheckbox();
    }
}
