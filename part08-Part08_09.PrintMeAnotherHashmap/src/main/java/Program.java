
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> map = new HashMap<>();
        map.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        map.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
        printValues(map);
        System.out.println("---");
        printValueIfNameContains(map, "prejud");
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book values : hashmap.values()) {
            System.out.println(values);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (String values : hashmap.keySet()) {
            if (hashmap.get(values).getName().toLowerCase().contains(text)) {
                System.out.println(hashmap.get(values));
            }
           
        }

    }
}


