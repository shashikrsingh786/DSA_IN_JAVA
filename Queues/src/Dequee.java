import java.util.*;
public class Dequee {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(4);
        System.out.println(deque);
    }
}
