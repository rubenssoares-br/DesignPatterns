package refactoring.guru.factory;

import refactoring.guru.buttons.Button;
import refactoring.guru.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
