package create_abstract_factory_pattern.code.button.factories;

import create_abstract_factory_pattern.code.button.buttons.Button;
import create_abstract_factory_pattern.code.button.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();

}
