
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
        this.random = new Random();
        // Initialize the value of numberOfFaces here
    }

    public int throwDie() {
        // generate a random number which may be any number
        // between one and the number of faces, and then return it
        return this.random.nextInt(this.numberOfFaces) +1;
    }
}
