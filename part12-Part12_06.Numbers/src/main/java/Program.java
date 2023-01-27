
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers;
        Random random = new Random();
        while (true) {
            System.out.println("How many random numbers should be printed?");
            numbers = Integer.valueOf(scanner.nextLine());
            for (int i = 0; i < numbers ; i++){
                System.out.println(random.nextInt(11));
            }
            
        }
    }

}
