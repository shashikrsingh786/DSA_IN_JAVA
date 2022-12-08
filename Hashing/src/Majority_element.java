import java.util.*;

public class Majority_element {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,1,3,1,5,1};
        float n = (float)arr.length/3;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int j : arr) {
            if (hm.containsKey(j)) {
                hm.put(j, hm.get(j) + 1);
            } else {
                hm.put(j, 1);
            }

            // shortcut for upper addition code
          //   hm.put(j,hm.getOrDefault(j,0)+1);

        }
        Set<Integer> set = hm.keySet();

        for (Integer key: set ) {
            if(hm.get(key)>n) {
                System.out.print(key+" ");
        }
        }
    }
}
