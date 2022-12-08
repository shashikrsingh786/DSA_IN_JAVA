import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(1);

        System.out.println(set);
        System.out.println(set.size());


        if(set.contains(3)) {
            System.out.println("set contains number 3");
        }

        set.clear();
        if(set.isEmpty()) {
            System.out.println("Set is empty");
        }

    }
}
