import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.geometry.Pos;

public class JustSum extends Application{
    public void start(Stage primaryStage){
        primaryStage.setTitle("Add Two no.s");

        TextField num1 = new TextField();
        num1.setPromptText("Enter first number");
        num1.setPrefWidth(135);

        TextField num2 = new TextField();
        num2.setPromptText("Enter second number");
        num2.setPrefWidth(135);

        TextField result = new TextField();
        result.setPromptText("Result");
        result.setEditable(false);
        result.setPrefWidth(135);

        Label plusLabel = new Label(" + ");

        Button equalsButton = new Button("=");
        equalsButton.setDefaultButton(true);

        equalsButton.setOnAction(e->{
           try{
               int a = Integer.parseInt(num1.getText());
               int b = Integer.parseInt(num2.getText());
               int sum = a+b;
               result.setText(String.valueOf(sum));
           } catch(NumberFormatException ex){
//               Alert alert = new Alert(AlertType.ERROR);
//               alert.setTitle("Invalid Input");
//               alert.setContentText("Please enter valid inputs");
//               alert.getDialogPane().setPrefHeight(5);
//               alert.getDialogPane().setPrefWidth(200);
//               alert.showAndWait(); // this should be called only after all things

               result.setText("Invalid Input");
           }
        });

        HBox hbox = new HBox(10);
        hbox.setStyle("-fx-padding: 10 20 10 20;-fx-background-color: #2e2e2e;"); // top rigth bottom left
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(num1, plusLabel, num2, equalsButton, result);

        num1.setStyle("-fx-text-fill: white; -fx-control-inner-background: #444; -fx-prompt-text-fill: gray;");
        num2.setStyle("-fx-text-fill: white; -fx-control-inner-background: #444; -fx-prompt-text-fill: gray;");
        result.setStyle("-fx-text-fill: white; -fx-control-inner-background: #444; -fx-prompt-text-fill: gray;");
        plusLabel.setStyle("-fx-text-fill: white;");
        equalsButton.setStyle("-fx-background-color: #555; -fx-text-fill: white;");

        Scene scene = new Scene(hbox, 600, 50);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
