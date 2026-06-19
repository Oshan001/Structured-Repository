package packLayout;// Import necessary JavaFX classes
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;  // For FlowPane and layout controls
import javafx.scene.control.*; // For UI elements like Button

/**
 * Demonstrates the use of FlowPane layout in JavaFX.
 *
 * FlowPane arranges nodes in a flow that wraps to the next line
 * when there’s not enough horizontal space. It's like text wrapping in a paragraph.
 *
 * - Nodes are arranged left-to-right (horizontal flow) by default.
 * - You can set horizontal and vertical gaps between elements.
 * - If the horizontal space is insufficient, it wraps the nodes to the next row.
 */
public class FlowPaneLayout extends Application {

    @Override
    public void start(Stage primaryStage){
        // Set the title for the primary window
        primaryStage.setTitle("FlowPane Layout");

        // Create a FlowPane layout manager
        FlowPane flowPane = new FlowPane();

        // Set spacing between nodes:
        flowPane.setHgap(10); // Horizontal gap between nodes (in pixels)
        flowPane.setVgap(10); // Vertical gap between rows (in pixels)

        /**
         * Adding multiple buttons to the FlowPane.
         * These buttons will flow left-to-right.
         * If there is not enough horizontal space,
         * they automatically wrap to the next line.
         */
        for(int i = 1; i <= 8; i++) {
            flowPane.getChildren().add(new Button("Button " + i));
        }

        /**
         * Create a Scene with the FlowPane as the root node.
         * Width = 200px, Height = 300px
         * This limited width will demonstrate the wrapping behavior.
         */
        Scene scene = new Scene(flowPane, 200, 300);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Display the window
        primaryStage.show();
    }

    // Entry point of the JavaFX application
    public static void main(String[] args){
        launch(); // Calls the start() method internally
    }
}