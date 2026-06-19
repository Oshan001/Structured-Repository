package packBasics;// Importing necessary JavaFX classes
import javafx.application.Application; // Base class for JavaFX applications
import javafx.stage.Stage; // Represents the primary window (stage) in a JavaFX application

// Your main class must extend 'Application' to use JavaFX
public class FrameStage extends Application {

    /**
     * The 'start' method is the main entry point for all JavaFX applications.
     * It's called automatically after the application is launched.
     * The Stage parameter is like the main window (like JFrame in Swing).
     */
    @Override
    public void start(Stage primaryStage){
        // Setting the title of the window
        primaryStage.setTitle("JavaFX!");

        // Making the window visible
        primaryStage.show();
    }

    /**
     * The 'main' method is needed to launch the JavaFX application.
     * 'launch(args)' internally calls the 'start' method after setting up JavaFX.
     */
    public static void main(String[] args){
        // launch(args) is a static method from the Application class that starts the JavaFX application.
        // It sets up the JavaFX runtime and calls the overridden start() method.
        // 'args' refers to command-line arguments passed to the program (can be used later via getParameters()).
        // It's optional to pass 'args' — you can just write launch(); if you're not using command-line inputs.
        launch(args); // This starts the JavaFX application lifecycle
    }
}