package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {

        Button firstButton = new Button("To the second view!");
        Button secondButton = new Button("To the third view!");
        Button thirdButton = new Button("To the first view!");

        Label firstLabel = new Label("Frist view!");
        Label secondLabel = new Label("Second view!");
        Label thirdLabel = new Label("Third view!");

        BorderPane firstPane = new BorderPane();
        firstPane.setTop(firstLabel);
        firstPane.setCenter(firstButton);

        VBox secondBox = new VBox();
        secondBox.getChildren().add(secondButton);
        secondBox.getChildren().add(secondLabel);
        
        
        GridPane thirdPane = new GridPane();
        thirdPane.add(thirdLabel, 0 ,0);
        thirdPane.add(thirdButton, 1 ,1);

        Scene first = new Scene(firstPane);
        Scene second = new Scene(secondBox);
        Scene third = new Scene(thirdPane);

        firstButton.setOnAction((event) -> {
            window.setScene(second);
        });
        
        secondButton.setOnAction((event) -> {
            window.setScene(third);
        });
        
        thirdButton.setOnAction((event) -> {
            window.setScene(first);
        });
        

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}
