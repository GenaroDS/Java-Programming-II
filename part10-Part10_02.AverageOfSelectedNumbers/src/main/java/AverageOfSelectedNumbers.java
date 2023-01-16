
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        String input;
        // Write your program here
        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        input = scanner.nextLine();
        if (input.equals("p")) {
             double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(value -> value > 0)
                .average()
                .getAsDouble();
        System.out.println("average of the positive numbers: " + average);            
        }
        if (input.equals("n")) {
                         double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(value -> value < 0)
                .average()
                .getAsDouble();
        System.out.println("average of the negative numbers: " + average); 
        }
       

    }
}
