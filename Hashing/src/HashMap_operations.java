import java.util.HashMap;

public class HashMap_operations {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        // insert - o(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("America",90);
        System.out.println(hm);
        System.out.println();

        // get - O(1)
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Indonesia"));
        System.out.println();

        // contains key - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Sri Lanka"));
        System.out.println();

        // remove - O(1)
        System.out.println(hm.remove("India"));    // return value of key
        System.out.println(hm);
        System.out.println();

        // size
        System.out.println(hm.size());

        System.out.println(hm.keySet());

        // is empty
        hm.clear();
        System.out.println(hm.isEmpty());


     }
}
