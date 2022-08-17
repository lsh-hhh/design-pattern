package create_abstract_factory_pattern.code.button;

import create_abstract_factory_pattern.code.button.app.Application;
import create_abstract_factory_pattern.code.button.factories.GUIFactory;
import create_abstract_factory_pattern.code.button.factories.MacOSFactory;
import create_abstract_factory_pattern.code.button.factories.WindowsFactory;

public class ButtonClient {

    private static Application configureApplication() {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

}
