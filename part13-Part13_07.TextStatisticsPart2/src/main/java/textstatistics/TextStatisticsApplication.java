package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        TextArea field = new TextArea();
        pane.setCenter(field);
        
        HBox box = new HBox();
        box.setSpacing(10);
        
        
        
        Label longestLabel = new Label("The longest word is: ");
        Label wordsLabel = new Label("Words: 0");
        Label lettersLabel = new Label("Letters: 0");
                    

        box.getChildren().add(lettersLabel);
        box.getChildren().add(wordsLabel);
        box.getChildren().add(longestLabel);
        
        pane.setBottom(box);
        

        field.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            // set values of text elements
            lettersLabel.setText(String.valueOf("Letters: " + characters));
            wordsLabel.setText(String.valueOf("Words: " + words));
            longestLabel.setText("The longest word is: " + longest);

        });

        Scene view = new Scene(pane, 500, 500);

        stage.setScene(view);
        stage.show();

    }

}
