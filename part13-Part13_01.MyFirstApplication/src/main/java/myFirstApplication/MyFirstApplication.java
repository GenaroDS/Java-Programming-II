package myFirstApplication;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstApplication extends Application {

    @Override
    public void start(Stage window) throws Exception{
        window.setTitle("My first application");
        window.show();
    }

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
    }

}
