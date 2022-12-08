import java.util.HashMap;
import java.util.Set;

public class Iterator_in_hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        // insert - o(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("America",90);

        Set<String> set = hm.keySet();

        for (String k : set) {
            System.out.println("key "+ k+" ,values "+ hm.get(k));
        }
    }
    
}
