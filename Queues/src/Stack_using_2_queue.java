import java.util.*;

public class Stack_using_2_queue {
    public static void main(String[] args) {
            Stack s1 = new Stack();
            s1.push(1);
            s1.push(2);
            s1.push(3);
            s1.push(4);
        System.out.println("peek is :" + s1.peek());
        while(!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
    public static class QueueB {
        public static class Stack {
            static Queue<Integer> q1 = new LinkedList<>();
            static Queue<Integer> q2 = new LinkedList<>();

            // is empty
            static boolean isEmpty() {
                return q1.isEmpty() && q2.isEmpty();
            }
            // push
            static void push(int data) {
                if(!q1.isEmpty()) {
                    q1.add(data);
                }
                else {
                    q2.add(data);
                }
            }
            // pop
            static int pop() {
                if (isEmpty()) System.out.println("stack is empty");
                int top = -1;
                // case 1 : element in q1
                if (!q1.isEmpty()) {
                    while (!q1.isEmpty()) {
                        top = q1.remove();
                        if (q1.isEmpty()) {
                            break;
                        }
                        q2.add(top);
                    }
                }
                // case 2 : element in q2
                    else {
                        while(!q2.isEmpty()) {
                            top = q2.remove();
                            if(q2.isEmpty()) {
                                break;
                            }
                            q1.add(top);
                        }
                    }

                return top;
            }
            static int peek() {
                if (isEmpty()) System.out.println("stack is empty");
                int top = -1;
                // case 1 : element in q1
                if (!q1.isEmpty()) {
                    while (!q1.isEmpty()) {
                        top = q1.remove();
                        q2.add(top);
                    }
                }
                else {
                    while(!q2.isEmpty()) {
                        top = q2.remove();
                        q1.add(top);
                    }
                }

                return top;
            }

        }
    }
}
