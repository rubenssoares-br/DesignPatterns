package refactoring.guru.factory;

import refactoring.guru.buttons.Button;
import refactoring.guru.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
