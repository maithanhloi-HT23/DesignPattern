package CreationalPatterns.AbstractFactory.app;

import CreationalPatterns.AbstractFactory.buttons.Button;
import CreationalPatterns.AbstractFactory.checkboxes.Checkbox;
import CreationalPatterns.AbstractFactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
