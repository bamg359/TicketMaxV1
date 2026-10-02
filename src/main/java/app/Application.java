package app;

import app.configuration.Config;
import app.ui.CliUserInterface;

public class Application {

    public static void main(String[] args) {

        CliUserInterface cliUserInterface = Config.getCliUserInterface();
        cliUserInterface.applicationInit();

    }
}
