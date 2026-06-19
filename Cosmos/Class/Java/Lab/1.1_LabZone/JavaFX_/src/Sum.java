// Import necessary JavaFX classes
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;     // For VBox and layout classes
import javafx.scene.control.*;   // For UI controls like TextField, Button

/**
 * A simple JavaFX application to add two numbers.
 * Demonstrates input handling, event handling, and layout using VBox.
 */
public class Sum extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Set the window title
        primaryStage.setTitle("Add Two Numbers");

        // --- INPUT FIELDS ---

        // First number input field
        TextField num1 = new TextField();
        num1.setPromptText("Enter first number"); // Shows hint text

        // Second number input field
        TextField num2 = new TextField();
        num2.setPromptText("Enter second number");

        // Result field (non-editable)
        TextField result = new TextField();
        result.setPromptText("Result");
        result.setEditable(false); // Prevents user from typing in result field

        // --- BUTTON ---

        // Create Add button
        Button sum = new Button("Add");

        // Makes this button respond when Enter is pressed
        sum.setDefaultButton(true);

        // Set event handler for the button
        sum.setOnAction(e -> {
            try {
                // Parse integers from both fields
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());

                // Add the numbers and display the result
                int add = a + b;

                // We cannot pass 'add' directly to setText() because 'add' is an int,
                // and setText() expects a String. So we use String.valueOf(add)
                // to convert the int result into a String before displaying it in the TextField
                result.setText(String.valueOf(add)); // Alternative: result.setText("" + add); // This also works because it forces the int to be a String using concatenation
            } catch (NumberFormatException ex) {
                // If non-integer input is given
                result.setText("Invalid input!!!");
            }
        });

        // --- LAYOUT ---

        /**
         * VBox layout arranges nodes vertically with spacing of 10px
         * Elements appear in the order: num1 → num2 → button → result
         */
        VBox vbox = new VBox(10, num1, num2, sum, result);

        // Create a scene with the VBox layout, width = 300, height = 200
        Scene scene = new Scene(vbox, 300, 200);

        // Set the scene to the primary stage (window)
        primaryStage.setScene(scene);

        // Display the window
        primaryStage.show();
    }

    // Main method - launches the JavaFX application
    public static void main(String[] args) {
        launch();
    }
}