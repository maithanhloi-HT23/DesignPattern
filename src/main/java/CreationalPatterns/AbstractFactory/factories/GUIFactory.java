package CreationalPatterns.AbstractFactory.factories;

import CreationalPatterns.AbstractFactory.buttons.Button;
import CreationalPatterns.AbstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button  createButton();
    Checkbox createCheckbox();
}
