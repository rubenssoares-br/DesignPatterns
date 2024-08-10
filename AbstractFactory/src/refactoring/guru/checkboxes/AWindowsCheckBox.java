package refactoring.guru.checkboxes;

public class AWindowsCheckBox implements ACheckbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
