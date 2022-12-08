import java.util.ArrayList;

public class Delete_in_Heap {
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(2);
        h.add(4);
        h.add(5);
        h.add(1);
        h.add(10);
        h.print();
        System.out.println(h.remove());
        h.print();

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
        public void print() {
            System.out.println(al);
        }
        public int remove() {
            int data = al.get(al.size()-1);
            // swap first and last node
            int temp = al.get(0);
            al.set(0,al.get(al.size()-1));
            al.set(al.size()-1,temp);
            // remove last node
            al.remove(al.size()-1);
            //fix heap
            heapify(0,al.size());
            return data;
        }
        private void heapify(int i,int size) {
            int minidx = i;
            int left = 2*i+1;
            int right = 2*i+2;

            if(left<size && al.get(left)<al.get(minidx)) {
                minidx=left;
            }
            if(right <size && al.get(right)<al.get(minidx)) {
                minidx=right;
            }
            if(minidx!=i) {
                // swap
                int temp = al.get(i);
                al.set(i,al.get(minidx));
                al.set(minidx,temp);

                heapify(minidx,size);
            }
        }
    }
}
