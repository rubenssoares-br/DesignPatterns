package refactoring.guru.buttons;

public class AWindowsAButton implements AButton {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
