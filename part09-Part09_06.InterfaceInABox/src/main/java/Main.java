
public class Main {

    public static void main(String[] args) {
        Box bigBox = new Box(20);
        Box box = new Box(10);
        bigBox.add(box);
        box.add(new Book("Horstman", "Core Java", 5));
        System.out.println(bigBox.weight());
        
    }

}
