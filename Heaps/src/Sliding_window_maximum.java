import java.util.Arrays;
import java.util.PriorityQueue;

public class Sliding_window_maximum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        int size = arr.length;
        int[] res = new int[size-k+1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0;i<k;i++) {
            pq.add(new Pair(arr[i],i));
        }
        res[0] = pq.peek().number;

        for(int i = k;i<size;i++) {
            while(pq.size()>0 && pq.peek().idx<=(i-k)) {
                pq.remove();
            }
            pq.add(new Pair(arr[i],i));
            res[i-k+1] = pq.peek().number;
        }

        System.out.println(Arrays.toString(res));



    }
    public static  class Pair implements Comparable<Pair> {
        int number;
        int idx;

        Pair(int number, int idx) {
            this.number = number;
            this.idx  = idx;
        }

        @Override
        public int compareTo(Pair o) {
            return o.number-this.number;
        }
    }
}
