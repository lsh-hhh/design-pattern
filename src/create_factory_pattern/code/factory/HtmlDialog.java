package create_factory_pattern.code.factory;

import create_factory_pattern.code.buttons.Button;
import create_factory_pattern.code.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
