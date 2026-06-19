import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class GirdLayout extends Application{
    public void start(Stage primaryStage){
        primaryStage.setTitle("Grid Pane");

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");

        GridPane gridPane = new GridPane();
        gridPane.add(btn1, 20, 20);
        gridPane.add(btn2, 40, 40);
        gridPane.add(btn3, 60, 60);
        gridPane.add(btn4, 80, 80);
        //gridPane.getChildren().addAll(btn1, btn2, btn3, btn4);

        Scene scene = new Scene(gridPane,400,400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
