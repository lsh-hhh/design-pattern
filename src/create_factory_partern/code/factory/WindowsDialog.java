package create_factory_partern.code.factory;

import create_factory_partern.code.buttons.Button;
import create_factory_partern.code.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
