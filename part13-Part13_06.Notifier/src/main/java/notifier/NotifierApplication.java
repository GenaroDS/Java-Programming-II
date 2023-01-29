package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox box = new VBox();
        TextField field = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        
            
        box.getChildren().add(field);
        box.getChildren().add(button);   
        box.getChildren().add(label);
        
        button.setOnAction((event) -> {
            label.setText(field.getText());
        });
        
        Scene view = new Scene(box, 100, 100);

        stage.setScene(view);
        stage.show();
        
    }

}
