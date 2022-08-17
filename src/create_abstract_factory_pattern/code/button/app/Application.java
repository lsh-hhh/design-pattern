package create_abstract_factory_pattern.code.button.app;

import create_abstract_factory_pattern.code.button.buttons.Button;
import create_abstract_factory_pattern.code.button.checkboxes.Checkbox;
import create_abstract_factory_pattern.code.button.factories.GUIFactory;

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
