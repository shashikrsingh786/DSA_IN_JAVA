import java.util.*;
public class LinkedhashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("shashi",12);
        lhm.put("adarsh",43);
        lhm.put("ishaan",98);

        System.out.println(lhm);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("shashi",12);
        hm.put("adarsh",43);
        hm.put("ishaan",98);

        System.out.println(hm);
    }
    
}
