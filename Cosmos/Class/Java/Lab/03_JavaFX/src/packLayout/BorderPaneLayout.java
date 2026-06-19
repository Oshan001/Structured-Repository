package packLayout;// Import necessary JavaFX packages
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.*; // For BorderPane and other layout classes
import javafx.scene.Scene;
import javafx.scene.control.*; // For UI controls like Button

/**
 * Demonstrates the use of BorderPane layout.
 * BorderPane divides the layout into 5 regions:
 * Top, Bottom, Left, Right, and Center.
 * Each region can hold only one node (but that node can be a layout that holds more).
 */
public class BorderPaneLayout extends Application {

    @Override
    public void start(Stage primaryStage){
        // Set the title of the window
        primaryStage.setTitle("BorderPane Layout");

        // Create 5 buttons representing different areas
        Button btn1 = new Button("Top");     // Goes to the top region
        Button btn2 = new Button("Bottom");  // Goes to the bottom region
        Button btn3 = new Button("Left");    // Goes to the left region
        Button btn4 = new Button("Right");   // Goes to the right region
        Button btn5 = new Button("Center");  // Goes to the center region

        // Create a BorderPane instance
        BorderPane borderPane = new BorderPane();

        // Assign nodes (buttons) to different regions of the BorderPane
        borderPane.setTop(btn1);      // Placed at the top of the layout
        borderPane.setBottom(btn2);   // Placed at the bottom
        borderPane.setLeft(btn3);     // Placed on the left side
        borderPane.setRight(btn4);    // Placed on the right side
        borderPane.setCenter(btn5);   // Placed in the center

        /**
         * NOTE:
         * - Each of these regions can only hold ONE node.
         * - You can nest layouts if you want to place multiple controls in a region.
         *   For example: borderPane.setTop(new HBox(...)); if you want multiple buttons at the top.
         * - Center region takes the remaining space by default.
         */

        // Create a Scene with the BorderPane as root node
        Scene scene = new Scene(borderPane, 300, 200); // Width = 300px, Height = 200px

        // Set the scene to the stage (main window)
        primaryStage.setScene(scene);

        // Display the window
        primaryStage.show();
    }

    // Entry point of JavaFX application
    public static void main(String[] args){
        launch();
    }
}