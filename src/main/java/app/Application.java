package app;

import app.ui.CliUserInterface;

public class Application {

    public static void main(String[] args) {

        CliUserInterface userInterface = new CliUserInterface();
        userInterface.applicationInit();

    }
}
