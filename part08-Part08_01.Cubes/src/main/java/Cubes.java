
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        String input;
        int number;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        while (!(input.equals("end"))) {
            number = Integer.valueOf(input);
            System.out.println(number * number * number);
            input = scanner.nextLine();
        }

    }
}
