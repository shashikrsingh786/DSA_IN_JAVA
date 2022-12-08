import java.util.*;

public class Treeset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Shashi");
        set.add("Virat");
        set.add("Rohit");
        set.add("rassie van der dussen");

        LinkedHashSet<String> lset = new LinkedHashSet<>();
        lset.add("Shashi");
        lset.add("Virat");
        lset.add("Rohit");
        lset.add("rassie van der dussen");

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Shashi");
        ts.add("Virat");
        ts.add("Rohit");
        ts.add("rassie van der dussen");

        System.out.println(set);
        System.out.println();
        System.out.println(lset);
        System.out.println();
        System.out.println(ts);




    }
}
