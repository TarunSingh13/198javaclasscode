package TreeMap;
import java.util.TreeMap;
public class treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tmap = new TreeMap<>();
        tmap.put("apple", 1);
        tmap.put("banana", 2);
        tmap.put("apple", 3);
        tmap.put("cherry", 4);
        tmap.put( "banana", 5);
        tmap.put("apple", 6);
        System.out.println(tmap);
    }
}
