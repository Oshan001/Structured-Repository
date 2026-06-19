package packBasics;// JavaFX package imports

import javafx.application.Application; // The base class for any JavaFX application. You must extend this class to create a JavaFX app.
import javafx.scene.Scene; // Represents the content area (canvas) of the window (Stage).
import javafx.scene.control.*; // Includes all built-in UI components like Label, Button, TextField, etc.
import javafx.scene.Group; // A layout container that places children manually using setLayoutX/Y.
import javafx.stage.Stage; // The top-level container for every JavaFX app – the "window" itself.

public class Components extends Application {

    // The entry point for any JavaFX application. This method is automatically called when the app starts.
    @Override
    public void start(Stage primaryStage){
        // Set the title that appears on the window (Stage)
        primaryStage.setTitle("All JavaFX Controls");

        // ---------------- UI COMPONENTS SETUP ----------------

        // 1. Label – displays non-editable text
        Label label = new Label("This is a label");
        label.setLayoutX(20); // Horizontal position from the left
        label.setLayoutY(20); // Vertical position from the top

        // 2. Button – user can click to perform an action
        Button button = new Button("Click Me");
        button.setLayoutX(20);
        button.setLayoutY(60);
        // Add action when button is clicked (prints to console)
        button.setOnAction(e -> System.out.println("Button Clicked!"));

        // 3. TextField – single-line user text input
        TextField textField = new TextField();
        textField.setPromptText("Enter text here"); // Placeholder text when empty
        textField.setLayoutX(20);
        textField.setLayoutY(100);

        // 4. TextArea – multi-line text input
        TextArea textArea = new TextArea("Multiline text");
        textArea.setLayoutX(20);
        textArea.setLayoutY(140);
        textArea.setPrefWidth(200); // Set width in pixels
        textArea.setPrefHeight(60); // Set height in pixels

        // 5. CheckBox – boolean option (checked/unchecked)
        CheckBox checkBox = new CheckBox("I agree");
        checkBox.setLayoutX(20);
        checkBox.setLayoutY(220);

        // 6. RadioButtons – user can choose one option from a group
        RadioButton radio1 = new RadioButton("Option A");
        RadioButton radio2 = new RadioButton("Option B");

        // Grouping radio buttons to ensure only one can be selected
        ToggleGroup group = new ToggleGroup();
        radio1.setToggleGroup(group);
        radio2.setToggleGroup(group);

        radio1.setLayoutX(20);
        radio1.setLayoutY(260);
        radio2.setLayoutX(100);
        radio2.setLayoutY(260);

        // 7. ComboBox – dropdown list of selectable options
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Apple", "Banana", "Orange"); // Add choices
        comboBox.setPromptText("Select Items"); // Placeholder text
        comboBox.setLayoutX(20);
        comboBox.setLayoutY(300);

        // 8. ListView – shows a vertical list of items for selection
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Nepal", "India", "Bhutan", "China"); // Add countries
        listView.setLayoutX(20);
        listView.setLayoutY(340);
        listView.setPrefHeight(80); // Set height of the list view

        // 9. Slider – allows user to pick a value in a range (like volume slider)
        Slider slider = new Slider(0, 100, 50); // min=0, max=100, initial=50
        slider.setLayoutX(20);
        slider.setLayoutY(440);
        slider.setPrefWidth(200); // Set width in pixels

        // 10. ProgressBar – shows progress visually (value: 0.0 to 1.0)
        ProgressBar progressBar = new ProgressBar(0.5); // 50% progress
        progressBar.setLayoutX(20);
        progressBar.setLayoutY(480);
        progressBar.setPrefWidth(200);

        // ----------------- LAYOUT SETUP -----------------

        // Group is used for manually placing controls by coordinates (absolute positioning)
        Group root = new Group();

        // Add all UI elements to the root group (they'll appear in the scene)
        root.getChildren().addAll(
                label,
                button,
                textField,
                textArea,
                checkBox,
                radio1,
                radio2,
                comboBox,
                listView,
                slider,
                progressBar
        );

        // Create the scene: it holds the entire UI tree starting from root
        Scene scene = new Scene(root, 300, 550); // Initial width & height

        // Attach the scene to the stage (window)
        primaryStage.setScene(scene);
        primaryStage.setWidth(340);  // Optional: setting window width explicitly
        primaryStage.setHeight(600); // Optional: setting window height explicitly
        primaryStage.show(); // Finally display the GUI window
    }

    // main() method — the real start point of the program
    public static void main(String[] args){
        // launch() method starts the JavaFX runtime, which will call start() method above
        launch(); // If needed, args could be passed: launch(args)
    }
}
/*
 -------------------------------
    Other Controls in JavaFX
 -------------------------------

 These are other useful JavaFX UI components you can explore:

 | Control Name        | Description                                                                                   |
 |---------------------|-----------------------------------------------------------------------------------------------|
 | PasswordField       | A text field that hides input characters (useful for passwords).
 | DatePicker          | A calendar popup to let the user select a date.
 | ColorPicker         | Opens a color chooser dialog for selecting colors.
 | ChoiceBox           | A simpler alternative to ComboBox, used for small sets of options.
 | TableView           | Displays data in a table format with rows and columns (like Excel).
 | TreeView            | Hierarchical tree display (like file explorers).
 | MenuBar, MenuItem   | Used to create application menus (File, Edit, Help, etc.).
 | ToggleButton        | A button that stays pressed or toggled when clicked.
 | Tooltip             | Small text box that appears when hovering over a control.
 | Separator           | Adds a visual horizontal or vertical divider line in layouts.
 | ScrollBar           | Adds scrollbars for large content areas.
 | ScrollPane          | A layout container that adds scrolling capability to any content.
 | ImageView           | Used to display an image inside the scene.
 | Canvas              | A blank drawing surface where you can draw shapes, lines, etc.
 | WebView             | A built-in web browser component for displaying HTML content.

 These can be added to your app just like basic controls, often needing slight adjustments to layout or containers.

 You can experiment with them gradually to build more interactive and feature-rich interfaces!
*/