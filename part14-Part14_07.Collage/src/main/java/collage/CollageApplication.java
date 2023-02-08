package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        int yCoordinate = 0;
        while (yCoordinate < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = 1.0 - color.getRed();
                double green = 1.0 - color.getGreen();
                double blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();
                
                Color newColor = new Color(red, green, blue, opacity);

                imageWriter.setColor(xCoordinate, yCoordinate, newColor);

                xCoordinate++;
            }

            yCoordinate++;
        }

        ImageView image = new ImageView(targetImage);
        ImageView image2 = new ImageView(targetImage);
        ImageView image3 = new ImageView(targetImage);
        ImageView image4 = new ImageView(targetImage);
        
        Pane pane = new Pane();
        GridPane panes = new GridPane();
        
        image.setFitWidth(width/2);
        image.setFitHeight(height/2);
        image2.setFitWidth(width/2);
        image2.setFitHeight(height/2);
        image3.setFitWidth(width/2);
        image3.setFitHeight(height/2);
        image4.setFitWidth(width/2);
        image4.setFitHeight(height/2);
        
        pane.getChildren().add(panes);
        panes.add(image, 0, 0);
        panes.add(image2, 0, 1);
        panes.add(image3, 1, 0);
        panes.add(image4, 1, 1);
        

        
        
        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
