import java.util.HashSet;
import java.util.Iterator;

public class Iterator_on_hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Shashi");
        set.add("Virat");
        set.add("Rohit");
        set.add("rassie van der dussen");

        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

//        for (String s : set) {
//            System.out.println(s);
//        }
    }
}
