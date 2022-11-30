package CreationalPatterns.AbstractFactory.factories;

import CreationalPatterns.AbstractFactory.buttons.Button;
import CreationalPatterns.AbstractFactory.buttons.WindowsButton;
import CreationalPatterns.AbstractFactory.checkboxes.Checkbox;
import CreationalPatterns.AbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
