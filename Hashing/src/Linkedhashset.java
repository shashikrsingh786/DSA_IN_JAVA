import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Shashi");
        set.add("Virat");
        set.add("Rohit");
        set.add("rassie van der dussen");

        for(String s : set) {
            System.out.println(s);
        }

    }
}
