package create_abstract_factory_pattern.code.button.factories;

import create_abstract_factory_pattern.code.button.buttons.Button;
import create_abstract_factory_pattern.code.button.buttons.MacOSButton;
import create_abstract_factory_pattern.code.button.checkboxes.Checkbox;
import create_abstract_factory_pattern.code.button.checkboxes.MacOSCheckbox;

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
