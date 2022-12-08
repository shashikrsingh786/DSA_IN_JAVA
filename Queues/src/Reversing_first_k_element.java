import java.util.*;

public class Reversing_first_k_element {
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
        int k= 4;
        int sq = k;
        int size = q1.size();
        Stack<Integer> s = new Stack<>();
        while(k>0) {
            s.push(q1.remove());
            k--;
        }
        while(!s.isEmpty()) {
            q1.add(s.pop());
        }
        for(int i = sq;i<size;i++) {
            int front = q1.remove();
            q1.add(front);
        }
        while(!q1.isEmpty())  {
            System.out.print(q1.remove()+" ");
        }


    }
}
