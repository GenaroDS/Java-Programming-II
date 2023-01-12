
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String,String> maps = new HashMap<>();
        maps.put("matthew", "matt");
        maps.put("michael", "mix");
        maps.put("arthur", "artie");
        System.out.println(maps.get("matthew"));
    }

}
