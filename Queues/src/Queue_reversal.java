import java.util.*;

public class Queue_reversal {
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
        Stack<Integer> s = new Stack<>();
        while(!q1.isEmpty()) {
            s.push(q1.remove());
        }
        while(!s.isEmpty()) {
            q1.add(s.pop());
        }
        while(!q1.isEmpty())  {
            System.out.print(q1.remove()+" ");
        }
    }
}
