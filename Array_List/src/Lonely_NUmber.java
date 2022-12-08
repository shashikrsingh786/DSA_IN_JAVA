import java.util.ArrayList;
import java.util.Collections;

public class Lonely_NUmber {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(6);
        al.add(5);
        al.add(8);
        ArrayList<Integer> lone = new ArrayList<>();
        Collections.sort(al);

        if (al.size() == 1) {           // if only single element exist
            lone.add(al.get(0));
            System.out.println(lone);
        } else {
            for (int i = 1; i < al.size() - 1; i++) {
                if (al.get(i) > al.get(i - 1) + 1 && al.get(i) < al.get(i + 1) - 1) {     // for i = 1 to size-1
                    lone.add(al.get(i));
                }
            }
            if (al.get(0)<al.get(1)-1) {
                lone.add(al.get(0));
            }
            if(al.get(al.size()-1)>al.get(al.size()-2)+1) {
                lone.add(al.get(al.size()-1));
            }
            System.out.println(lone);
        }
    }
}
