import java.util.*;

public class Queue_using_jcf {
    public static void main(String[] args) {
        Queue<Integer> s = new LinkedList<>(); // can also use arraydeque
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    }
}
