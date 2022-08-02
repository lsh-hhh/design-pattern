package create_factory_pattern.code.factory;

import create_factory_pattern.code.buttons.Button;

public abstract class Dialog {

    abstract Button createButton();

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }
}
