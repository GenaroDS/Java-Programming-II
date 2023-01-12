
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int amount = 0;
        while(true){
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            if (Integer.valueOf(input) > 0) {
                sum += Integer.valueOf(input);
                amount++;
            }
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double total = (double) sum/amount;
            System.out.println("The average is " + total);            
        }
    }
}
