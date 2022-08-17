package create_abstract_factory_pattern.code.button.factories;

import create_abstract_factory_pattern.code.button.buttons.Button;
import create_abstract_factory_pattern.code.button.buttons.WindowsButton;
import create_abstract_factory_pattern.code.button.checkboxes.Checkbox;
import create_abstract_factory_pattern.code.button.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
