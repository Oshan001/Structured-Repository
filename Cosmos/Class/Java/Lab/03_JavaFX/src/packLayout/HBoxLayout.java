package packLayout;// Import required JavaFX classes
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*; // For Label, Button, TextField, PasswordField, Alert
import javafx.scene.control.Alert.*; // For different Alert types
import javafx.scene.layout.HBox; // HBox layout for horizontal arrangement

/**
 * Demonstrates use of HBox layout.
 * HBox arranges its children nodes horizontally (left to right).
 */
public class HBoxLayout extends Application {
    @Override
    public void start(Stage primaryStage){
        // Set the title of the stage (window)
        primaryStage.setTitle("HBOX LAYOUT");

        // Create Label for name input
        Label nameLabel = new Label("Name");

        // TextField for name input
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name"); // Hint text inside the input field

        // Create Label for password input
        Label passwordLabel = new Label("Password");

        // PasswordField masks the input for security
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");

        // Create a Login button
        Button login = new Button("Login");

        // Set action when login button is clicked
        login.setOnAction(e -> {
            // Alert box that pops up on button click
            Alert alert = new Alert(AlertType.INFORMATION); // Type: INFORMATION
            alert.setTitle("Info"); // Title of the alert window
            alert.setHeaderText(null); // No header text
            alert.setContentText("Logged in successfully"); // Main message
            alert.showAndWait(); // Show alert and wait for user to close it

            /**
             * NOTE: Other Alert types include:
             * - AlertType.INFORMATION: Informational messages
             * - AlertType.WARNING: For warning messages
             * - AlertType.ERROR: To display error messages
             * - AlertType.CONFIRMATION: For user confirmation (e.g., Yes/No)
             * - AlertType.NONE: Basic alert with no preset style
             */
        });

        /**
         * Create an HBox layout.
         * Children will be placed side by side in a row.
         * Spacing between elements is set to 20 pixels.
         */
        HBox hbox = new HBox(20);
        hbox.getChildren().addAll(
                nameLabel, nameField,
                passwordLabel, passwordField,
                login
        );

        // Create a scene and pass the hbox as root node, set size to 600x100
        Scene scene = new Scene(hbox, 600, 100);

        // Attach scene to stage
        primaryStage.setScene(scene);

        // Show the UI
        primaryStage.show();
    }

    // Launch the application
    public static void main(String[] args){
        launch();
    }
}