import java.util.PriorityQueue;

public class Priority_Queue_implementation {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // by default priority is ascending
        // to convert in descending priority
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder();
        pq.add(2);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek()+" ");
            pq.remove();
        }
    }
}
