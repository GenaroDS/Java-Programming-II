
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName;
        String bookAge;
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            bookName = scanner.nextLine();
            if (bookName.equals("")) {
                break;
            }
            System.out.println("Input the age recommendatio: ");
            bookAge = scanner.nextLine();
            books.add(new Book(bookName, bookAge));

        }

        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
        books.stream().sorted()
                .forEach(v -> System.out.println(v));
        
    }

}

