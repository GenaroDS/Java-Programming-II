
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;
        int startIndex = fromWhere;
        int endIndex = toWhere;
        if (fromWhere < 0) {
            startIndex = 0;
        }
        if (toWhere > array.length) {
            endIndex = array.length;
        }
        while (startIndex < endIndex) {
            if (array[startIndex] <= largest && array[startIndex] >= smallest) {

                sum += array[startIndex];
            }
            startIndex++;
        }
        return sum;
    }

}
