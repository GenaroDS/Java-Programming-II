package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        System.out.println("Select a title:");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        Application.launch(Main.class,
                "--course=" + title + "");

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parameters params = getParameters();
        String course = params.getNamed().get("course");

        stage.setTitle(course);
        stage.show();
    }

}
