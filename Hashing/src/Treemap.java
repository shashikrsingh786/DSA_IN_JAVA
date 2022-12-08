import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();    // sort key alphabetically

        tm.put("shashi",12);
        tm.put("virat",33);
        tm.put("rohit",88);

        System.out.println(tm);

    }
}
