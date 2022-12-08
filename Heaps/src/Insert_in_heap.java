import java.util.ArrayList;

public class Insert_in_heap {
    public static void main(String[] args) {

        System.out.println("Hello");
        Heap h = new Heap();
        h.add(2);
        h.add(4);
        h.add(5);
        h.add(1);
        h.add(10);
    }
    public static class Heap {
            ArrayList<Integer> al = new ArrayList<>();
            // add data
            public void add(int data) {
                al.add(data);
                // fix tree
                int x = al.size() - 1;   // x is child index
                int parent = (x - 1) / 2;   // parent is parent index
                while (al.get(x)<al.get(parent)) {
                    // swap
                    int temp = al.get(x);
                    al.set(x, al.get(parent));
                    al.set(parent, temp);
                }
            }
        }
    }

     