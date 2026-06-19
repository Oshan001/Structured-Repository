package packLayout;// Import the necessary JavaFX classes
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

/**
 * This JavaFX program demonstrates the use of VBox layout.
 * VBox (Vertical Box) is a layout that arranges its children nodes vertically (top to bottom).
 * It is very useful when we want to stack controls in a column-like structure.
 *
 * NOTE:
 * - VBox is part of the javafx.scene.layout package.
 * - We can specify spacing between elements in the constructor.
 * - We can add elements using vbox.getChildren().add(...) or addAll(...).
 */
public class VBoxLayout extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Set the title of the main application window (Stage)
        primaryStage.setTitle("VBOX LAYOUT");

        /**
         * Create a VBox layout.
         * The parameter "10" means there will be 10px spacing between each node vertically.
         * VBox aligns children from top to bottom by default.
         */
        VBox vbox = new VBox(10); // 10 pixels vertical spacing

        /**
         * Add buttons to VBox.
         * These buttons will appear one below another due to VBox’s vertical stacking nature.
         * We use addAll() to add multiple children at once.
         */
        vbox.getChildren().addAll(
                new Button("Button 1"), // Appears at the top
                new Button("Button 2"),
                new Button("Button 3")  // Appears at the bottom
        );

        /**
         * Create a Scene to hold the VBox.
         * Parameters:
         * - root node (vbox)
         * - width of the scene (200 px)
         * - height of the scene (150 px)
         */
        Scene scene = new Scene(vbox, 200, 150);

        // Set the scene to the primary stage (window)
        primaryStage.setScene(scene);

        // Show the stage (display the UI)
        primaryStage.show();
    }

    /**
     * The main method launches the JavaFX application.
     * The launch() method is inherited from Application and triggers the JavaFX lifecycle.
     */
    public static void main(String[] args){
        launch();
    }
}