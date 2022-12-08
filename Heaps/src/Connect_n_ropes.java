import java.util.PriorityQueue;

public class Connect_n_ropes {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(3);
        pq.add(6);

        int sum = 0;

        while(!pq.isEmpty()) {
            int a = pq.remove();
            int b = pq.remove();
            int connect_cost = a+b;
            sum+=a+b;
            // to stop from continuing with one element
            if(pq.isEmpty()) break;
            pq.add(connect_cost);
        }
        System.out.println("Minimum sum is:" + sum);
    }
}
