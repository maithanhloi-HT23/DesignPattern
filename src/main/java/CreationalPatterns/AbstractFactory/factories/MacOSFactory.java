package CreationalPatterns.AbstractFactory.factories;

import CreationalPatterns.AbstractFactory.buttons.Button;
import CreationalPatterns.AbstractFactory.buttons.MacOSButton;
import CreationalPatterns.AbstractFactory.checkboxes.Checkbox;
import CreationalPatterns.AbstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
