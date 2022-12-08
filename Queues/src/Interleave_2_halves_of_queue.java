import java.util.*;

public class Interleave_2_halves_of_queue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
        interleave(q1);
    }
    public static void interleave(Queue<Integer> q1) {
        Queue<Integer> first = new LinkedList<>();
        int size = q1.size();
        while(!(q1.size()==(size/2))) {
            first.add(q1.remove());
        }
        while(!first.isEmpty()) {
            q1.add(first.remove());
            q1.add(q1.remove());
        }
        while(!q1.isEmpty())  {
            System.out.print(q1.remove()+" ");
        }
    }

     }
