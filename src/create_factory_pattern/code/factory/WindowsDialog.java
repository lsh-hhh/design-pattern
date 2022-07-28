package create_factory_pattern.code.factory;

import create_factory_pattern.code.buttons.Button;
import create_factory_pattern.code.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
