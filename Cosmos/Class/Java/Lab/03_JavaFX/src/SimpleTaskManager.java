import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SimpleTaskManager extends Application {

    private ObservableList<String> tasks = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) {
        // Title label
        Label titleLabel = new Label("Task Manager");
        titleLabel.setFont(Font.font("Arial", 24));
        titleLabel.setStyle("-fx-text-fill: #2c3e50;");

        // Input field
        TextField taskInput = new TextField();
        taskInput.setPromptText("Enter new task...");
        taskInput.setPrefWidth(300);

        // Add task button
        Button addButton = new Button("Add Task");
        addButton.setStyle("-fx-background-color: #2980b9; -fx-text-fill: white;");
        addButton.setOnAction(e -> {
            String task = taskInput.getText().trim();
            if (!task.isEmpty()) {
                tasks.add(task);
                taskInput.clear();
            }
        });

        // HBox for input and button
        HBox inputBox = new HBox(10, taskInput, addButton);
        inputBox.setAlignment(Pos.CENTER);

        // List view of tasks
        ListView<String> taskListView = new ListView<>(tasks);
        taskListView.setPrefHeight(200);

        // Main layout
        VBox root = new VBox(20, titleLabel, inputBox, taskListView);
        root.setPadding(new Insets(30));
        root.setStyle("-fx-background-color: #ecf0f1;");

        // Scene and stage setup
        Scene scene = new Scene(root, 400, 350);

        primaryStage.setTitle("Simple Task Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}