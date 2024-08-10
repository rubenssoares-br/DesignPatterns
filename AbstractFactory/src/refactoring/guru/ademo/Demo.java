package refactoring.guru.ademo;

import refactoring.guru.app.Application;
import refactoring.guru.factories.AMacOSFactory;
import refactoring.guru.factories.AWindowsFactory;
import refactoring.guru.factories.GUIFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new AMacOSFactory();
        } else {
            factory = new AWindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
