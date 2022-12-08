import java.util.Stack;

public class Queue_using_two_stack {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // is empty
        static boolean isEmpty() {
            return s1.isEmpty();
        }
        // to add
        static void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        // to remove
        static int remove() {
            return s1.pop();
        }
        static int peek() {
            return s1.peek();
        }
    }
}
