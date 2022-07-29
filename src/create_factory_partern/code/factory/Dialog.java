package create_factory_partern.code.factory;

import create_factory_partern.code.buttons.Button;

public abstract class Dialog {

    abstract Button createButton();

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }
}
