package create_factory_partern.code.factory;

import create_factory_partern.code.buttons.Button;
import create_factory_partern.code.buttons.HtmlButton;

public class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
