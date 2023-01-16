
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get("file.txt")).forEach(row -> rows.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
